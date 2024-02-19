package Class;

public class Person {

    String name;
    int age;
    String gender;

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void printInfo() {
        System.out.println("▶ 이름 : " + name + "\n▶ 나이 : " + age + "\n▶ 성별 : " + gender);
    }
}
