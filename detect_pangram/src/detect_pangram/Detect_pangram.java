package detect_pangram;

import java.util.HashSet;
import java.util.Set;

public class Detect_pangram {

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        boolean result = checkPangram(sentence);
    }

    public static boolean checkPangram(String str) {
        boolean isPangram = false;

        if (str == null || str.length() < 26) {
            return isPangram;
        }

        str = str.toLowerCase();
        char[] charArray = str.toCharArray();
        Set<Character> charSet = new HashSet<>();
        for (char c : charArray) {
            if (Character.isLetter(c) && (!Character.isWhitespace(c))) {
                charSet.add(c);
            }
        }
        if (charSet.size() == 26) {
            isPangram = true;
        }
        return isPangram;
    }


}
