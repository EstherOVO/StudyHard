package collection.list.ex03;

import java.util.*;

public class AddressBook {

    List<Friends> friendsList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void addFriend() {
        System.out.println();
        System.out.println("= 추가할 친구 정보를 입력해 주세요 =");
        System.out.print("· 이름 : ");
        String name = scanner.next();

        System.out.print("· 이메일 : ");
        String email = scanner.next();

        System.out.print("· 전화번호 : ");
        String phoneNumber = scanner.next();

        friendsList.add(new Friends(name, email, phoneNumber));
        System.out.println("* 추가가 완료되었습니다 *");
    }

    public void deleteFriend() {
        System.out.println();
        System.out.println("= 삭제할 친구 정보를 입력해 주세요 =");
        System.out.print("· 이름 : ");
        String name = scanner.next();

        boolean isDeleted = false;

        Iterator<Friends> it = friendsList.iterator();
        while (it.hasNext()) {
            if (it.next().getName().equals(name)) {
                System.out.println("* 삭제가 완료되었습니다 *");
                it.remove();
                isDeleted = true;
            }
        }
        if (!isDeleted) {
            System.out.println("입력한 친구를 주소록에서 찾을 수 없습니다.");
        }
    }

    public void searchFriend() {
        System.out.println();
        System.out.println("= 검색할 친구 정보를 입력해 주세요 =");
        System.out.print("· 이름 : ");
        String name = scanner.next();

        boolean isSearched = false;

        for (Friends friends : friendsList) {
            if (friends.getName().equals(name)) {
                System.out.println(friends);
                isSearched = true;
            }
        }
        if (!isSearched) {
            System.out.println("입력한 친구를 주소록에서 찾을 수 없습니다.");
        }
    }

    public void printAllFriends() {
        System.out.println();
        for (Friends friends : friendsList) {
            System.out.println(friends.toString());
        }
    }

    public void runAddressBook() {

        while (true) {

            try {
                System.out.println();
                System.out.print("""
                        = 원하시는 메뉴의 번호를 입력해 주세요 =
                        1. 친구 추가
                        2. 친구 삭제
                        3. 친구 검색
                        4. 주소록 출력
                        5. 종료
                        """);
                System.out.print("입력 번호 ▶ ");
                int selectNumber = scanner.nextInt();

                switch (selectNumber) {
                    case 1:
                        addFriend();
                        continue;
                    case 2:
                        deleteFriend();
                        continue;
                    case 3:
                        searchFriend();
                        continue;
                    case 4:
                        printAllFriends();
                        continue;
                    case 5:
                        System.out.println("프로그램을 종료합니다.");
                        return;
                }
            } catch (InputMismatchException e) {
                System.out.println("다시 시도해 주시기를 바랍니다.");
                scanner.next();
            }
        }
    }
}
