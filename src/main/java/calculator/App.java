package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) { // 결과 도출 후 진행 여부 응답에서 exit 입력 시 계산 종료, exit 아니면 계속 계산 반복

            System.out.print("첫 번째 숫자를 입력하세요:");
            int num1 = sc.nextInt(); // 첫 번째 숫자 입력
//        System.out.println("num1 = " + num1);


            System.out.print("두 번째 숫자를 입력하세요:");
            int num2 = sc.nextInt(); // 두 번째 숫자 입력
//        System.out.println("num2 = " + num2);

            System.out.print("사칙 연산 기호를 입력하세요:");
            char operator = sc.next().charAt(0);
//        System.out.println("operator = " + operator);// 사칙 연산 기호 입력

            int result = 0;

            /* swtich 제어문으로 입력받은 식의 사칙연산을 진행하여 결과값 도출*/
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("결과: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("결과: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("결과: " + result);
                    break;
                case '/':
                    if (num2 == 0) System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    result = num1 / num2;
                    System.out.println("결과:" + result);
                    break;
                default:
                    System.out.println("올바른 사칙 연산 기호(+, -, *, /)를 입력해 주세요!");
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
            String exit = sc.next(); // 진행 여부 의사 질문

            if (exit.equals("exit")) {
                System.exit(0);
            }

        }


    }
}
