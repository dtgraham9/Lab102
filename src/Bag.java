/**
 * Bag provides abstract methods for managing
 * @author Graham Thompson
 * @version 
 */
public interface Bag {
    
    /**
     * Returns the count of numbers in the bag
     * @return 
     */
    public abstract int getCurrentSize();
    
    /**
     * Checks if the bag is empty,
     * returns true if empty
     * @return 
     */
    public abstract boolean isEmpty();
    
    /**
     * adds the number num to the bag
     * @param num 
     */
    public abstract void add(int num);
    
    /**
     * removes the first occurrence of the number num
     * from the bag
     * @param num 
     */
    public abstract void remove(int num);

    /**
     * removes a randomly selected selected entry 
     * from the bag
     */
    public abstract void remove();
    
    /**
     * removes all the numbers from the bag
     */
    public abstract void clear();
    
    /**
     * returns a count of the number of times
     * the number num exists in the bag
     * @param num
     * @return 
     */
    public abstract int getFrequency(int num);
    
    /**
     * Tests whether the bag contains the number num.
     * Returns true when nm is contained in the bag
     * @param num
     * @return 
     */
    public abstract boolean contains(int num);
    
    /**
     * returns a String of the contents of the bag
     * @return 
     */
    @Override
    public abstract String toString();
    
    /**
     * returns true if the parameter o exactly matches
     * the contents of the bag.  Same numbers in the same order
     * @param o
     * @return 
     */
    @Override
    public abstract boolean equals(Object o);
}
