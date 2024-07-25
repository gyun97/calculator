package calculator;

/**
 * LV 2 요구 사항 10
 */


public class ModOperator implements Operator {

    @Override
    public int operate(int num1, int num2, char operator) {
        return num1 % num2;
    }
}
