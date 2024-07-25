package calculator;

import error.MyArithmeticException;

/**
 * LV 2 사칙연산을 수행하는 계산기 ArithmeticCalculator 클래스 생성
 * abstrac 클래스인 Calculatro 클래스 상속해서 abstrac 메서드인 calculate 오버라이딩
 * 요구사항 8
 */

public class ArithmeticCalculator extends Calculator {


    @Override
    public Integer calculate(int num1, int num2, char operator) throws MyArithmeticException {
        // 잘못된 사칙 연산 기호가 들어온 경우 경우 ArithmeticException 에러 발생 (Lv2 요구 사항 1)
        return switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    // 나눗셈에 분모가 0이 들어온 경우 MyArithmeticException 에러 발생 (Lv2 요구 사항 1)
                    throw new MyArithmeticException("나눗셈 연산에서 분모(두번째 파라미터)에 0이 입력될 수 없습니다.");
                }
                yield num1 / num2;
                // 나눗셈에 분모가 0이 들어온 경우 MyArithmeticException 에러 발생 (Lv2 요구 사항 1)
            }
            default -> throw new MyArithmeticException("올바른 사칙 연산 기호(+, -, *, /)를 입력해 주세요!");
        }; // switch문 종료
    }

    @Override
    Double calculateCircleArea(double radius) {
        throw new UnsupportedOperationException("이 메서드는 구현되지 않았습니다.");

    }
}
