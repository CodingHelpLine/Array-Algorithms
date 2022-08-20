/**
 * Rotate Array Algorithm
 * 
 * @author Programmer
 */
public class RotateArray {
   
    // array field
    private int array []; 
    
    // Fill array object
    private FillArray fillArray; 
    
    // constructor
    public RotateArray(int size) {
        this.array = new int[size]; 
        
        // fill array object
        this.fillArray = new FillArray();
        
        // Fill array
        this.fillArray.fillArray(array);  // sequential numbers 1-N
    }

    /**
     * Rotate function to rotate array toward right N position
     * 
     * @param n position right shift
     */
    public void rotate(int n) {
        
        for(int i=0; i<n; i++) { // rotations loop
            
            // now we store last element
            int last = array[array.length - 1]; 
            
            // we iterate and make a hole at first element
            for(int j=array.length-1; j>0; j--) {
                array[j] = array[j-1]; //shift right
            }
            
            // store the last element to the first
            array[0] = last; 
        }
        
    }
    
    /**
     * Print array
     */
    public void printArray() {
        this.fillArray.printArray(array);
    }
    
    
}
