/**
 * Reverse an Array
 * 
 * @author Programmer
 */
public class ReverseArray {
   
    // array to hold numbers
    private int array []; 
    
    // fill array object
    private FillArray fillArray; 
    
    /**
     * Initialize array with a given size. 
     * 
     * @param size 
     */
    public ReverseArray(int size) {
       
        // allocate array
        this.array = new int[size]; 
        
        // fill object
        this.fillArray = new FillArray();
        
        // Fill array with a sequence
        this.fillArray.fillArray(array);
    }
    
    /**
     * Function to reverse the array. 
     * 
     * 
     */
    public void reverse() {
      // delcare index
      int start = 0; //first element
      int end = array.length - 1; 
      
      // while loop 
      while (start <= end) {
          int tmp = array[start]; // first element
          array[start] = array[end]; // swaping of last
          array[end] = tmp; // store the first
          
          start++;
          end--; 
      }
    }
    
    /**
     * Print the function. 
     */
    public void printArray() {
        this.fillArray.printArray(array);
    }
}
