package calculator;

import error.MyArithmeticException;

import javax.swing.*;

/**
 * LV 2 사칙연산을 수행하는 계산기 ArithmeticCalculator 클래스 생성
 * abstrac 클래스인 Calculatro 클래스 상속해서 abstrac 메서드인 calculate 오버라이딩
 * 요구사항 8
 */

public class ArithmeticCalculator extends Calculator {


    Operator operator; // 인터페이스로 OCP 구현 (LV 2 요구 사항 10)

    /* 사칙 연산 기능 분산으로 SRP 구현( LV 2 요구 사항 9)*/
//    AddOperator addOperator;
//    SubtractOperator subtractOperator;
//    MultiplyOperator multiplyOperator;
//    DivideOperator divideOperator;


    @Override
    public Integer calculate(int num1, int num2, char operator) {


        // 잘못된 사칙 연산 기호가 들어온 경우 경우 ArithmeticException 에러 발생 (Lv2 요구 사항 1)
        // 사칙 연산 역할 각 연산 클래스로 역할 분할(LV 2 요구 사항 9)
        OperatorType operatorType = OperatorType.fromSymbol(operator);
        return switch (operatorType) {
            case ADDITION -> {
                AddOperator addOperator = new AddOperator();
                yield addOperator.operate(num1, num2, operator);
            }
            case SUBTRACTION -> {
                SubtractOperator subtractOperator = new SubtractOperator();
                yield subtractOperator.operate(num1, num2, operator);
            }
            case MULTIPLICATION -> {
                MultiplyOperator multiplyOperator = new MultiplyOperator();
                yield multiplyOperator.operate(num1, num2, operator);
            }
            case DIVISION -> {
                DivideOperator divideOperator = new DivideOperator();
                yield divideOperator.operate(num1, num2, operator);
            }

            // LV 2 요구 사항 10
            case MODULO -> {
                ModOperator modOperator = new ModOperator();
                yield modOperator.operate(num1, num2, operator);
            }
            // 나눗셈에 분모가 0이 들어온 경우 MyArithmeticException 에러 발생 (Lv2 요구 사항 1)
            default -> throw new MyArithmeticException("올바른 사칙 연산 기호(+, -, *, /)를 입력해 주세요!");
        }; // switch문 종료
    }

    @Override
    Double calculateCircleArea(double radius) {
        throw new UnsupportedOperationException("이 메서드는 구현되지 않았습니다.");

    }
}
