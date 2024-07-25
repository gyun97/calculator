package calculator;


import error.MyArithmeticException;

public class CircleCalculator extends Calculator {


    @Override
    Double calculateCircleArea(double radius) {
        return Math.pow(radius, 2) * PI;
    }

    @Override
    Integer calculate(int num1, int num2, char operator)  {
        throw new UnsupportedOperationException("이 메서드는 구현되지 않았습니다.");

    }
}
