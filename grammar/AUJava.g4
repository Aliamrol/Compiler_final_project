grammar AUJava;

// --- Parser Rules ---

program : classDeclaration* EOF ;

classDeclaration
    : PUBLIC CLASS ID LBRACE mainMethod RBRACE
    | CLASS ID (EXTENDS ID)? LBRACE classMember* RBRACE
    ;

mainMethod
    : PUBLIC STATIC VOID MAIN LPAREN STRING LBRACK RBRACK ID RPAREN LBRACE statement* RBRACE
    ;

classMember
    : type ID SEMI                                                  # fieldDeclaration
    | type ID LPAREN parameterList? RPAREN LBRACE statement* RBRACE # methodDeclaration
    ;

parameterList
    : type ID (COMMA type ID)*
    ;

type
    : INT
    | BOOLEAN
    | ID
    ;

statement
    : LBRACE statement* RBRACE                                      # blockStatement
    | type ID ASSIGN expression SEMI                                # varDeclarationAssign
    | type ID SEMI                                                  # varDeclaration
    | expression ASSIGN expression SEMI                             # assignStatement
    | IF LPAREN expression RPAREN statement (ELSE statement)?       # ifStatement
    | WHILE LPAREN expression RPAREN statement                      # whileStatement
    | PRINTLN LPAREN expression RPAREN SEMI                         # printStatement
    | RETURN expression? SEMI                                       # returnStatement
    | BREAK SEMI                                                    # breakStatement
    | CONTINUE SEMI                                                 # continueStatement
    | expression SEMI                                               # exprStatement
    ;

expression
    // 1. Parentheses have the highest precedence
    : LPAREN expression RPAREN                                      # parenExpr
    
    // 2. Member access and method calls
    | expression DOT ID LPAREN argumentList? RPAREN                 # methodCallExpr
    | expression DOT ID                                             # fieldAccessExpr
    | ID LPAREN argumentList? RPAREN                                # simpleMethodCallExpr
    
    // 3. Unary operations
    | NOT expression                                                # notExpr
    
    // 4. Arithmetic operations (Multiplication/Division before Addition/Subtraction)
    | expression (MULT | DIV) expression                            # mulDivExpr
    | expression (PLUS | MINUS) expression                          # addSubExpr
    
    // 5. Relational and Equality operations
    | expression (LT | GT | LTE | GTE) expression                   # relationalExpr
    | expression (EQ | NEQ) expression                              # equalityExpr
    
    // 6. Logical operations (AND before OR)
    | expression AND expression                                     # andExpr
    | expression OR expression                                      # orExpr
    
    // 7. Atomic expressions (Order does not matter for these)
    | NEW ID LPAREN RPAREN                                          # newObjectExpr
    | THIS                                                          # thisExpr
    | ID                                                            # idExpr
    | INT_LITERAL                                                   # intExpr
    | TRUE                                                          # trueExpr
    | FALSE                                                         # falseExpr
    ;

argumentList
    : expression (COMMA expression)*
    ;
//Lexer Rules

// Keywords
CLASS : 'class';
PUBLIC : 'public';
STATIC : 'static';
VOID : 'void';
MAIN : 'main';
STRING : 'String';
EXTENDS : 'extends';
RETURN : 'return';
INT : 'int';
BOOLEAN : 'boolean';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
CONTINUE : 'continue';
BREAK : 'break';
NEW : 'new';
THIS : 'this';
PRINTLN : 'System.out.println';

// Boolean Literals
TRUE : 'true';
FALSE : 'false';

// Operators and Punctuations
ASSIGN : '=';
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
EQ : '==';
NEQ : '!=';
LT : '<';
GT : '>';
LTE : '<=';
GTE : '>=';
AND : '&&';
OR : '||';
NOT : '!';

LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';
SEMI : ';';
COMMA : ',';
DOT : '.';

// Identifiers and Literals
ID : [a-zA-Z_][a-zA-Z0-9_]*;
INT_LITERAL : [0-9]+;

// Whitespace and Comments
WS : [ \t\r\n]+ -> skip;
LINE_COMMENT : '//' ~[\r\n]* -> skip;
BLOCK_COMMENT : '/*' .*? '*/' -> skip;