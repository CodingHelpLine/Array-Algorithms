/**
 * Test Sum Algorithms
 * 
 * @author Programmer
 */
public class TestSumArray {
   
    /**
     * Starting point of program. 
     * 
     * @param args 
     */
    public static void main(String [] args) {
       
        // create object
        final int MIN = 1; 
        final int MAX = 100; 
        final int SIZE = 100;
        
        SumArray object = new SumArray(MIN, MAX, SIZE);
        
        // Print the array
        object.printArray();
        
        // call functions to print results
        System.out.printf("%nSum of all elements:        %d%n", 
                    object.sum());
        System.out.printf("Sum of Odd elements:          %d%n", 
                    object.sumOdd());
        System.out.printf("Sum of Even elements:         %d%n", 
                    object.sumEven());
        System.out.printf("Sum of odd Index elements:    %d%n", 
                    object.sumOddIndex());
        System.out.printf("Sum of Even Index elements:   %d%n", 
                    object.sumEvenIndex());
        
    }    
}
