/**
 *
 * @author Programmer
 */
public class TestHistogram {
    public static void main(String [] args) {
        final int MIN = 1; 
        final int MAX = 20; 
        final int SIZe = 500; 

        ArrayHistogram object = new ArrayHistogram(MIN, MAX, SIZe); 

        // build table
        object.buildTable();

        // print table
        object.printFrequencyTable();

        // print the most frequent number 
        System.out.printf("%n%nMode of array Elements: %d%n", object.getMode());
        
        // histogram
        object.displayHistogram();
    }   
}
