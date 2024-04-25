package jdbc.DAO.member;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MemberMain {

    private static Scanner scanner = new Scanner(System.in);
    private static MemberDAO memberDAO;

    public static void main(String[] args) {

        memberDAO = new MemberDAOImpl(DatabaseUtil.getConnection());

        while (true) {
            System.out.print("1. Insert | 2. Select | 3. Select All | 4. Update | 5. Delete | 6. Exit > ");
            String number = scanner.nextLine();

            switch (number) {
                case "1" -> insert();
                case "2" -> getMemberById();
                case "3" -> selectAllMembers();
                case "4" -> update();
                case "5" -> delete();
                case "6" -> {
                    System.out.println("Thank you. :)");
                    DatabaseUtil.close();
                    return;
                }
            }
        }
    }

    public static void insert() {

        System.out.println("[Insert]");
        System.out.print("ID : ");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Name : ");
        String name = scanner.nextLine();

        System.out.print("E-mail : ");
        String email = scanner.nextLine();

        MemberDTO member = new MemberDTO(id, name, email);

        memberDAO.insert(member);
    }

    public static void getMemberById() {

        System.out.println("[Select]");
        System.out.print("ID : ");
        int id = Integer.parseInt(scanner.nextLine());

        MemberDTO member = memberDAO.getMemberById(id);

        if (member != null) {

            System.out.println("ID : " + member.getId());
            System.out.println("Name : " + member.getName());
            System.out.println("E-mail : " + member.getEmail());

        } else {
            System.out.println("Sorry, the user could not be found.");
        }
    }

    public static void selectAllMembers() {

        System.out.println("[Select All]");

        List<MemberDTO> memberList = memberDAO.selectAllMembers();

        Iterator<MemberDTO> iter = memberList.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public static void update() {

        System.out.println("[Update]");
        System.out.print("ID : ");
        int id = Integer.parseInt(scanner.nextLine());

        MemberDTO member = memberDAO.getMemberById(id);

        if (member != null) {

            System.out.println("ID : " + member.getId());
            System.out.println("Name : " + member.getName());
            System.out.println("E-mail : " + member.getEmail());

            System.out.print("Name : ");
            String name = scanner.nextLine();
            if (!name.isEmpty()) member.setName(name);

            System.out.print("E-mail : ");
            String email = scanner.nextLine();
            if (!email.isEmpty()) member.setEmail(email);

            memberDAO.update(member);

            System.out.println("* Update Completed *");

        } else {
            System.out.println("Sorry, the user could not be found.");
        }
    }

    public static void delete() {

        System.out.println("[Delete]");
        System.out.print("ID : ");
        int id = Integer.parseInt(scanner.nextLine());

        MemberDTO member = memberDAO.getMemberById(id);

        if (member != null) {

            System.out.println("Are you sure you want to delete it?");
            System.out.println("1. Yes | 2. No");
            String answer = scanner.nextLine();

            if (answer.equals("1")) {

                memberDAO.delete(id);

                System.out.println("* Deletion Complete *");
            }
        } else {
            System.out.println("Sorry, the user could not be found.");
        }
    }
}
