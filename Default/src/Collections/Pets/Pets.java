package Collections.Pets;

import java.util.Comparator;
import java.util.Objects;

public class Pets implements Comparable <Pets> {

     String animalBreed;
     String name;
     int weight;

    public Pets(String animalBreed, String name, int weight) {
        this.animalBreed = animalBreed;
        this.name = name;
        this.weight = weight;
    }

    public String getAnimalBreed() {
        return animalBreed;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pets pets = (Pets) o;
        return animalBreed.equals(pets.animalBreed) && name.equals(pets.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalBreed, name);
    }

    @Override
    public String toString() {
        return "Pets{" +
                "animalBreed='" + animalBreed + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Pets anotherPet) {

        return this.weight-anotherPet.weight;

    }
}


