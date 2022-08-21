
import java.util.Arrays;

/**
 *
 * @author Programmer
 */
public class Test {
    
    private int array[];
    
    private FillArray fillArray;
    
    public Test(int size) {
        this.fillArray = new FillArray();
        this.array = new int[size]; 
        fillArray.fillArray(array); // fill 1-N
    }
    
    public void fillRandom(int min, int max) {
        fillArray.fillArray(array, min, max);
    }
       
    
    /**
     * Rotate array N positions
     * 
     * @param n 
     */
    public void rotate(int n) {
       
        // Number of positions to rotate
        for(int i=0; i<n; i++) {
            
            // store last element
            int last = array[array.length-1];
            
            // shift elements to the right 1 position
            // make hole at first element
            for(int j=array.length-1; j>0; j--) {
                array[j] = array[j-1];
            }
            
            // store last element to first element
            array[0] = last;           
            
        }
    }
    
    // print array
    public void printArray() {
        this.fillArray.printArray(array);
    }
    
    // iterative 
    public int search(int x) {
        int index = -1; 
        
        for(int i=0; i<array.length; i++) {
            if(array[i] == x) {
                index = i; 
                break; 
            }
        }
        
        return index; 
    }
    
    public int searchRecursive(int x) {
        return searchRecursive(array, 0, x);
    }
    
    private int searchRecursive(int array [], int index, int key) {
        if(index == array.length) {
            return -1;
        }
        
        if(array[index] == key) {
            return index;
        }
        
        return searchRecursive(array, index+1, key);
    }
    
    /**
     * Iterative binary search
     * 
     * @param key 
     */
    public int binarySearch(int key) {
       int low = 0; 
       int high = array.length -1; 
       
       while(low <= high) {
           int mid = (high + low) / 2; 
           
           if(array[mid] == key) {
               return mid; 
           } else if(array[mid] > key) {
               high = mid-1;
           } else {
               low = mid + 1;
           }
       }
       
       return -1; // not found
    }
    
    public int binarySearch(int low, int high, int key) {
        
        
        if(low > high) return -1; 
        
        int mid = low + high;
        if(array[mid] == key) return mid;
        
        if(array[mid] > key) {
            high = mid - 1; 
        } else {
            low = mid + 1;
        }
        
        return binarySearch(low, high, key);
    }
    
    public void sort() {
        Arrays.sort(array);
    }
    
    public void median() {
        Arrays.sort(array);
        
        if(array.length % 2 == 0) {
            int mid = array.length / 2;
            
            double total = array[mid] + array[mid+1];
            total /= 2;
            System.out.println(total);
        } else {
            int mid = array.length / 2;
            
            double total = array[mid];
            total /= 2;
            System.out.println(total);
        }
    }
    
    public static void main(String [] args) {
        
        final int SIZE = 30; 
        final int MIN = 1; 
        final int MAX = 50;
        Test object = new Test(SIZE);
        
        // fill random values
        object.fillRandom(MIN, MAX);
        
        //print before rotate
        object.printArray(); // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

        int index;
        
        // Linear search iterative
        System.out.println("\nLinear Search Iterative: ");
        for(int i=1; i<10; i++) {
            index = object.search(i);
            
            if(index >= 0) {
                System.out.printf("<< %d exists in the array at index [%d]>>%n", i, index);
            } else {
                System.out.printf("%d doesn't exist in the array%n", i);
            }
        }
        
        // Linear search Recursive
        System.out.println("\nLinear Search Recursive: ");
        for(int i=1; i<10; i++) {
            index = object.searchRecursive(i);
            
            if(index >= 0) {
                System.out.printf("<< %d exists in the array at index [%d]>>%n", i, index);
            } else {
                System.out.printf("%d doesn't exist in the array%n", i);
            }
        }
        
        // binary search sort
        object.sort();
        
        // print sorted
        System.out.println("\nSorted Array: ");
        object.printArray();
        
        // Linear search iterative
        System.out.println("\nLinear Search Iterative: ");
        for(int i=1; i<10; i++) {
            index = object.binarySearch(i);
            
            if(index >= 0) {
                System.out.printf("<< %d exists in the array at index [%d]>>%n", i, index);
            } else {
                System.out.printf("%d doesn't exist in the array%n", i);
            }
        }
        
        // Linear search Recursive
        System.out.println("\nLinear Search Recursive: ");
        for(int i=1; i<10; i++) {
            index = object.binarySearch(0, SIZE-1, i);
            
            if(index >= 0) {
                System.out.printf("<< %d exists in the array at index [%d]>>%n", i, index);
            } else {
                System.out.printf("%d doesn't exist in the array%n", i);
            }
        }
        
        object.median();
    }
}
