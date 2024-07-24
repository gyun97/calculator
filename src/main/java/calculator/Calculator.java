package calculator;

import error.MyArithmeticException;

import java.util.ArrayList;
import java.util.List;

/**
 * LV 2 계산기에서 계산 수행 및 계산 결과 저장 담당 클래스
 */


public class Calculator {

    /* 원넓이 계산에 필요한 파이 값은 불변의 3.14로 final 사용해서 고정하고
        static으로 클래스 변수로 선언해서 모든 인스턴스가 동일한 상수 공유  (LV 2 요구 사항 7)
    */
    public static final double PI = 3.14;

    private List<Double> circleResultList = new ArrayList<>(); // 원 넓이 계산 결과 저장할 컬렉션 타입 필드 (LV 2 요구 사항 7)

    public List<Double> getCircleResultList() { // 원 넓이 저장 리스트 Getter 캡슐화(LV 2 요구 사항 7)
        return circleResultList;
    }

    public void setCircleResultList(List<Double> circleResultList) { // 원 넓이 저장 리스트 Setter 캡슐화(LV 2 요구 사항 7)
        this.circleResultList = circleResultList;
    }

    // private으로 접근 제한자 변경하여 캡슐화 (LV 2 요구 사항 3)
    private List<Integer> resultList = new ArrayList<>(); // 연산 결과를 저장하는 컬렉션 타입 필드 (LV 2 요구 사항 1)


    // Calculator 인스턴스를 생성(new)할 때 생성자를 통해 사칙 연산 결과를 저장하고 있는 컬렉션 필드가 초기화 (LV 2 요구 사항 6)
    // Calculator 인스턴스를 생성(new)할 때 생성자를 통해 원 넓이 연산 결과를 저장하고 있는 컬렉션 필드가 초기화 (LV 2 요구 사항 7)
    public Calculator() {
        this.resultList = new ArrayList<>();
        this.circleResultList = new ArrayList<>();
    }

    // Getter로 resultList 접근하게 캡슐화 (LV 2 요구 사항 3)
    public List<Integer> getResultList() {
        return resultList;
    }

    // Setter로 resultList 수정하게 캡슐화 (LV 2 요구 사항 3)
    public void setResultList(List<Integer> resultList) {
        this.resultList = resultList;
    }

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

    /* 연산 결과들 중  가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드 구현 (LV 2 요구사항 4) */
    public void removeResult() {
        resultList.remove(0);
    }

    /* 연산 결과들을 조회하는 기능 메서드를 구현 (LV 2 요구사항 5) */
    public void inquiryResults() {
        System.out.println(getResultList());
    }

    public Double calculateCircleArea(double radius) {
        return Math.pow(radius, 2) * PI;
    }

    public void inquiryCircleResults() {
        System.out.println(getCircleResultList());
    }

    public void removeCircleResults() {
        circleResultList.remove(0);
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
