package semantic;

import parser.grammar.AUJavaBaseVisitor;
import parser.grammar.AUJavaParser;
import org.antlr.v4.runtime.Token;

public class SemanticAnalyzer extends AUJavaBaseVisitor<Type> {
    private SymbolTable symbolTable;

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
        // Start traversing the program
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

        // Visit class members (fields, methods)
        super.visitClassDeclaration(ctx);

        // Pop the class scope
        symbolTable.popScope();

        return Type.VOID;
    }

    @Override
    public Type visitMethodDeclaration(AUJavaParser.MethodDeclarationContext ctx) {
        String methodName = ctx.ID().getText();

        if (symbolTable.getCurrentScope().resolve(methodName) != null) {
            reportError(ctx.ID().getSymbol(), "Method '" + methodName + "' is already defined in this scope.");
        } else {
            String typeStr = ctx.type().getText();
            Type returnType = mapStringToType(typeStr);
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

    private Type    mapStringToType(String typeStr) {
        switch (typeStr) {
            case "int": return Type.INT;
            case "boolean": return Type.BOOLEAN;
            default: return Type.CLASS; // If it's not int or boolean, it's a class type (ID)
        }
    }
}