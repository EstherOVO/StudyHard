package exception.ex02;

public class InvalidAgeException extends RuntimeException {

    public InvalidAgeException(int age) {
        super("미성년자는 접근할 수 없습니다.");
    }
}
