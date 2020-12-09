package which_are_in;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Which_Are_In {

    public static void main(String[] args) {
        String[] array1 = {"arp", "live", "strong"};
        String[] array2 = {"lively", "alive", "harp", "sharp", "armstrong"};

        String[] resultArray = inArray(array1, array2);
        System.out.println(resultArray);
    }

    public static String[] inArray(String[] array1, String[] array2) {
        Set<String> setStrings = new HashSet<>();
        for (String str2 : array2){
            for (String str1 : array1){
                if (str2.toLowerCase().contains(str1.toLowerCase())){
                   setStrings.add(str1);
                }else{
                    continue;
                }
            }
        }
        System.out.println(setStrings);
        String[] resultArray;
        if (setStrings.size() != 0){
            resultArray= setStrings.toArray(new String[setStrings.size()]);
            Arrays.sort(resultArray);
        }else{
            resultArray = new String[0];
        }
        return resultArray;
    }

}
