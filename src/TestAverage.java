
import java.util.Arrays;

/**
 *
 * @author Programmer
 */
public class TestAverage {
    
    public static void main(String [] args) {
        
        // object creation
        final int MIN = 1;
        final int MAX = 100; 
        final int SIZE  = 20; 
        
        // FILL OUR ARRAY TO BE USED IN THE ALGORITHMS
        AverageArray object = new AverageArray(MIN, MAX, SIZE);
        
        System.out.println("Array:");
        object.printArray();
        System.out.println();
        
        // call functions and print average
        System.out.printf("Average of all the Array elements:      %.2f%n", 
                    object.calcAverage());
        System.out.printf("Average of Even elements of array:      %.2f%n", 
                    object.calcAverageEvenElements());
        System.out.printf("Average of Odd elements of array:       %.2f%n", 
                    object.calcAverageOddElements());
        System.out.printf("Average of Even Indexed arary elements: %.2f%n", 
                    object.calcAverageEvenIndexedElements());
        System.out.printf("Average of Odd Indexed array elements:  %.2f%n", 
                    object.calcAverageOddIndexedElements());
    }
}
