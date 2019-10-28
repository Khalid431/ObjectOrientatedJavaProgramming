/*
 * Name: Khalid Mohamoud
 * Student number: c1536842
 */

import java.util.List;
import java.util.ArrayList;

/*
 * A class to represent a zoo.
 * A zoo can either have unlimited animal capacity or limited animal capacity.
 * For limited capacity zoos, animals on loan to other zoo collections still count towards the 
 * capacity (there must be space reserved for when an animal is returned).
 */
public class Zoo {
    private int capacity;
    private boolean unlimitedCapacity;
    private List<Animal> animalList;


    /*
     * Construct a Library with unlimited capacity.
     */
    public Zoo() {
        this.unlimitedCapacity = true;
        this.animalList = new ArrayList<Animal>();
    }

    /*
     * Construct a Library with limited capacity.
     */
    public Zoo(int inCapacity) {
        this.capacity = inCapacity;
        this.animalList = new ArrayList<Animal>();

        if (capacity < 1) {
            throw new IllegalArgumentException("Error");
        }
    }

    public void addAnimal(Animal newAnimal) {
        int totalAnimals = newAnimal.getTotalAnimals();
        for (int i = 0; animalList.size() > i; i++) {
            totalAnimals = totalAnimals + animalList.get(i).getTotalAnimals();
        }
        if (!unlimitedCapacity && totalAnimals > capacity) {
            throw new IllegalStateException("Too many Animals");

        }
        animalList.add(newAnimal);
    }

    public boolean hasAnimalWithName(String animalName) {
        for (Animal animal: animalList)  {
            if (animal.getName().equalsIgnoreCase(animalName)) return true;
        }
        return false;

    }

    public Animal getAnimalWithName(String animalName) {
        for (Animal animal: animalList){
            if(animal.getName().equalsIgnoreCase(animalName)) return animal;

        }
        return null;
    }

    public int numberAvailableAnimals() {
        int animalNum = 0;
        for (Animal animal : animalList) {
            animalNum += animal.getAvailableAnimals();

        }
        return animalNum;

    }
    public int getTotalAnimalCount(){
        int animalCount = 0;

        return animalCount;

    }

}


