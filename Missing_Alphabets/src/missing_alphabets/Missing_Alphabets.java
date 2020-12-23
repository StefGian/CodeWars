package missing_alphabets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Missing_Alphabets {

    public static void main(String[] args) {

        String alphabet = "abbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxy";
        String missingLetters = find(alphabet);

    }

    static String find(final String text) {
        StringBuilder missing = new StringBuilder();
        List<Character> alphabet = new ArrayList<Character>();
        //fill list with letters of the alphabet
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }

        List<Character> charsOfText = new ArrayList<Character>();
        for (char c : text.toCharArray()) {
            charsOfText.add(c);
        }
        //System.out.println("charsOfText: " + charsOfText);

        HashMap<Character, Integer> map = occurencesOfCharacter(text);
        //find max value in map
        int maxValueInMap = (Collections.max(map.values()));
        System.out.println("maxValueInMap: " + maxValueInMap);

        HashSet<Character> missingLetters = new HashSet<Character>();

        //iterate string and find missing letters to put in hashset
        for (char c : charsOfText) {
            for (char ltr : alphabet) {
                if (charsOfText.contains(ltr)) {
                    continue;
                } else {
                    missingLetters.add(ltr);
                }
            }
        }
        System.out.println("missingLetters set: " + missingLetters);

        //add missing letters to stringbuilder as many times as max value in map
        if (map.size() != 0) {
            for (Map.Entry entry : map.entrySet()) {
                int value = (int) entry.getValue();
                char key = (char) entry.getKey();
                if (value != maxValueInMap) {
                    for (int i = value; i < maxValueInMap; i++) {
                        missing.append(key);
                    }
                }
            }
            for (char c : missingLetters){
                for (int i = 0; i < maxValueInMap; i++) {
                        missing.append(c);
                }
            }
        } else {
            missing.append("");
        }
        System.out.println("missing: " + missing);

        //sort stringbuilder missing alphabetically
        String missingToString = missing.toString();
        char[] charArray = missingToString.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);
        System.out.println("sortedString: " + sortedString);

        return sortedString;
    }

    //method to find how many times each letter is repeated inside the string
    public static HashMap<Character, Integer> occurencesOfCharacter(String str) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                int cnt = map.get(c);
                map.put(c, ++cnt);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println("map : " + map);
        return map;
    }

}
