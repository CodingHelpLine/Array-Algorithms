
import java.util.Arrays;

/**
 *
 * @author Programmer
 */
public class BinarySearchIterative {
    
    // array 
    private int array []; 
    
    // fill array object
    private FillArray fillArray; 
    
    public BinarySearchIterative(int min, int max, int size) {
        // create array
        array = new int[size]; 
        
        // Create fill array object
        this.fillArray = new FillArray(); 
        
        // Fill the array
        this.fillArray.fillArray(array, min, max);
    }
    
    // Binary search function
    // 1. Sorted array
    // 2. do the binary search
    
    // sort the array in ascending order using java.util.Arrays class
    public void sort() {
        Arrays.sort(array);
    }
    
    // print the array
    public void printArray() {
        this.fillArray.printArray(array);
    }
    
    // generate random numbers
    public int generate(int min, int max) {
        return this.fillArray.generateRandom(min, max); 
    }
    
    /**
     * Binary search: return matching index or -1 
     * @param key
     * @return 
     */
    public int search(int key) {
        
        int low = 0; // first element
        int high = array.length - 1; // last element index
        
        // while loop 
        while(low <= high) {
            int mid = (low + high) / 2; 
            
            // match mid value, if match return mid
            if(array[mid] == key) {
                return mid; 
            } else if(array[mid] > key) {
                high = mid - 1; // adjust segment to search next
            } else {
                low = mid + 1; 
            }
        }
        
        return -1; 
    }  
    
}
