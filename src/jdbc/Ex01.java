package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

/*
        연습 문제 2.

        요구사항 :
        사용자로부터 userId, name, password, age, email을 입력받아,
        JDBC를 사용하여 데이터베이스의 users 테이블에 새로운 사용자 정보를 삽입하는 Java 애플리케이션을 작성하세요.

        Java 애플리케이션은 사용자로부터 다음 정보를 입력받아야 합니다.

        userId : spring
        name : 봄봄
        password : 23456
        age : 25
        email : spring@def.com

        - 입력받은 정보를 데이터베이스의 users 테이블에 삽입합니다.
        - 데이터 삽입이 성공적으로 완료되면, 삽입된 행의 수를 출력합니다.
        - 오류 발생 시 적절한 오류 메시지를 출력하고 프로그램을 종료합니다
*/

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "1234";

        Scanner scanner = new Scanner(System.in);

        System.out.print("§ 아이디(ID)를 입력하세요 : ");
        String id = scanner.nextLine();

        System.out.print("§ 이름을 입력하세요 : ");
        String name = scanner.nextLine();

        System.out.print("§ 비밀번호를 입력하세요 : ");
        String pw = scanner.nextLine();

        System.out.print("§ 나이를 입력하세요 : ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("§ 이메일을 입력하세요 : ");
        String email = scanner.nextLine();

        String insertSql = "INSERT INTO users (userId, name, password, age, email) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(insertSql);) {

            pstmt.setString(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, pw);
            pstmt.setInt(4, age);
            pstmt.setString(5, email);

            int rows = pstmt.executeUpdate();

            System.out.println("[" + rows + "] 업데이트 되었습니다.");

        } catch (SQLException e) {
            System.out.println("다시 시도해 주시기를 바랍니다.");
        }
    }
}
