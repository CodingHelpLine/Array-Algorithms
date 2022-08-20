/**
 *
 * @author Programmer
 */
public class TestRotateArray {
    
    public static void main(String [] args) {
        
        // Create object
        final int SIZE = 10; 
        
        RotateArray object = new RotateArray(SIZE);
        
        // lets rotate 1 by 1
        for(int i=1; i<=4; i++) {
            // print before rotation
            System.out.println("Print Array before Rotation"); 
            object.printArray();
        
            object.rotate(1);
            
            // print again
            // print before rotation
            System.out.println("Print Array After Rotation"); 
            object.printArray();
        
            // new line
            System.out.println();
        }
    }
    
}
