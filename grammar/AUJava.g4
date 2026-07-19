grammar AUJava;

program : EOF ;

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