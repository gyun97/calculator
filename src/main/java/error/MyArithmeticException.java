package error;

/**
 *
 * 임시로 RuntimeException 상속받아서 언체크예외로 만들어서 throws 생략함
 */

public class MyArithmeticException extends RuntimeException {

    public MyArithmeticException(String message) {
        super(message);
    }

}
