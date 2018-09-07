import java.util.Random;

/**
 * Creates a Scores object with size 100
 * Assigns each index a random value from -100 to 100
 * Prints out Score object's contents
 * Adds the number 86
 * Prints Scores object's size
 * Removes random index from Scores object
 * gets and stores index value 75 of Scores object
 * Prints frequency value at index 75 is in Scores object
 * Prints frequency value of 86
 * Prints if Scores object contains 86
 * @author Graham Thompson
 * @version
 */
public class Client {

    /**
     * Creates a Scores object with size 100 Assigns each index a random value
     * from -100 to 100 Prints out Score object's contents Adds the number 86
     * Prints Scores object's size Removes random index from Scores object gets
     * and stores index value 75 of Scores object Prints frequency value at
     * index 75 is in Scores object Prints frequency value of 86 Prints if
     * Scores object contains 86
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scores bag = new Scores(100);
        Random rand = new Random();
        for(int i=0; i <100; i++){
            bag.add(rand.nextInt(201)-100);
        }
        System.out.println("Bag's contents: " + bag.toString());
        bag.add(86);
        System.out.println("Bag's current size: " + bag.getCurrentSize());
        bag.remove();
        int index75 = bag.get(75);
        System.out.println("Frequency of value " + index75 + " which was at index 75: " + bag.getFrequency(index75));
        bag.remove(index75);
        System.out.println("Frequency of value " + index75 + " which was at index 75: " + bag.getFrequency(index75));
        System.out.println("Frequency of value 86: " + bag.getFrequency(86));
        System.out.println("Does bag contain value 86: " + bag.contains(86));
    }
    
}
