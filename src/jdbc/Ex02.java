package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

/*
        연습 문제 2. 사용자 정보 업데이트

        요구사항 :
        사용자로부터 userId, name, password, age, email을 입력받아
        해당 userId를 가진 사용자의 정보를 업데이트하세요.

        사용자로부터 다음 정보를 입력받습니다.

        userId : 업데이트 할 사용자 ID
        name : 새 사용자 이름
        password : 새 비밀번호
        age : 새 나이
        email : 새 이메일 주소

        - 입력받은 정보를 데이터베이스의 users 테이블에 업데이트합니다.
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
        String age = scanner.nextLine();

        System.out.print("§ 이메일을 입력하세요 : ");
        String email = scanner.nextLine();

/////////////////////////////////////////////////////////////

        StringBuilder updateSql = new StringBuilder();

        updateSql.append("UPDATE users SET");
        boolean isFirst = true;

        if (!name.isEmpty()) {
            if (!isFirst) {
                updateSql.append(",");
            }
            updateSql.append(" name = ?");
        }

        if (!pw.isEmpty()) {
            if (!isFirst) {
                updateSql.append(",");
            }
            updateSql.append(" pw = ?");
        }

        if (!age.isEmpty()) {
            if (!isFirst) {
                updateSql.append(",");
            }
            updateSql.append(" age = ?");
        }

        if (!email.isEmpty()) {
            if (!isFirst) {
                updateSql.append(",");
            }
            updateSql.append(" email = ?");
        }

        updateSql.append(" WHERE userID = ?");

        int index = 1;

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(updateSql.toString())) {

            if (!name.isEmpty()) pstmt.setString(index++, name);
            if (!pw.isEmpty()) pstmt.setString(index++, pw);
            if (!age.isEmpty()) pstmt.setInt(index++, Integer.valueOf(age));
            if (!email.isEmpty()) pstmt.setString(index++, email);

            pstmt.setString(index, id);

            int rows = pstmt.executeUpdate();

            System.out.println("사용자 <" + id + ">님의 정보가 정상적으로 업데이트 되었습니다.");

        } catch (SQLException e) {
            System.out.println("다시 시도해 주시기를 바랍니다.");
        }
    }
}
