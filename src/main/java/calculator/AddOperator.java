package calculator;

public class AddOperator implements Operator{ // 추상화 (Lv 2 요구사항 10)

    @Override
    public int operate(int num1, int num2, char operator) {
        return num1 + num2;
    }
}
