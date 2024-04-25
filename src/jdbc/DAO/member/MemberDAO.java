package jdbc.DAO.member;

import java.util.List;

public interface MemberDAO {

    void insert(MemberDTO member);
    MemberDTO getMemberById(int id);
    void update(MemberDTO member);
    void delete(int id);
    List<MemberDTO> selectAllMembers();
}
