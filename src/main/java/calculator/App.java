package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt(); // 첫 번째 숫자 입력
        System.out.printf("첫 번째 숫자를 입력하세요:");

        int num2 = sc.nextInt(); // 두 번째 숫자 입력
        System.out.printf("두 번째 숫자를 입력하세요:");

        char operator = sc.next().charAt(0); // 사칙 연산 기호 입력
        System.out.printf("사칙 연산 기호를 입력하세요:");


    }
}
