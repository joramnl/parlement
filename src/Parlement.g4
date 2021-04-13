grammar Parlement;

program
    : ( statement | function )* EOF
    ;

statement
    : declaration
    | printStmt
    | ifStmt
    | assigment
    | loop
    | invokeFunction
    ;

assigment
    : IDENTIFIER ASSIGN expression
    ;

expression
    : '(' expression ')'                                    # ExParentheses     // Parentheses
    | left=expression MUL right=expression                  # ExMulOp           // Multiplication
    | left=expression DIV right=expression                  # ExDivOp           // Division
    | left=expression ADD right=expression                  # ExAddOp           // Addition
    | left=expression SUB right=expression                  # ExSubOp           // Subtraction
    | left=expression EQUAL right=expression                # ExEqualOp
    | left=expression NOTEQUAL right=expression             # ExNotEqualOp
    | left=expression GT right=expression                   # ExGreaterThanOp
    | left=expression LT right=expression                   # ExLessThanOp
    | left=expression AND right=expression                  # ExAndOp
    | left=expression OR right=expression                   # ExOrOp
    | invokeFunction                                        # ExInvokeFunction
    | IDENTIFIER                                            # ExIdentifier
    | INT                                                   # ExIntLiteral
    | STRING                                                # ExStrLiteral
    | BOOLEAN                                               # ExBoolLiteral
    ;

printStmt
    : 'WILLIE WIL JE DIT OPLEZEN ALSJEBLIEFT' expression
    ;

ifStmt
    : 'ALS' expression 'DAN' ifTrue=ifBlock ('ANDERS' ifFalse=ifBlock)?
    ;

ifBlock
    : statement
    | LEFT_CURLYBRACKET statement* RIGHT_CURLYBRACKET
    ;

loop
    : 'MARK RUTTE WIL JE DIT' times=expression 'KEER HERHALEN' content=statement* 'OKE STOP MAAR'
    ;

function
    : 'MOTIE' IDENTIFIER statement* 'OKE STOP MAAR'
    ;

invokeFunction
    : name=IDENTIFIER LEFT_PARENTHESES RIGHT_PARENTHESES
    ;

declaration
    : type=( T_INT | T_STRING | T_BOOLEAN ) IDENTIFIER (ASSIGN val=expression)?
    ;

// Datatypen
T_INT:                  'int';
T_STRING:               'string';
T_BOOLEAN:              'bool';

LEFT_PARENTHESES:       '(';
RIGHT_PARENTHESES:      ')';
LEFT_CURLYBRACKET:      '{';
RIGHT_CURLYBRACKET:     '}';

INT:                    '0'
   |                    [1-9][0-9]*
   ;

BOOLEAN
    :                   'true'
    |                   'false'
    |                   [0-1]
    ;

STRING:                 '"' ~('\n'|'\r')* '"';

// Operators
ADD:                    '+';
SUB:                    '-';
MUL:                    '*';
DIV:                    '/';
ASSIGN:                 '=';
GT:                     '>';
LT:                     '<';
EQUAL:                  '==';
NOTEQUAL:               '!=';
AND:                    '&&';
OR:                     '||';

IDENTIFIER:             [A-Za-z][A-Za-z0-9_]*;

// Whitespace, comments
WS:                     [\r\n\t ]+      -> channel(HIDDEN);
COMMENT:                '//' ~[\r\n]*   -> channel(HIDDEN);
BLOCK_COMMENT:          '/*' .*? '*/'   -> skip;
