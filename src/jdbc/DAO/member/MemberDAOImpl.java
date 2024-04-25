package jdbc.DAO.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAOImpl implements MemberDAO {

    Connection conn;

    public MemberDAOImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(MemberDTO member) {

        String insertSql = "INSERT INTO members (id, name, email) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(insertSql)) {

            pstmt.setInt(1, member.getId());
            pstmt.setString(2, member.getName());
            pstmt.setString(3, member.getEmail());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public MemberDTO getMemberById(int id) {

        String selectSql = "SELECT id, name, email FROM members WHERE id = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(selectSql)) {

            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {

                return new MemberDTO(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email")
                );
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void update(MemberDTO member) {

        String updateSql = "UPDATE members SET id = ?, name = ?, email = ? WHERE id = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(updateSql)) {

            pstmt.setInt(1, member.getId());
            pstmt.setString(2, member.getName());
            pstmt.setString(3, member.getEmail());
            pstmt.setInt(4, member.getId());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {

        String deleteSql = "DELETE FROM members WHERE id = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(deleteSql)) {

            pstmt.setInt(1, id);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<MemberDTO> selectAllMembers() {

        List<MemberDTO> memberList = new ArrayList<>();
        String selectSql = "SELECT * FROM members";

        try (PreparedStatement pstmt = conn.prepareStatement(selectSql)) {

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {

                MemberDTO member = new MemberDTO(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3)
                );

                memberList.add(member);
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return memberList;
    }
}
