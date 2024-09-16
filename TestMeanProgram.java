import java.util.ArrayList;

public class TestMeanProgram
{
   
    
    public static void main(String[] args) {
        MeanProgram tester = new MeanProgram();
    
        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
        
        for (int i = 0; i < 100; i++) {
        
             listOfNumbers.add(i);
        
        }
        
        System.out.print(tester.computeMean(listOfNumbers));
    
    
    
    }
    
    
    
}
