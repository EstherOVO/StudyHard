package collection.set.compare;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class AnimalMain {
    public static void main(String[] args) {

        Animal animal1 = new Animal("강아지", "사랑이", 9, 5);
        Animal animal2 = new Animal("하마", "듬직이", 5, 1200);
        Animal animal3 = new Animal("호랑이", "멋짐이", 7, 150);

        System.out.println("=== 분류 기준 : 종(오름차순) ===");
        SortAnimal sortBySpecies = new SortAnimal(SortAnimal.SortBy.SPECIES, SortAnimal.SortDirection.ASC);

        Set<Animal> treeSet1 = new TreeSet<>(sortBySpecies);

        treeSet1.addAll(Arrays.asList(animal1, animal2, animal3));

        for (Animal animal : treeSet1) {
            System.out.println(animal);
        }

        System.out.println("=== 분류 기준 : 이름(내림차순) ===");
        SortAnimal sortByName = new SortAnimal(SortAnimal.SortBy.NAME, SortAnimal.SortDirection.DESC);

        Set<Animal> treeSet2 = new TreeSet<>(sortByName);

        treeSet2.addAll(Arrays.asList(animal1, animal2, animal3));

        for (Animal animal : treeSet2) {
            System.out.println(animal);
        }

        System.out.println("=== 분류 기준 : 나이(오름차순) / 몸무게(내림차순) ===");

        TreeSet[] treeSets = {new TreeSet<Animal>(new SortAnimal(SortAnimal.SortBy.AGE, SortAnimal.SortDirection.ASC)), new TreeSet<Animal>(new SortAnimal(SortAnimal.SortBy.WEIGHT, SortAnimal.SortDirection.DESC))};

        for (TreeSet<Animal> treeSet : treeSets) {
            treeSet.addAll(Arrays.asList(animal1, animal2, animal3));
            for (Animal animal : treeSet) {
                System.out.println(animal);
            }
        }
    }
}
