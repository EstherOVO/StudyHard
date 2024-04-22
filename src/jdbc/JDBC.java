package jdbc;

public class JDBC {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("성공적으로 드라이버를 불러왔습니다.");
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 클래스를 찾을 수 없습니다.");
            throw new RuntimeException(e);
        }
    }
}
