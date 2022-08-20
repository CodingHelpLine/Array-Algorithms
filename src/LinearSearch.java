/**
 *
 * @author Programmer
 */
public class LinearSearch {
    
    // declare array
    private int array []; 
    
    // Declare fillArray 
    private FillArray fillArray; 
    
    /**
     * Create array of Size elements and fill will range of 
     * random numbers between Min and Max
     * 
     * @param min
     * @param max
     * @param size 
     */
    public LinearSearch(int min, int max, int size) {
       
        this.array = new int[size]; 
        
        // fill array object
        this.fillArray = new FillArray(); 
        
        // Fill by calling funtion
        this.fillArray.fillArray(array, min, max);
    }
    
    public void printArray() {
        this.fillArray.printArray(array);
    }
    
    /**
     * Function to search the key and return its index 
     * if it is found in the array. If not, then return -1
     * 
     * @param key to search
     * @return index of found element
     */
    public int search(int key) {
        
        // initialize to -1 to indicate found
        int index = -1; 
        
        
        for(int i=0; i<array.length; i++) {
            if(array[i] == key) {
                index = i; 
                break; 
            }
        }
        
        return index; 
    }
}
