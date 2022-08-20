/**
 *
 * @author Programmer
 */
public class TestReverseArray {
    
    /**
     * Entry point of program. 
     * 
     * @param args 
     */
    public static void main(String [] args) {
       
        // Create object
        final int SIZE = 10; 
        
        ReverseArray object = new ReverseArray(SIZE); 
        
        // Print before reverse
        System.out.println("Array before Reverse: ");
        object.printArray();
        
        // reverse
        object.reverse();
        
        // Print before reverse
        System.out.println("\nArray after Reverse: ");
        object.printArray();
        
        
    }
    
}
