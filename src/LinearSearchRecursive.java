/**
 * Recursively Scan the array to find the key. If found return index
 * Otherwise return -1. 
 * 
 * @author Programmer
 */
public class LinearSearchRecursive {
   
    // array declaration
    private int array []; 
    
    // fill array object
    private FillArray fillArray; 
    
    /**
     * Create an array of size elements, fill with min/max range of random
     * numbers. 
     * 
     * @param min
     * @param max
     * @param size 
     */
    public LinearSearchRecursive(int min, int max, int size) {
       this.array = new int[size]; 
       
       // object
       this.fillArray = new FillArray(); 
       
       // fill the array
       this.fillArray.fillArray(array, min, max);
    }
    
    /** 
     * Wrapper function to use the recursive function. 
     * 
     * @param key to search
     * @return index of found element, or -1
     */
    public int search(int key) {
        return search(0, key); 
    }
    
    /**
     * Recursively scan the array and find the match
     * if found return index, otherwise -1
     * 
     * @param index
     * @param key
     * @return 
     */
    private int search(int index, int key) {
       // base case 1:: failure
       if(index >= array.length) {
           return -1; 
       }
       
       // base case 2:: success
       if(array[index] == key) {
           return index; 
       }
       
       // recursive step
       return search(index+1, key); // repeats till we meet one of the 
       // base case
    }
    
    public void printArray() {
        this.fillArray.printArray(array);
    }
    
    // generate random number in the range. 
    public int generate(int min, int max) {
        return this.fillArray.generateRandom(min, max);
    }
    
}
