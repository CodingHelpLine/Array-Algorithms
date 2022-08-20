/**
 * Simple test class
 * @author Programmer
 */
public class TestFillArray {
    
    public static void main(String [] args) {
        // Create objectd of FillArray
        FillArray object = new FillArray();
        
        // Define range parameters
        // Change the range of elements 1-100
        int max = 100; 
        int min = 1;   // range 1-100
        
        // array declaration
        int size = 100; 
        int array [] = new int[size]; // array of 100 elements
        
        // Lets fill the array
        object.fillArray(array, min, max);
        
        // Let print the array 
        object.printArray(array);
    }
}
