/**
 * Find Minimum and Maximum Element in the Array. 
 * 
 * @author Programmer
 */
public class FindMinMax {
   
    // declare fill array object
    private FillArray fillArray; 
    
    // array
    private int array []; 
    
    /**
     * Constructor to initialize the object. 
     * 
     * @param min minimum of range
     * @param max maximum of range
     * @param size number of elements in the array
     */
    public FindMinMax(int min, int max, int size) {
        fillArray = new FillArray(); 
        
        // allocate array
        this.array = new int[size]; 
        
        // fill array by calling method
        fillArray.fillArray(array, min, max);
    }
    
    /**
     * Find the maximum element and return it. 
     * 
     * @return maximum element 
     */
    public int findMax() {
        int max = array[0]; // first element
        
        // iterate starting from index 1 
        for(int index=1; index<array.length; index++) {
            if(array[index] > max) {
                max = array[index];
            }
        }
        
        return max;
    }
    
    /**
     * Find the minimum of array elements. 
     * 
     * @return minimum element 
     */
    public int findMin() {
      int min = array[0];
      
      for(int index=1; index < array.length; index++) {
          if(array[index] < min) {
              min = array[index];
          }
      }
    
      return min;
    }
    
    /**
     * Print the array. 
     */
    public void printArray() {
        this.fillArray.printArray(array);
    }
    
}
