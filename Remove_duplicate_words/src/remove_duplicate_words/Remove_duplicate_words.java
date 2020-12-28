package remove_duplicate_words;

import java.util.LinkedHashSet;

public class Remove_duplicate_words {

    public static void main(String[] args) {
       String input = "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta";
       String result = removeDuplicateWords(input);
    }
    
    public static String removeDuplicateWords(String s){
        String[] arr = s.split(" ");
        LinkedHashSet<String> words = new LinkedHashSet<String>();
        
        for (String st : arr){
            if (words.contains(st)){
                continue;
            }else{
                words.add(st);
            }
        }
        System.out.println("Set: " + words);
        
        StringBuilder setToStr = new StringBuilder();
        
        for (String word : words){
            setToStr.append(word + " ");
        }
        
        setToStr.deleteCharAt(setToStr.length() -1);
        String result = setToStr.toString();
        System.out.println("result: " + result);
        
        return result;
    }
    
}
