
import java.util.Random;

/**
 *
 * @author Thompson
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
        while(!(this.list[i]==num)){
            i++;
        }
        if(this.list.length == i){
            
        }
        
        else if((this.list.length-1) == i){
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
        for(int i = this.list.length-1; i>=0; i--){
            this.list[i] = 0;
        }
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
        while(i < this.list.length){
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
        while(i < this.list.length){
            if(num == this.list[i]){
                return true;
            }
            i++;
        }
        return false;
    }
    
    /**
     * returns a String of the contents of the bag
     * @return 
     */
    @Override
    public String toString(){
        String print = "";
        for(int i =0; i<this.list.length-1; i++){
            print += this.list[i] + ", ";
        }
        print+=this.list[this.list.length-1];
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
    
    public Scores(){
        this.list = new int[50];
        
    }
    
    public Scores(int size){
        this.list = new int[size];
    }
    
    
}
