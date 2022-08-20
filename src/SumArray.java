/**
 * Sum of all elements
 * Sum of odd elements
 * Sum of even elements
 * Sum of odd index elements
 * Sum of even index elements
 * 
 * @author Programmer
 */
public class SumArray {
   
    // array to hold values
    private int array []; 
    
    // fill array object
    private FillArray fillArray; 
    
    /**
     * Fill array with min-max range of size elements
     * 
     * @param min lowest in range
     * @param max highest in range
     * @param size number of elements
     */
    public SumArray(int min, int max, int size) {
        
        // Fill object
        this.fillArray = new FillArray(); 
        
        // array allocate
        this.array = new int[size]; 
        
        // fill the array randomly in range of min-max
        this.fillArray.fillArray(array, min, max);
    }
    
    // Sum of all the elements
    public int sum() {
        int total = 0;
        
        for(int i=0; i<array.length; i++) {
            total += array[i];
        }
        
        return total; 
    }
    
    // sum of odd elements
    public int sumOdd() {
        int total = 0; 
        
        for(int i=0; i<array.length; i++) {
            if(array[i] % 2 != 0) {
                total += array[i];
            }
        }
        
        return total; 
    }
    
    // sum of Even elements
    public int sumEven() {
        int total = 0; 
        
        for(int i=0; i<array.length; i++) {
            if(array[i] % 2 == 0) {
                total += array[i];
            }
        }
        
        return total; 
    }
    
    // sum of odd index element
    public int sumOddIndex() {
        int total = 0; 
        
        for(int i=0; i<array.length; i++) {
            if(i % 2 != 0) {
                total += array[i];
            }
        }
        
        return total; 
    }
    
    // sum of even index element
    public int sumEvenIndex() {
        int total = 0; 
        
        for(int i=0; i<array.length; i++) {
            if(i % 2 == 0) {
                total += array[i];
            }
        }
        
        return total; 
    }
    
    // print  the array 
    public void printArray() {
        this.fillArray.printArray(array);
    }
}
