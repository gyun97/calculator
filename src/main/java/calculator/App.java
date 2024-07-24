package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int[] resultArray = new int[10]; // 연산 결과 10개까지 저장할 수 있는 배열 생성
//        int index = 0; // 배열에 저장된 연산 결과 카운트

        ArrayList<Integer> resultList = new ArrayList<>(); // 결과를 무한대로 저장할 수 있는 리스트 생성

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
            } // switch문 종료


            resultList.add(result);
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제): ");
            String removeResult = sc.next();

            if (removeResult.equals("remove")) {
                resultList.remove(0);
                System.out.println("가장 먼저 저장된 연산 결과 삭제 완료!");
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회): ");
            String inquiryResult = sc.next();
            if (inquiryResult.equals("inquiry")) {
//            System.out.println("리스트: " + resultList.toString());
                System.out.println("리스트를 조회합니다.");
                System.out.print("리스트: ");
                for (int num : resultList) {
                    System.out.print(num + " ");

                }
            }


            /* 계산 결과를 배열에 저장합니다. 만약  배열의 크기가 10을 초과할 시 그 다음부터는 else문이 실행*/
//            if (index < 10) {
//                resultArray[index] = result;
//                index++;
//            } else { // 배열에 저장된 result의 수가 10개 초과시
//                System.out.println("배열이 10개를 초과하여 가장 먼저 저장된 값이 삭제됩니다.");
//                /*배열을 반복문으로 순회하여 앞 인덱스 자리에 바로 뒤 인덱스의 값을 대입하여 원소들을 하나씩 앞당긴 후 마지막 자리에 새로운 result 추가*/
//                for (int i = 0; i < resultArray.length - 1; i++) {
//                    resultArray[i] = resultArray[i + 1]; // 배열 원소들 한 칸씩 앞당기기
//                }
//                resultArray[9] = result;  // 배열 가장 마지막 칸에 새 result 추가
//            }

//            System.out.println(Arrays.toString(resultArray)); // 배열 결과 확인


            System.out.println();
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
            String exit = sc.next(); // 진행 여부 의사 질문

            if (exit.equals("exit")) {
                System.exit(0);
            }

        } // while 문 종료


    }
}