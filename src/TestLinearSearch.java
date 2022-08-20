/**
 *
 * @author Programmer
 */
public class TestLinearSearch {
    
    public static void main(String [] args) {
        
        // object
        final int MIN = 1; 
        final int MAX = 30; 
        final int SIZE = 50; 
        
        // initialize array of size 50, in the range of numbers
        // from 1 to 100
        LinearSearch search = new LinearSearch(MIN, MAX, SIZE);
        
        // print array
        System.out.println("Array: ");
        search.printArray();
        
        FillArray array = new FillArray();
        
        // we perform search
        for(int i=0; i<10; i++) {
            
            // random number to search
            int x = array.generateRandom(MIN, MAX);
            
            int index = search.search(x); 
            
            if(index >= 0) {
                System.out.printf("%d exists at index %d%n", x, index);
            } else {
                 System.out.printf("%d doesn not exist in the array%n", x);
            }
        }
    }
}
