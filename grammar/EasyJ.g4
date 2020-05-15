grammar EasyJ;


//Parser rules
//GRAMMAR RULES


/************** For Identifier ***************/

idstart : LOWERCASE | UPPERCASE |'$'|'_';

alphabetic : LOWERCASE | UPPERCASE;
fragment LOWERCASE : [a-z] ;
fragment UPPERCASE : [A-Z] ;


/************ For Literal ********************/

//integerliteral : DECIMALNUMERAL;
//fragment DECIMALNUMERAL : NUMERIC[DIGITS];
//fragment DIGITS : DIGITS{DIGIT} ;
//fragment DIGIT : NUMERIC ;


//booleanliteral : 'true' | 'false'; 

//characterliteral : graphic 'space' | escapesequence;

//stringliteral : {graphic | special | escapesequence } ;
//graphic : {alphanumeric} | special ;
//alphanumeric : {alphabetic} | NUMERIC ;
//special : '!'|'%'|'^'|'&'|'*'|'('|')'|'-'|'+'|'='|'{'|'}'|'|'|'~'|'['|']'|';'|':'|'"'|'<'|'>'|'?'|','|'.'|'/'|'#'|'@'|'`'|' ' ;
//escapesequence  : '\n'|'\t'|'\b'|'\r'|'\f'|'\\'|'\'' ;

nullliteral : 'null' ;



//Lexer rules
//Tokens = identifier | keyword(Reserved words) | spreparator | operator | literal | comment

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

NUMERIC : [0-9];

//IDENTIFIER : [{idstart} {idstart | NUMERIC} ];


KEYWORDS : 'loop' | 'from' | 'to' | 'reverse' | 'display' | 'function' ; 


SEPARATOR : ';'|','|'.'|'('|')'|'{'|'}'|'['|']' ;


OPERATOR : '>'|'<'|'!'|'~'|'?'|':'|'=='|'<='|'>='|'!='|'&&'|'|'|'++'|'--'|'+'|'-'|'*'|'/'|'&'|'^'|'%'|'<<'|'>>'|'>>>'|'+='|'-='|'*='|'/='|'&='|'|='|'^='|'%='|'<<='|'>>='|'>>=';

LITERAL : 'integerliteral' ;
// | {booleanliteral} | {characterliteral} |  {stringliteral} | {nullliteral};



