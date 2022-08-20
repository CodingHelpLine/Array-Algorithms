
import java.util.Arrays;

/**
 *
 * @author Programmer
 */
public class BinarySearchRecursive {
    // array 
    private int array[];

    // fill array object
    private FillArray fillArray;

    public BinarySearchRecursive(int min, int max, int size) {
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
     * Wrapper function for the Binary Search 
     * 
     * @param key
     * @return found index or -1 
     */
    public int search(int key) {
        // this is recursively function. 
        return search(0, array.length-1, key);
    }
    
    /**
     * search within the range of given low and high index
     * 
     * if key found, return index, otherwise return -1
     * 
     * @param low
     * @param high
     * @param key
     * @return 
     */
    private int search(int low, int high, int key) {
        
        // base case: Not found
        if(low > high) {
            return -1; 
        }
        
        // mid point of index
        int mid = (low + high) / 2; 
        
        // base case 2: found
        if(array[mid] == key) {
            return mid; // index of matching element
        }
        
        // Adjust the array segments or halves
        if(array[mid] > key) { // search in left half
            high = mid - 1; 
        } else { // search in the right half
            low = mid + 1; 
        }
        
        // recursive call
        return search(low, high, key); // updated indices
    }
}
