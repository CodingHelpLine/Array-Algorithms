/**
 *
 * @author Programmer
 */
public class TestFrequency {
    
    public static void main(String [] args) {
        final int MIN = 1; 
        final int MAX = 100; 
        final int SIZe = 500; 
        
        FrequencyOfNumber object = new FrequencyOfNumber(MIN, MAX, SIZe);
        
        // run a loop and get the random number in the range and 
        // display its frequency. 
        for(int i=0; i<10; i++) {
            int number = object.generate(MIN, MAX);
            int frequency = object.getFrequency(number); 
            System.out.printf("%d appeared %d times%n", number, frequency);
        }
    }
    
}
