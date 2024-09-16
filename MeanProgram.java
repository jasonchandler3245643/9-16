//If your IDe produces any comments DELETE ALL OF IT minus class construction
import java.util.ArrayList;
//Looks Good! -Jaiden
public class MeanProgram
{

    
    public double computeMean(ArrayList<Integer> listOfNumbers) {
    
    int sum = 0;
        
    for (int singleNumber : listOfNumbers) {
        
        sum = sum + singleNumber;
        
    }        
    
    return sum / (double) listOfNumbers.size();
    
    }
    
    public double computeMode() {
    // most common
    int mode = 0;
    
        
    return 0;
    }
    
    public double computeMedian() {
    // middle when sorted
    
    return 0;
    }
    
    public double computerStandardDeviation() {
    
    
    return 0;
    }
    
    
}
