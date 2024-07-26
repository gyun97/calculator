package calculator;


public enum OperatorType {

    ADDITION('+'),
    SUBTRACTION('-'),
    MULTIPLICATION('*'),
    DIVISION('/'),
    MODULO('%');


    private final char symbol;

    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    public static OperatorType fromSymbol(char symbol) {
        for (OperatorType operatorType : OperatorType.values()) {
            if (operatorType.symbol == symbol) {
                return operatorType;
            }
        }
        throw new IllegalArgumentException("유효한 연산자를 입력해주세요");
    }


}
