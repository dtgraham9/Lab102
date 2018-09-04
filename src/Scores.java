
import java.util.Random;

/**
 * Implements abstract methods from Bag
 * Initializes int array and int count
 * @author Graham Thompson
 * @version
 */
public class Scores implements Bag
{
    int[] list;
    int count;
    
    /**
     * Returns the count of numbers in the bag
     * @return 
     */
    @Override
    public int getCurrentSize() {
        return this.count;
    }
    
    /**
     * Checks if the bag is empty,
     * returns true if empty
     * @return 
     */
    @Override
    public boolean isEmpty() {
        return this.count==0;
    }
    
    /**
     * adds the number num to the bag
     * @param num 
     */
    @Override
    public void add(int num) {
        if(this.list.length == this.count){
            int[] temp = new int[this.list.length *2];
            for(int i = 0; i < this.list.length; i++){
                temp[i] = this.list[i];
            }
            temp[this.list.length] = num;
            this.list = temp;
            temp = null;
            this.count++;
        }
        else{
            int i =0;
            while(!(this.list[i]==0)){
                i++;
            }
            this.list[i]=num;
            this.count++;
            
        }
    }

    /**
     * removes the first occurrence of the number num
     * from the bag
     * @param num 
     */
    @Override
    public void remove(int num) {
        int i = 0;
        while(!(this.list[i]==num) && i < this.count){
            i++;
        }
      if((this.list.length-1) == i){
            this.list[i] = 0;
            this.count--;
    }
        else{
            for(int y = i; y < this.list.length-1; y++){
                this.list[y] = this.list[y+1];
            }
            this.count--;
        }
    }
    
    /**
     * removes a randomly selected selected entry 
     * from the bag
     */
    @Override
    public void remove() {
        Random rand = new Random();
        int index = rand.nextInt(this.count);
        for(int i = index; this.count-1 > i; i++){
            this.list[i]= this.list[i+1];
        }
        this.count--;
    }
    
    /**
     * removes all the numbers from the bag
     */
    @Override
    public void clear() {
        for(int i = this.count-1; i>=0; i--){
            this.list[i] = 0;
        }
        this.count=0;
    }
    
    /**
     * returns a count of the number of times
     * the number num exists in the bag
     * @param num
     * @return 
     */
    @Override
    public int getFrequency(int num) {
        int instances = 0;
        int i = 0;
        while(i < this.count){
            instances = num == this.list[i] ? instances+1 : instances;
            i++;
        }
        return instances;
    }
    
    /**
     * Tests whether the bag contains the number num.
     * Returns true when nm is contained in the bag
     * @param num
     * @return 
     */
    @Override
    public boolean contains(int num) {
        int i = 0;
        while(i < this.count){
            if(num == this.list[i]){
                return true;
            }
            i++;
        }
        return false;
    }
    
    /**
     * returns a String of the contents (array values and number of elements) of
     * the bag
     *
     * @return
     */
    @Override
    public String toString(){
        String print = "";
        for(int i =0; i<this.list.length-1; i++){
            print += this.list[i] + ", ";
        }
        print+=this.list[this.list.length-1] + "\n";
        print+="Length: " + this.count;
        return print;
    }
    
    /**
     * returns int at i index, but throws exception 
     * if index is inside the currently filled section of array
     * @param i
     * @return 
     */
    public int get(int i){
        if(0 <= i && i<=(this.count-1)){
            return this.list[i];
        }
        else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    /**
     * Tests to see if count and the order of the values are the same
     * @param o
     * @return 
     */
    @Override
    public boolean equals(Object o){
        if ( !( o instanceof Scores ) )
            return false;   
        Scores e = ( Scores ) o;
        if(e.count != this.count){
            return false;
        }
        else{
            for(int i = 0; i < e.count; i++){
                if(e.list[i]!=this.list[i]){
                    return false;
                }
            }
        return true;
        }
    }
    
    /**
     * Default constructor for Scores creates int array
     * of length 50
     */
    public Scores(){
        this.list = new int[50];
        this.count = 0;
    }
    
    /**
     * Overloaded constructor for Scores that creates int array
     * of length parameter size
     * @param size 
     */
    public Scores(int size){
        this.list = new int[size];
        this.count = 0;
    }
    
    
}
