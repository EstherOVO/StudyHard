package Class;

public class Animal {

    String specie;
    String name;
    int age;

    Animal(String specie, String name, int age) {
        this.specie = specie;
        this.name = name;
        this.age = age;
    }

    void printInfo() {
        System.out.println("▶ 종(Specie) : " + specie + "\n▶ 이름 : " + name + "\n▶ 나이 : " + age);
    }
}
