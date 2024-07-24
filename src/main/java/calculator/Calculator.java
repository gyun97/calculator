package calculator;

import error.MyArithmeticException;

import java.util.ArrayList;
import java.util.List;

public class Calculator{


    List<Integer> resultList = new ArrayList<>(); // 연산 결과를 저장하는 컬렉션 타입 필드 (LV 2 요구 사항 1)

    /*양의 정수 2개(0 포함)와 연산 기호를 매개변수로 받아 사칙연산(+,-,*,/) 기능을 수행한 후 결과 값을 반환하는 메서드(Lv 2 요구사항 1) */
    public Integer calculate(int num1, int num2, char operator) throws MyArithmeticException {

        switch (operator) {
            case '+':
                return num1 + num2;

            case '-':
                return num1 - num2;

            case '*':
                return num1 * num2;

            case '/':
                if (num2 == 0) {
                    // 나눗셈에 분모가 0이 들어온 경우 MyArithmeticException 에러 발생 (Lv2 요구 사항 1)
                    throw new MyArithmeticException("나눗셈 연산에서 분모(두번째 파라미터)에 0이 입력될 수 없습니다.");
                }
                return num1 / num2;

            default: // 잘못된 사칙 연산 기호가 들어온 경우 경우 ArithmeticException 에러 발생 (Lv2 요구 사항 1)
                throw new MyArithmeticException("올바른 사칙 연산 기호(+, -, *, /)를 입력해 주세요!");
        } // switch문 종료

    }


    // Test Case
    public static void main(String[] args) throws MyArithmeticException {
        Calculator cal1 = new Calculator();
        System.out.println(cal1.calculate(10, 5, '+')); // 15

        Calculator cal2 = new Calculator();
        System.out.println(cal2.calculate(10, 5, '-')); // 5


        Calculator cal3 = new Calculator();
        System.out.println(cal3.calculate(10, 5, '*')); // 50


        Calculator cal4 = new Calculator();
        System.out.println(cal4.calculate(10, 5, '/')); // 2

//        Calculator cal5 = new Calculator();
//        System.out.println(cal5.calculate(10, 0, '/'));
//
//        Calculator cal6 = new Calculator();
//        System.out.println(cal6.calculate(10, 5, 'z'));


    }


}
