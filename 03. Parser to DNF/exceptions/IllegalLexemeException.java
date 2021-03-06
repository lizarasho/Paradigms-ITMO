package exceptions;

public class IllegalLexemeException extends ParsingException {
    public IllegalLexemeException(String lexeme, String expression, int index) {
        super("Unknown lexeme '" + lexeme + "' at position " + (index + 1) + "\n" + expression
                + "\n" + getPosition(index, lexeme.length()));
    }
}
