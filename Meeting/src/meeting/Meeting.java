package meeting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Meeting {

    public static void main(String[] args) {
        String guest = "Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn";
        String list = meeting(guest);
    }
    
    public static String meeting(String s) {
        //make string uppercase
        String upper = s.toUpperCase();
        System.out.println(upper);

        List<String> listNames = new ArrayList<String>();
        String[] pairs = s.split(";");
        for (int i=0;i<pairs.length;i++) {
            String pair = pairs[i];
            //System.out.println("pair: " + pair);
            //flip lastname and firstname, so that lastname comes first. Replace : with a comma and put inside parenthesis
            String[] flipPairs = pairs[i].split(":");
            String flippedPair = "(" + flipPairs[1] + ", " + flipPairs[0] + ")";
            //System.out.println("flipped pair: " + flippedPair);
            listNames.add(flippedPair);
        }
        System.out.println("listLnames: "  + listNames);
        //sort it in alphabetic order by last name
        //when last names are the same, sort them by first name

        System.out.println("sorted list: "  + listNames);
        
        //save list to a new string
        String listToStr = String.join("", listNames);
        System.out.println("string: "  + listToStr);
        String meeting = listToStr.toUpperCase();
        System.out.println("final string: "  + meeting);
        return meeting;
    }
    
}
