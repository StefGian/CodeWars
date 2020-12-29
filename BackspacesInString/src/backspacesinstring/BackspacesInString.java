package backspacesinstring;

import java.util.ArrayList;

public class BackspacesInString {

    public static void main(String[] args) {
        String input = "abc#d##c";
        String cleanInput = cleanString(input);
    }

    public static String cleanString(String s) {
        char backspace = '#';
        String result = " ";
        
        //convert string to arraylist
        ArrayList<Character> chars = new ArrayList<Character>();
        for (char c : s.toCharArray()) {
            chars.add(c);
        }
        
        //check if string consists of same characters
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(0)) {
                result = " ";
            } else {
                //iterate list and delete chars that are before "#"
                while (chars.contains(backspace)) {
                    for (int c = 0; c < chars.size(); c++) {
                        if (chars.get(c) != backspace) {
                            continue;
                        } else {
                            chars.remove(chars.get(c - 1));
                            c--;
                            chars.remove(chars.get(c));
                        }
                    }
                }
                System.out.println("chars deleted: " + chars);

                String str = chars.toString();
                String str1 = str.replace("[", "");
                String str2 = str1.replace("]", "");
                String str3 = str2.replace(", ", "");

                result = str3;
            }
            
        }
        System.out.println("result: " + result);
        return result;

    }
}
