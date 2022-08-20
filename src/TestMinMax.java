/**
 *
 * @author Programmer
 */
public class TestMinMax {
    
    /**
     * Starting point of the program. 
     * 
     * @param args 
     */
    public static void main(String [] args) {
       
        // Declare values
        final int MIN = 1; 
        final int MAX = 100; 
        final int SIZE = 100; 
        
        // create object
        FindMinMax object = new FindMinMax(MIN, MAX, SIZE);
        
        // call functions to find out min/max
        int min = object.findMin();
        int max = object.findMax(); 
        
        // print array
        System.out.println("Array:\n");
        object.printArray();
        
        // now print min/max
        System.out.printf("%nMinimum Element: %d%n", min);
        System.out.printf("%nMaximum Element: %d%n", max);
    }
}
