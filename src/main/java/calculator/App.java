//package calculator;
//
//import error.MyArithmeticException;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//import java.util.stream.Collectors;
//
//public class App {
//
//    private static Calculator calculator;
//
//
//    public App(Calculator calculator) {
//        this.calculator = calculator;
//    }
//
//
//
//    public static void main(String[] args)  {
//
//
//        Scanner sc = new Scanner(System.in);
//
////        List<Integer> calResultList = calculator.getResultList(); // Getter로 Calculator의 사칙 연산 리스트에 접근 (LV 2 요구사항 3)
//
//
//        while (true) { // 결과 도출 후 진행 여부 응답에서 exit 입력 시 계산 종료, exit 아니면 계속 계산 반복(LV 1 요구 사항 4)
//
//            System.out.print("원의 넓이를 구하고 싶으면 \'circle\'를, 두 수의 사칙 연산을 하고 싶으면 \'four\'를 입력하세요: "); // LV 2요구 사항 7
////            List<Double> circleResultList = Calculator.getCircleResultList(); // Getter로 Calculator의 원넓이 리스트에 접근 (LV 2 요구사항 7)
////            List<Integer> resultList = Calculator.getResultList(); // Getter로 Calculator의 원넓이 리스트에 접근 (LV 2 요구사항 7)
//            String choice = sc.next();
//
//            if (choice.equals("circle")) {
//                App app = new App(new CircleCalculator());
//
//                System.out.println("원의 넓이를 구하는 것을 선택하셨습니다.");
//                System.out.print("구하고 싶은 원의 반지름(cm)을 입력하세요: ");
//                double radius  = sc.nextDouble();
//                Double circleArea = App.calculator.calculateCircleArea(radius);
//                System.out.println("원의 넓이 결과: " + circleArea);
//                calculator.saveCircleResults(circleArea);
//
//            } else if (choice.equals("four")) {
//                App app = new App(new ArithmeticCalculator());
//
//
//                System.out.println("두 수의 사칙 연산을 구하는 것을 선택하셨습니다.");
//                System.out.print("첫 번째 숫자를 입력하세요:");
//                int num1 = sc.nextInt(); // 첫 번째 숫자 입력(LV 1 요구 사항 1)
////        System.out.println("num1 = " + num1);
//
//
//                System.out.print("두 번째 숫자를 입력하세요: ");
//                int num2 = sc.nextInt(); // 두 번째 숫자 입력(LV 1 요구 사항 1)
////        System.out.println("num2 = " + num2);
//
//                System.out.print("사칙 연산 기호를 입력하세요: ");
//                char operator = sc.next().charAt(0);
////        System.out.println("operator = " + operator);// 사칙 연산 기호 입력(LV 1 요구 사항 2)
//
//
//                Integer result = calculator.calculate(num1, num2, operator);// 연산 수행 결과는 이제 Calculator 클래스의 calculate 메서드가 실행(LV 2 요구 사항 2)
//                System.out.println("사칙 연산 결과: " + result);
////                calResultList.add(result); // 연산 결과 Calculator 클래스의 연산 결과를 저장하는 필드에 저장 (LV 2 요구 사항 2)
//                calculator.saveResult(Calculator.resultList, result);
//            } // 사칙 연산 (else문) 끝
//
//            else {
//                throw new MyArithmeticException("잘못된 입력입니다. 프로그램을 종료합니다.");
//            }
//
//
////            resultList.add(result);
//            System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제): ");
//            String removeResult = sc.next();
//
//            if (removeResult.equals("remove")) { // (LV 1 요구 사항 7)
//                if (choice.equals("four")) {
////                cal.resultList.remove(0);
////                calResultList.remove(0);
////                cal.setResultList(calResultList); // Setter로 Calculator의 리스트 수정(LV 2 요구사항 3)
//                    calculator.removeResult(); // 사칙 연산 결과들 중  가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드 구현 (LV 2 요구사항 4)
//                    System.out.println("가장 먼저 저장된 사칙 연산 결과 삭제 완료!");
//                }
//                else if (choice.equals("circle")){
//                    calculator.removeCircleResults(); // 원 넓이 연산 결과들 중  가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드 구현 (LV 2 요구사항 7)
//                    System.out.println("가장 먼저 저장된 원 넓이 연산 결과 삭제 완료!");
//                }
//            }
//
//            System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회): "); // (LV 1 요구 사항 8)
//            String inquiryResult = sc.next();
//            if (inquiryResult.equals("inquiry")) {
//                if (choice.equals("four")) {
////            System.out.println("리스트: " + resultList.toString());
//                    System.out.println("사칙 연산의 결과 리스트를 조회합니다.");
//                    System.out.print("사칙 연산 결과 리스트: ");
//
//                    // Getter로 Calculator의 리스트에 접근하여 값 조회(LV 2 요구 사항 3)
////                for (int num : calResultList) {
////                    System.out.print(num + " ");
////
////                }
//                    calculator.inquiryResults(); /* 사칙 연산 결과들을 조회하는 기능 메서드를 구현 (LV 2 요구사항 5) */
//                }
//
//                else if (choice.equals("circle")){
//                    System.out.println("원 넓이 연산의 결과 리스트를 조회합니다.");
//                    System.out.print("원 넓이 결과 리스트: ");
//                    calculator.inquiryCircleResults(); /* 원 넓이 연산 결과들을 조회하는 기능 메서드를 구현 (LV 2 요구사항 7) */
//
//                }
//
//            }
//
//
//
//            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): "); // (LV 1 요구 사항 4)
//            String exit = sc.next(); // 진행 여부 의사 질문
//
//            if (exit.equals("exit")) {
//                System.exit(0);
//            }
//
//        } // while 문 종료
//
//
//    }
//}

package calculator;

import error.MyArithmeticException;

import java.util.Scanner;

public class App {

    private Calculator calculator;

    public App(Calculator calculator) {
        this.calculator = calculator;
    }

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        // 초기 Calculator 객체 생성
        Calculator calculator = null;
        App app = null;

        while (true) {
            System.out.print("원의 넓이를 구하고 싶으면 'circle'을, 두 수의 사칙 연산을 하고 싶으면 'four'를 입력하세요: ");
            String choice = sc.next();

            if (choice.equals("circle")) {
                // 기존 인스턴스가 없으면 새로 생성
                if (calculator == null || !(calculator instanceof CircleCalculator)) {
                    calculator = new CircleCalculator();
                    app = new App(calculator);
                }

                System.out.println("원의 넓이를 구하는 것을 선택하셨습니다.");
                System.out.print("구하고 싶은 원의 반지름(cm)을 입력하세요: ");
                double radius = sc.nextDouble();
                Double circleArea = calculator.calculateCircleArea(radius);
                System.out.println("원의 넓이 결과: " + circleArea);
                calculator.saveCircleResults(circleArea);

            } else if (choice.equals("four")) {
                // 기존 인스턴스가 없으면 새로 생성
                if (calculator == null || !(calculator instanceof ArithmeticCalculator)) {
                    calculator = new ArithmeticCalculator();
                    app = new App(calculator);
                }

                System.out.println("두 수의 사칙 연산을 구하는 것을 선택하셨습니다.");
                System.out.print("첫 번째 숫자를 입력하세요:");
                int num1 = sc.nextInt();

                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();

                System.out.print("사칙 연산 기호를 입력하세요: ");
                char operator = sc.next().charAt(0);

                Integer result = calculator.calculate(num1, num2, operator);
                System.out.println("사칙 연산 결과: " + result);
                calculator.saveResult(result);

            } else {
                throw new MyArithmeticException("잘못된 입력입니다. 프로그램을 종료합니다.");
            }

            System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제): ");
            String removeResult = sc.next();

            if (removeResult.equals("remove")) {
                if (choice.equals("four")) {
                    calculator.removeResult();
                    System.out.println("가장 먼저 저장된 사칙 연산 결과 삭제 완료!");
                } else if (choice.equals("circle")) {
                    calculator.removeCircleResults();
                    System.out.println("가장 먼저 저장된 원 넓이 연산 결과 삭제 완료!");
                }
            }

            System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회): ");
            String inquiryResult = sc.next();
            if (inquiryResult.equals("inquiry")) {
                if (choice.equals("four")) {
                    System.out.println("사칙 연산의 결과 리스트를 조회합니다.");
                    System.out.print("사칙 연산 결과 리스트: ");
                    calculator.inquiryResults();
                } else if (choice.equals("circle")) {
                    System.out.println("원 넓이 연산의 결과 리스트를 조회합니다.");
                    System.out.print("원 넓이 결과 리스트: ");
                    calculator.inquiryCircleResults();
                }
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
            String exit = sc.next();

            if (exit.equals("exit")) {
                System.exit(0);
            }
        }
    }
}
