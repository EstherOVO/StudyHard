package collection.list.ex03;

public class Friends {

    private String name;
    private String email;
    private String phoneNumber;

    public Friends(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "□ 이름 : " + name + " | □ 이메일 : " + email + " | □ 전화번호 : " + phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
