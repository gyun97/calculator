package calculator;

import error.MyArithmeticException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) throws MyArithmeticException {

        Calculator cal = new Calculator(); // Calculator 인스턴스 생성 (LV 2 요구 사항 2)

        Scanner sc = new Scanner(System.in);


        while (true) { // 결과 도출 후 진행 여부 응답에서 exit 입력 시 계산 종료, exit 아니면 계속 계산 반복(LV 1 요구 사항 4)

            System.out.print("첫 번째 숫자를 입력하세요:");
            int num1 = sc.nextInt(); // 첫 번째 숫자 입력(LV 1 요구 사항 1)
//        System.out.println("num1 = " + num1);


            System.out.print("두 번째 숫자를 입력하세요:");
            int num2 = sc.nextInt(); // 두 번째 숫자 입력(LV 1 요구 사항 1)
//        System.out.println("num2 = " + num2);

            System.out.print("사칙 연산 기호를 입력하세요:");
            char operator = sc.next().charAt(0);
//        System.out.println("operator = " + operator);// 사칙 연산 기호 입력(LV 1 요구 사항 2)


            Integer result = cal.calculate(num1, num2, operator);// 연산 수행 결과는 이제 Calculator 클래스의 calculate 메서드가 실행(LV 2 요구 사항 2)
            cal.resultList.add(result); // 연산 결과 Calculator 클래스의 연산 결과를 저장하는 필드에 저장 (LV 2 요구 사항 2)


//            resultList.add(result);
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제): ");
            String removeResult = sc.next();

            if (removeResult.equals("remove")) { // (LV 1 요구 사항 7)
                cal.resultList.remove(0);
                System.out.println("가장 먼저 저장된 연산 결과 삭제 완료!");
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회): "); // (LV 1 요구 사항 8)
            String inquiryResult = sc.next();
            if (inquiryResult.equals("inquiry")) {
//            System.out.println("리스트: " + resultList.toString());
                System.out.println("리스트를 조회합니다.");
                System.out.print("리스트: ");
                for (int num : cal.resultList) {
                    System.out.print(num + " ");

                }
            }


            System.out.println();
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): "); // (LV 1 요구 사항 4)
            String exit = sc.next(); // 진행 여부 의사 질문

            if (exit.equals("exit")) {
                System.exit(0);
            }

        } // while 문 종료


    }
}