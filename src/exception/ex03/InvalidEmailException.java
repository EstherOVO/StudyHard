package exception.ex03;

public class InvalidEmailException extends RuntimeException {

    public InvalidEmailException(String email) {
        super("※ 유효하지 않은 이메일 주소입니다.");
    }
}
