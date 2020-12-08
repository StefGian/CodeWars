package sum_the_parts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 *
 * @author stefania
 */
public class Sum_the_Parts {

    public static void main(String[] args) {
        int[] testArray = {0, 1, 3, 6, 10};
        
        int[] resultArray = sumParts(testArray);
    }

    public static int[] sumParts(int[] ls) {
        if (ls.length > 0) {
            int[] sumsArray = new int[ls.length + 1];
            List<Integer> listOfSums = new ArrayList<Integer>();
            
            int count = 0;
            while (count < ls.length){
                
                int sum = IntStream.of(ls).sum();
                for (int i =0; i < ls.length; i++){
                    if (i < count){
                        sum = sum -ls[i];
                    }
                }
                listOfSums.add(sum);
                
                count++;
            }
            
            
            for (int i = 0; i < listOfSums.size(); i++) {
                sumsArray[i] = listOfSums.get(i);
            }
            return sumsArray;
        } else {
            return new int[]{0};
        }
    }
    
    
}
