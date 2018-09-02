
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thompson
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scores bag = new Scores(100);
        Random rand = new Random();
        for(int i=0; i <100; i++){
            bag.add(rand.nextInt(201)-100);
        }
        System.out.println(bag.toString());
        bag.add(86);
        System.out.println(bag.getCurrentSize());
        bag.remove();
        int index75 = bag.get(75);
        System.out.println(bag.getFrequency(index75));
        bag.remove(index75);
        System.out.println(bag.getFrequency(index75));
        System.out.println(bag.getFrequency(86));
        System.out.println(bag.contains(86));
    }
    
}
