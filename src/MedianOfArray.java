
import java.util.Arrays;

/**
 *
 * @author Programmer
 */
public class MedianOfArray {
    
    // array
    private int array []; 
    
    // fill array 
    private FillArray fillArray;
    
    /**
     * Create array of size elements, in range min and max
     * 
     * @param min
     * @param max
     * @param size 
     */
    public MedianOfArray(int min, int max, int size) {
       // allocate memory
       this.array = new int[size]; 
       
       // fill array object
       this.fillArray = new FillArray(); 
       
       // fill the array
       this.fillArray.fillArray(array, min, max);
    }
    
    public void printArray() {
        this.fillArray.printArray(array);
    }
    
    public void sortArray() {
        Arrays.sort(array);
    }
    
    public double calcMedian() {
        
        double median = 0; 
        double total = 0; 
        
        
        
        // determine array length is even or odd
        if(array.length % 2 == 0) {
            int mid = array.length / 2; 
            total = array[mid] + array[mid+1]; 
            median = total / 2; // centeral value
        } else {
            int mid = array.length; 
            median = array[mid];
        }
        
        return median; 
    }
}
