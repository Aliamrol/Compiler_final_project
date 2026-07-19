package semantic;

import parser.grammar.AUJavaBaseVisitor;
import parser.grammar.AUJavaParser;
import org.antlr.v4.runtime.Token;

public class SemanticAnalyzer extends AUJavaBaseVisitor<Type> {
    private SymbolTable symbolTable;
    
    private int loopDepth = 0;

    public SemanticAnalyzer() {
        this.symbolTable = new SymbolTable();
    }

    private void reportError(Token token, String message) {
        int line = token.getLine();
        int col = token.getCharPositionInLine();
        System.err.println("Semantic Error at line " + line + ":" + col + " - " + message);
    }

    @Override
    public Type visitProgram(AUJavaParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public Type visitClassDeclaration(AUJavaParser.ClassDeclarationContext ctx) {
        String className = ctx.ID(0).getText();
        
        if (symbolTable.getCurrentScope().resolve(className) != null) {
            reportError(ctx.ID(0).getSymbol(), "Class '" + className + "' is already defined.");
        } else {
            ClassSymbol classSymbol = new ClassSymbol(className, symbolTable.getCurrentScope());
            symbolTable.getCurrentScope().define(classSymbol);
        }

        symbolTable.pushScope("class_" + className);
        super.visitClassDeclaration(ctx);
        symbolTable.popScope();

        return Type.VOID;
    }

    @Override
    public Type visitMethodDeclaration(AUJavaParser.MethodDeclarationContext ctx) {
        String methodName = ctx.ID().getText();

        if (symbolTable.getCurrentScope().resolve(methodName) != null) {
            reportError(ctx.ID().getSymbol(), "Method '" + methodName + "' is already defined in this scope.");
        } else {
            Type returnType = mapStringToType(ctx.type().getText());
            MethodSymbol methodSymbol = new MethodSymbol(methodName, returnType);
            symbolTable.getCurrentScope().define(methodSymbol);
        }

        symbolTable.pushScope("method_" + methodName);
        super.visitMethodDeclaration(ctx);
        symbolTable.popScope();

        return Type.VOID;
    }

    @Override
    public Type visitVarDeclaration(AUJavaParser.VarDeclarationContext ctx) {
        String varName = ctx.ID().getText();
        
        if (symbolTable.getCurrentScope().resolve(varName) != null && 
            symbolTable.getCurrentScope().resolve(varName).getType() != Type.CLASS) {
            reportError(ctx.ID().getSymbol(), "Variable '" + varName + "' is already defined.");
        } else {
            Type varType = mapStringToType(ctx.type().getText());
            VariableSymbol varSymbol = new VariableSymbol(varName, varType);
            symbolTable.getCurrentScope().define(varSymbol);
        }
        
        return Type.VOID;
    }

    @Override
    public Type visitVarDeclarationAssign(AUJavaParser.VarDeclarationAssignContext ctx) {
        String varName = ctx.ID().getText();
        Type varType = mapStringToType(ctx.type().getText());
        
        if (symbolTable.getCurrentScope().resolve(varName) != null && 
            symbolTable.getCurrentScope().resolve(varName).getType() != Type.CLASS) {
            reportError(ctx.ID().getSymbol(), "Variable '" + varName + "' is already defined.");
        } else {
            VariableSymbol varSymbol = new VariableSymbol(varName, varType);
            symbolTable.getCurrentScope().define(varSymbol);
            
            Type rhsType = visit(ctx.expression());
            if (rhsType != null && rhsType != Type.NULL && varType != rhsType) {
                reportError(ctx.ASSIGN().getSymbol(), "Type mismatch: cannot convert from " + rhsType + " to " + varType);
            }
        }
        
        return Type.VOID;
    }

    @Override
    public Type visitAssignStatement(AUJavaParser.AssignStatementContext ctx) {
        Type lhsType = visit(ctx.expression(0));
        Type rhsType = visit(ctx.expression(1));
        
        if (lhsType != null && rhsType != null && lhsType != Type.NULL && rhsType != Type.NULL) {
            if (lhsType != rhsType) {
                reportError(ctx.ASSIGN().getSymbol(), "Type mismatch: cannot convert from " + rhsType + " to " + lhsType);
            }
        }
        return Type.VOID;
    }


    @Override
    public Type visitWhileStatement(AUJavaParser.WhileStatementContext ctx) {
        loopDepth++;
        super.visitWhileStatement(ctx);
        loopDepth--;
        return Type.VOID;
    }

    @Override
    public Type visitBreakStatement(AUJavaParser.BreakStatementContext ctx) {
        if (loopDepth == 0) {
            reportError(ctx.BREAK().getSymbol(), "'break' statement must be inside a loop.");
        }
        return Type.VOID;
    }

    @Override
    public Type visitContinueStatement(AUJavaParser.ContinueStatementContext ctx) {
        if (loopDepth == 0) {
            reportError(ctx.CONTINUE().getSymbol(), "'continue' statement must be inside a loop.");
        }
        return Type.VOID;
    }


    @Override
    public Type visitIdExpr(AUJavaParser.IdExprContext ctx) {
        String varName = ctx.ID().getText();
        Symbol symbol = symbolTable.getCurrentScope().resolve(varName);
        
        if (symbol == null) {
            reportError(ctx.ID().getSymbol(), "Variable '" + varName + "' is not defined.");
            return Type.NULL;
        }
        return symbol.getType();
    }

    @Override
    public Type visitIntExpr(AUJavaParser.IntExprContext ctx) {
        return Type.INT;
    }

    @Override
    public Type visitTrueExpr(AUJavaParser.TrueExprContext ctx) {
        return Type.BOOLEAN;
    }

    @Override
    public Type visitFalseExpr(AUJavaParser.FalseExprContext ctx) {
        return Type.BOOLEAN;
    }

    private Type mapStringToType(String typeStr) {
        switch (typeStr) {
            case "int": return Type.INT;
            case "boolean": return Type.BOOLEAN;
            default: return Type.CLASS;
        }
    }
}