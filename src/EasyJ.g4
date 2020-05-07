grammar EasyJ;


//Parser rules
//GRAMMAR RULES


/************** For Identifier ***************/

//idstart : alphabetic|'$'|'_';

//alphabetic : lowercase|uppercase;
//lowercase : 'a'|'b'|'c'|'d'|'e'|'f'|'g'|'h'|'i'|'j'|'k'|'l'|'m'|'n'|'o'|'p'|'q'|'r'|'s'|'t'|'u'|'v'|'w'|'x'|'y'|'z';
//uppercase : 'A'|'B'|'C'|'D'|'E'|'F'|'G'|'H'|'I'|'J'|'K'|'L'|'M'|'N'|'O'|'P'|'Q'|'R'|'S'|'T'|'U'|'V'|'W'|'X'|'Y'|'Z';


/************ For Literal ********************/

//integerliteral : DECIMALNUMERAL;
//DECIMALNUMERAL : NUMERIC[digits];
//digits : digit{digit} ;
//digit : NUMERIC ;

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

//IDENTIFIER : {idstart} {idstart|NUMERIC} ;

//KEYWORDS :

SEPARATOR : ';'|','|'.'|'('|')'|'{'|'}'|'['|']' ;

OPERATOR : '>'|'<'|'!'|'~'|'?'|':'|'=='|'<='|'>='|'!='|'&&'|'|'|'++'|'--'|'+'|'-'|'*'|'/'|'&'|'^'|'%'|'<<'
|'>>'|'>>>'|'+='|'-='|'*='|'/='|'&='|'|='|'^='|'%='|'<<='|'>>='|'>>=';

//LITERAL : {integerliteral} | {booleanliteral} | {characterliteral} |  {stringliteral} | {nullliteral};

