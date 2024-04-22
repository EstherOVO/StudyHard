package jdbc;

import java.sql.*;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "1234";

        Scanner scanner = new Scanner(System.in);

        System.out.print("§ 아이디(ID)를 입력하세요 : ");
        String id = scanner.nextLine();

        String sql = "SELECT * FROM users WHERE userID = '" + id + "'";
        String deleteSql = "DELETE FROM users WHERE userID = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(deleteSql)) {

            ResultSet rs = pstmt.executeQuery(sql);

            if (rs.next()) {
                System.out.println("● 발견된 사용자 정보 ●");
                System.out.println("○ 아이디(ID) : " + rs.getString("userID"));
                System.out.println("○ 이름 : " + rs.getString("name"));
                System.out.println("○ 나이 : " + rs.getInt("age"));
                System.out.println("○ 이메일 : " + rs.getString("email"));
            } else {
                System.out.println("사용자를 찾을 수 없습니다.");
                return;
            }

            System.out.print("※ 이 사용자를 정말 삭제하시겠습니까 (Y / N) : ");
            String answer = scanner.nextLine();

            if (answer.toUpperCase().equals("Y")) {
                pstmt.setString(1, id);
            } else {
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            int rows = pstmt.executeUpdate();
            System.out.println("사용자 <" + id + ">님의 정보가 정상적으로 삭제 되었습니다.");

            rs.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
