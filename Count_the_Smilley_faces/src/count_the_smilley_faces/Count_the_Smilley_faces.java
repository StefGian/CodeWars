package count_the_smilley_faces;

import java.util.ArrayList;
import java.util.List;

public class Count_the_Smilley_faces {

    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a.add(":)");
        a.add(":D");
        a.add(":-}");
        a.add(":-()");

        int result = countSmileys(a);
    }

    public static int countSmileys(List<String> arr) {
        int result = 0;
        for (String i : arr) {
            if (i.length() == 2) {
                if ((i.charAt(0) == ':' || i.charAt(0) == ';') && (i.charAt(1) == 'D' || i.charAt(1) == ')')) {
                    result++;
                }
            }
            if (i.length() == 3) {
                if ((i.charAt(0) == ':' || i.charAt(0) == ';') && (i.charAt(1) == '-' || i.charAt(1) == '~') && (i.charAt(2) == 'D' || i.charAt(2) == ')')) {
                    result++;
                }
            }
        }

        System.out.println("result: " + result);
        return result;
    }

}
