/**
 * 1. Average of all the elements. 
 * 2. Average of all the even elements. 
 * 3. Average of all the odd elements. 
 * 4. Average of all the even Indexed elements. 
 * 5. Average of all the odd Indexed elements. 
 * 
 * @author Programmer
 */
public class AverageArray {
   
    // start array delcaration
    private int [] array;
    
    // Fill object
    private FillArray fillArray;
    
    /**
     * Initialize the array with size, fill with random numbers
     * in the range of Min and Max
     * 
     * @param min
     * @param max
     * @param size 
     */
    public AverageArray(int min, int max, int size) {
       this.array = new int[size]; 
       
       this.fillArray = new FillArray();
       
       // fill the array
       this.fillArray.fillArray(array, min, max);
    }
    
    public void printArray() {
        this.fillArray.printArray(array);
    }
    
    // Average of all the elements
    public double calcAverage() {
        double total = 0; 
        
        // iterate all elements
        for(int i=0; i<array.length; i++) {
            total += array[i];
        }
        
        return total / array.length;
    }
    
    // Average of all even elements of the array
    public double calcAverageEvenElements() {
        double total = 0; 
        int count = 0;
        
        // iterate all elements
        for(int i=0; i<array.length; i++) {
            
            if(array[i] % 2 == 0) {            
                total += array[i];
                count++;
            }
        }
        
        return total / count;
    }
    
    // Average of all Odd Indexed elements of the array
    public double calcAverageOddIndexedElements() {
        double total = 0; 
        int count = 0;
        
        // iterate all elements
        for(int i=0; i<array.length; i++) {
            
            if(i % 2 != 0) {            
                total += array[i];
                count++;
            }
        }
        
        return total / count;
    }
    
    
    // Average of all even Indexed elements of the array
    public double calcAverageEvenIndexedElements() {
        double total = 0; 
        int count = 0;
        
        // iterate all elements
        for(int i=0; i<array.length; i++) {
            
            if(i % 2 == 0) {            
                total += array[i];
                count++;
            }
        }
        
        return total / count;
    }
    
    // Average of all Odd elements of the array
    public double calcAverageOddElements() {
        double total = 0; 
        int count = 0;
        
        // iterate all elements
        for(int i=0; i<array.length; i++) {
            
            if(array[i] % 2 != 0) {            
                total += array[i];
                count++;
            }
        }
        
        return total / count;
    }
    
    
}
