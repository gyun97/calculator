package calculator;

import error.MyArithmeticException;

public class DivideOperator {

    public int operate(int num1, int num2) throws MyArithmeticException {
        if (num2 == 0) {
            throw new MyArithmeticException("나눗셈 연산에서 분모(두번째 파라미터)에 0이 입력될 수 없습니다.");
        }
        return num1 / num2;
    }
}
