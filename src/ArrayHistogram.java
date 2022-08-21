
import java.util.Arrays;

/**
 *
 * @author Programmer
 */
public class ArrayHistogram {
        
    // array
    private int array []; 
    
    // fill class
    private FillArray fillArray; 
    
    // Declare the array of frequencies
    private int table []; 
    
    private int min; 
    private int max;
    
    
    /**
     * 
     * @param min
     * @param max
     * @param size 
     */
    public ArrayHistogram(int min, int max, int size) {
        this.array = new int[size]; 
        this.min = min;
        this.max = max;
        
        // we don't need initialize this array elements to zero
        // Java by default intializes it. In case of C/C++ 
        // we have to initialize every element to 0. 
        this.table = new int[max+1]; // min - max range 
        this.fillArray = new FillArray(); 
        
        // fill array
        this.fillArray.fillArray(array, min, max);
    }
    
    public void printFrequencyTable() {
        System.out.printf("%-10s %-10s%n", "Number", "Frequency");
        for(int i=min; i<max; i++) {
            System.out.printf("%-10d %-10d%n", i, table[i]);
        }
    }
    
    public void printArray() {
        Arrays.sort(array);
        this.fillArray.printArray(array);
    }
    
    /**
     * Mode - most frequent number
     * 
     * @return mode 
     */
    public int getMode() {
        int mode = min; // first number in range
        int frequency = table[0]; // first element count in table
        
        for(int i=1; i<table.length; i++) {
            if(table[i] > frequency) {
                mode = i;
                frequency = table[i];
            }
        }
        
        return mode;      // zero basd index so 1 is stored at 0 index 
    }
    
    /**
     * Compute Frequencies
     */
    public void buildTable() {
        for(int i=0; i<array.length; i++) {
            table[array[i]] += 1;
        }
    }
    
    /**
     * print histogram
     */
    public void displayHistogram() {
        
        for(int i=min; i<max; i++) {
            System.out.printf("%5d: ", i); 
            for(int j=0; j<table[i]; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        
        /*
        1: ####
        2: ####### 
        
        */
    }
}
