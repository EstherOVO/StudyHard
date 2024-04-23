package jdbc.Web;

import java.util.Objects;

public class User {

    private String userID;
    private String name;
    private String password;
    private int age;
    private String email;

    public User(String userID, String name, String password, int age, String email) {
        this.userID = userID;
        this.name = name;
        this.password = password;
        this.age = age;
        this.email = email;
    }

    public User(String userID, String password) {
        this.userID = userID;
        this.password = password;
    }

    public String getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return Objects.equals(userID, user.userID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID);
    }
}
