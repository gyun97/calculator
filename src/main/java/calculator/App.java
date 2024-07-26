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
                System.out.print("첫 번째 숫자를 입력하세요: ");
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
