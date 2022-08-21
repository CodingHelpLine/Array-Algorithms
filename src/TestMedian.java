/**
 *
 * @author Programmer
 */
public class TestMedian {
    
    public static void main(String args []) {

        // constants
        final int MIN = 1; 
        final int MAX = 100; 
        final int SIZE = 50; 

        MedianOfArray object = new MedianOfArray(MIN, MAX, SIZE);

        // print array
        System.out.println("Unsorted: ");
        object.printArray();
        
        //sort the array
        object.sortArray();
        
        // print array
        System.out.println("\nSorted: ");
        object.printArray();
        
        // Call function to print median
        System.out.printf("Median of Array: %.2f%n", object.calcMedian());
    }
    
}
