package collection.set.compare;

public class Animal {

    String species;
    String name;
    int age;
    int weight;

    public Animal(String species, String name, int age, int weight) {
        this.species = species;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String toString() {
        return "▧ 종 : " + species + " | ▧ 이름 : " + name + " | ▧ 나이 : " + age + " | ▧ 몸무게 : " + weight;
    }

    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }
}
