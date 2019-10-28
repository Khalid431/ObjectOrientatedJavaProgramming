//Name: Khalid Mohamoud
//Student No.: c1536842


/*
 * A class to represent a number of instances of a zoo animal.
 */
public class Animal {

    private String name;
    private int totalNumAnimals;
    private int availableAnimals;

    // Define fields here
    // to be completed

    /*
     * Constructor method for creating an animal with a given name
     * and number of  animal instances.
     * This constructor checks that the total number of instances argument is
     * valid; i.e., the number of animals should be 1 or more.
     * If not valid, the constructor will throw an IllegalArgumentException with
     * an appropriate error message.
     */
    public Animal(String inName, int inTotalNumAnimals) {
        availableAnimals = inTotalNumAnimals;
        this.name = inName;
        this.totalNumAnimals = inTotalNumAnimals;
        if (inTotalNumAnimals < 1) {
            throw new IllegalArgumentException("Number must be greater than 0");
        }
    }

    /*
     * An accessor method that returns the animals name.
     */
    public String getName() {

        return this.name;
    }

    /*
     * An accessor method that returns the total number of instances of this animal.
     * This should count both animal on loan to other collections and returned animals from other collections.
     */
    public int getTotalAnimals() {
        return this.totalNumAnimals;
    }

    /*
     * Returns the number of instances of the animal that are available
     * (i.e., not on loan to another collection).
     */
    public int getAvailableAnimals() {
        return availableAnimals;
    }

    /*
     * Mark one of the instances of this animal as on loan to another collection.
     * If there are no available instances to loan to another collection, then this method should
     * throw an IllegalStateException with an appropriate error message.
     */
    public void loanAnimal() {
        if (availableAnimals < 1) {
            throw new IllegalStateException("No Animals on Loan");
        }
        availableAnimals--;
    }


    /*
     * Mark one of the instances of this animal as returned from another collection.
     * If none of the instances of this animal are on loan to other collections, this method
     * should throw an IllegalStateException with an appropriate error message.
     */
    public void returnAnimal() {
        if (totalNumAnimals == availableAnimals) {
            throw new IllegalStateException("No Animals Loaned");
        }
        availableAnimals++;
    }

}



