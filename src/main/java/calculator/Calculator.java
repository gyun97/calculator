package calculator;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    List<Integer> resultList = new ArrayList<>();

    public Integer calculate(int num1, int num2, char operator) throws ArithmeticException {

        switch (operator) {
            case '+':
                return num1 + num2;

            case '-':
                return num1 - num2;

            case '*':
                return num1 * num2;

            case '/':
                if (num2 == 0) {
                    // 분모가 0이 들어온 경우 ArithmeticException 에러 발생
                    throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                return num1 / num2;

            default: // 잘못된 사칙 연산 기호가 들어온 경우 경우 ArithmeticException 에러 발생
                throw new ArithmeticException("올바른 사칙 연산 기호(+, -, *, /)를 입력해 주세요!");
        } // switch문 종료

    }

    // Test Case
    public static void main(String[] args) throws ArithmeticException {
        Calculator cal1 = new Calculator();
        System.out.println(cal1.calculate(10, 5, '+')); // 15

        Calculator cal2 = new Calculator();
        System.out.println(cal2.calculate(10, 5, '-')); // 5


        Calculator cal3 = new Calculator();
        System.out.println(cal3.calculate(10, 5, '*')); // 50


        Calculator cal4 = new Calculator();
        System.out.println(cal4.calculate(10, 5, '/')); // 2

        Calculator cal5 = new Calculator();
        System.out.println(cal5.calculate(10, 0, '/'));

        Calculator cal6 = new Calculator();
        System.out.println(cal6.calculate(10, 5, 'z'));


    }

}
