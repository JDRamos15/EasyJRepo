grammar EasyJ;
program   : 'begin' statement+ 'end';

statement : assign | add | print ;

assign    : 'let' ID 'be' (NUMBER | ID) ;
print     : 'print' (NUMBER | ID) ;
add       : 'add' (NUMBER | ID) 'to' ID ;

ID     : [a-z]+ ;
OPERATOR: '>'|'<'|'!'|'~'|'?'|':'|'=='|'<='|'>='|'!='|'&&'|'|'|'++'|'--'|'+'|'-'|'*'|'/'|'&'|'^'|'%'|'<<'|'>>'|'>>>'|'+='|'-='|'*='|'/='|'&='|'|='|'^='|'%='|'<<='|'>>='|'>>=';
NUMBER : [0-9]+ ;
KEYWORD : 'abstract'|'continue'|
          'goto'|'package'|'switch'
          |'assert'|'default'|'if'|
          'private'|'this'|'boolean'|
          'do'|'implements'|'protected'
          |'throw'|'break'|'double'
          |'import'|'public'|'throws'|
          'byte'|'else'|'instanceof'|
          'return'|'transient'|'case'|
          'extends'|'int'|'short'|'try'|
          'catch'|'final'|'interface'
          |'static'|'void'|'char'|'finally'
          |'long'|'strictfp'|'volatile'
          |'class'|'float'|'native'|
          'super'|'while'|'cons'|'for'|
          'new'|'synchronized';
SEPARATOR : ';'|','|'.'|'('|')'|'{'|'}'|'['|']' ;


WS     : [ \n\t]+ -> skip;