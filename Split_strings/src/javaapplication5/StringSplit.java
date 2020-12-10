package javaapplication5;

import java.util.ArrayList;
import java.util.List;

public class StringSplit {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abcdef";

        String[] result = solution(str2);

    }

    public static String[] solution(String str) {
        List<String> parts = new ArrayList<String>();
        int index = 2;

        String lastChar = "_";
        for (int i = 0; i < str.length(); i += index) {
            parts.add(str.substring(i, Math.min(str.length(), i + index)));
        }

        if (str.length() % 2 != 0) {
            String lastPart = parts.get(parts.size() - 1);
            String newStr = lastPart + lastChar;

            parts.set(parts.size() - 1, newStr);
        }
        String[] arrayResult = new String[parts.size()];
        arrayResult = parts.toArray(arrayResult);
        return arrayResult;
    }

}
