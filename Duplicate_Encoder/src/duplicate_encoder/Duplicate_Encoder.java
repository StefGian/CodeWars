package duplicate_encoder;

import java.util.BitSet;

public class Duplicate_Encoder {

    public static void main(String[] args) {
        String word = "(( @";
        String encoding = encode(word);
    }

    public static String encode(String word) {
        // check if a character was in string previously
        BitSet previous = new BitSet();
        // check is a character was a duplicate.
        BitSet duplicate = new BitSet();
        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));
            if (previous.get(ch)) {
                duplicate.set(ch);
            } else {
                previous.set(ch);
            }
        }

        StringBuilder strBuilder = new StringBuilder(word.length());
        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));
            // replace duplicates with ) and non duplicates with (
            strBuilder.append(duplicate.get(ch) ? ')' : '(');
        }

        System.out.println("word: " + strBuilder.toString());
        return strBuilder.toString();
    }

}
