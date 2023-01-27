// Define a grammar called Hello
grammar IP_Adress;

checkip: expr EOF;

expr: Octet '.' Octet '.' Octet '.' Octet;

Newline : [\r\n]+ -> skip;
Octet
    : [0-1] Digit Digit 
    | [2] [0-4] [0-9]
    | [2] [5] [0-5]
    | Digit Digit
    | Digit
    ; 

Digit: '0'..'9';
