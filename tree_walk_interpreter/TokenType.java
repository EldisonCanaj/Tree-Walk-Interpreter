package tree_walk_interpreter;

enum TokenType {
    // Single-character tokens.
    LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE, COMMA, DOT, MINUS, PLUS, SEMICOLON, SLASH, STAR, MODULO, 

    // One or two character tokens.
    BANG, BANG_EQUAL, EQUAL, EQUAL_EQUAL, GREATER, GREATER_EQUAL, LESS, LESS_EQUAL, 

    // Literals.
    IDENTIFIER, STRING, NUMBER, 

    // Keywords.
    AND, CLASS, ELSE, FALSE, FUN, FOR, IF, NOLL, OR, PRINT, RETURN, SUPER, THIS, TRUE, VAR, WHILE,

    // End of File
    EOF
}
