package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PRAC {
    public static void main(String[] args) {

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

        ////////////////////////////////////////

        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE users SET");
        boolean isFirst = true;

        if (!name.isEmpty()) {
            if (!isFirst) {
                sb.append(",");
            }
            sb.append(" name = ?");
            isFirst = false;
        }

        if (!pw.isEmpty()) {
            if (!isFirst) {
                sb.append(",");
            }
            sb.append(" password = ?");
            isFirst = false;
        }

        if (!age.isEmpty()) {
            if (!isFirst) {
                sb.append(",");
            }
            sb.append(" age = ?");
            isFirst = false;
        }

        if (!email.isEmpty()) {
            if (!isFirst) {
                sb.append(",");
            }
            sb.append(" email = ?");
            isFirst = false;
        }

        sb.append(" WHERE userID = ?");

        int index = 1;

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sb.toString())) {

            if (!name.isEmpty()) pstmt.setString(index++, name);
            if (!pw.isEmpty()) pstmt.setString(index++, pw);
            if (!age.isEmpty()) pstmt.setInt(index++, Integer.valueOf(age));
            if (!email.isEmpty()) pstmt.setString(index++, email);

            pstmt.setString(index, id);

            int rows = pstmt.executeUpdate();

            System.out.println("업데이트 완료!");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
