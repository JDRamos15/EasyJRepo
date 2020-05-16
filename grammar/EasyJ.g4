grammar EasyJ;

//Parser rules
//GRAMMAR RULES


literal
	:	IntegerLiteral		
	|	CharacterLiteral
	|	StringLiteral
	|	NullLiteral
	;
	

methodName
	:	Identifier
	;	



//Lexer rules
//Tokens = identifier | keyword(Reserved words) | spreparator | operator | literal | comment


LOOP : 'loop' ;
FROM : 'from' ;
TO : 'to' ;
REVERSE : 'reverse' ;
DISPLAY : 'display' ;
FUNCTION : 'function' ;
CLASS : 'class';
FOR : 'for';
PUBLIC : 'public';
RETURN : 'return';
VOID : 'void';


/************ For Literal ********************/



IntegerLiteral	:	DecimalIntegerLiteral	;

fragment DecimalIntegerLiteral	:	DecimalNumeral IntegerTypeSuffix?	;


fragment IntegerTypeSuffix	:	[lL]	;

fragment DecimalNumeral 	:	'0'	|	NonZeroDigit (Digits? | Underscores Digits)	;

fragment Digits	:	Digit (DigitsAndUnderscores? Digit)?	;

fragment Digit	:	'0'	|	NonZeroDigit	;

fragment NonZeroDigit	:	[1-9]	;

fragment DigitsAndUnderscores	:	DigitOrUnderscore+	;

fragment DigitOrUnderscore	:	Digit	|	'_' 	;

fragment Underscores	:	'_'+	;





CharacterLiteral	:	'\'' SingleCharacter '\''	|	'\'' EscapeSequence '\''	;

fragment
SingleCharacter
	:	~['\\\r\n]
	;
	
	
	

StringLiteral	:	'"' StringCharacters? '"'	;

fragment StringCharacters	:	StringCharacter+	;
	
fragment StringCharacter	:	~["\\\r\n]	|	EscapeSequence	;
	
	
fragment
EscapeSequence
	:	'\\' [btnfr"'\\]
	;	
	


NullLiteral	:	'null'	;


SEPARATOR : ';'|','|'.'|'('|')'|'{'|'}'|'['|']' ;

OPERATOR : '>'|'<'|'!'|'~'|'?'|':'|'=='|'<='|'>='|'!='|'&&'|'|'|'++'|'--'|'+'|'-'|'*'|'/'|'&'|'^'|'%';



/************** For Identifier ***************/


//Identifiers (must appear after all keywords in the grammar)

Identifier	:	IdentifierStart IdentifierPart*	;


fragment IdentifierStart	: 	;

fragment IdentifierPart	: IdentifierStart		;


// Whitespace and comments


WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;