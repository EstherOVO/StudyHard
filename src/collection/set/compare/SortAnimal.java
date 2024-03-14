package collection.set.compare;

import java.util.Comparator;

public class SortAnimal implements Comparator<Animal> {

    public enum SortBy { SPECIES, NAME, AGE, WEIGHT }
    public enum SortDirection { ASC, DESC }

    private SortBy sortBy;
    private SortDirection sortDirection;

    public SortAnimal(SortBy sortBy, SortDirection sortDirection) {
        this.sortBy = sortBy;
        this.sortDirection = sortDirection;
    }

    public int compare(Animal a1, Animal a2) {

        int result = 0;

        switch (sortBy) {
            case SPECIES -> result = a1.getSpecies().compareTo(a2.getSpecies());
            case NAME -> result = a1.getName().compareTo(a2.getName());
            case AGE -> result = Integer.compare(a1.getAge(), a2.getAge());
            case WEIGHT -> result = a1.getWeight() - a2.getWeight();
        }
        return (sortDirection == SortDirection.ASC ? result : (result * -1));
    }
}
