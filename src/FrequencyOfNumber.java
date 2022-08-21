/**
 *
 * @author Programmer
 */
public class FrequencyOfNumber {
    
    // array
    private int array []; 
    
    // Fill object
    private FillArray fillArray; 
    
    
    /**
     * Generate array of Size elements, and fill with random numbers
     * within the range of Min and Max
     * 
     * @param min
     * @param max
     * @param size 
     */
    public FrequencyOfNumber(int min, int max, int size) {
       this.array = new int[size]; 
       
       this.fillArray = new FillArray();
       
       // fill array
       this.fillArray.fillArray(array, min, max);
    }
    
    public void printArray() {
        this.fillArray.printArray(array);
    }
    
    /**
     * Get the number of time key occurred within the array. 
     * 
     * @param key
     * @return frequency 
     */
    public int getFrequency(int key) {
        int frequency = 0; 
        
        for(int i=0; i<array.length; i++) {
            if(array[i] == key) {
                frequency++;
            }
        }
        
        return frequency; 
    }
    
    public int generate(int min, int max) {
        return this.fillArray.generateRandom(min, max);
    }
}
