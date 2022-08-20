/**
 *
 * @author Programmer
 */
public class TestBinarySearchIterative {
    
    public static void main(String [] arsg) {
        
        // create object
        final int MIN = 1; 
        final int MAX = 30; 
        final int SIZE = 50; 
        
        BinarySearchIterative search = new BinarySearchIterative(MIN, MAX, SIZE);
        
        // display sorted array
        search.sort();
        
        // print
        search.printArray();
        
        // now run the search
        for(int i=0; i<10; i++) {
            int key = search.generate(MIN, MAX); 
            
            int index = search.search(key); 
            
            if(index >= 0) {
                System.out.printf("%d found at index %d%n", key, index);
            } else {
                System.out.printf("%d not found in the array%n", key);
            }
            
        }
        
    }
}
