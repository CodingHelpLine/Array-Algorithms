import java.util.Random;

/**
 * Class will fill a given array of size N, in a range
 * of integers Min-Max
 * 
 * @author Programmer
 */
public class FillArray {
    
    // Delcare Random object at class level
    private static Random random = new Random();
    
    /**
     * Fill an array of given size with given range of integers. 
     * 
     * @param array
     * @param min
     * @param max 
     */
    public void fillArray(int array [], int min, int max) {
        
        // fill the array
        // iterate using for loop size time
        for(int counter = 0; counter < array.length; counter++) {
            array[counter] = generateRandom(min, max); 
        }
    }
    
    /**
     * Print the array
     * 
     * @param array 
     */
    public void printArray(int array []) {
        // loop to pirnt 10 elements on a line
        for(int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d", array[counter]); 
            
            // New line after every 10 elements
            if((counter + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

    /**
     * Generate Random number in a given range. 
     * 
     * @param min
     * @param max
     * @return random number 
     */
    public int generateRandom(int min, int max) {
        return random.nextInt(max - min) + min; 
    }
    
    /**
     * Fill the array with sequence from 1 to N
     * 
     * @param array 
     */
    public void fillArray(int array []) {
       for(int i=0; i<array.length; i++) {
           array[i] = i + 1;  // 1 to N
       } 
    }
    
}
