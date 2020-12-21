package bookseller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bookseller {

    public static void main(String[] args) {
        //books classified in 26 categories (A-Z)
        //each book has a code of 3,4,5 or more chars
        //code (c): 1st char is capital letter which defines book's category
        //stocklist: each code is followed by a space and a positive int n (int n>=0) --> shows books' quantity in stock
        String[] L = {"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"}; //stocklist
        String[] M = {"A", "B", "C", "W"}; //categories list

        String stockPerCategory = stockSummary(L, M);
    }

    //given a stocklist(L) and a list of categories(M) in capital letters:
    //find all the books of L with codes belonging to each category of M and sum their quantity according to each category
    //For the lists L and M of example you have to return the string: (A : 20) - (B : 114) - (C : 50) - (W : 0)
    //If L or M are empty return string is "".
    //In the result codes and their values are in the same order as in M.
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        StringBuilder result = new StringBuilder();
        int quantity = 0;
        List<String> codes = new ArrayList<String>();
        HashMap<String, Integer> orderedSet = new HashMap<String, Integer>();

        //find all the books of L with codes belonging to each category of M
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            result.append(" ");
        } else {
            for (int code = 0; code < lstOfArt.length; code++) {
                for (int category = 0; category < lstOf1stLetter.length; category++) {
                    if (lstOfArt[code].substring(0, 1).equals(lstOf1stLetter[category])) {
                        codes.add(lstOfArt[code].substring(0, 1) + " " + lstOfArt[code].substring(Math.max(lstOfArt[code].length() - 2, 0)));
                    } else {
                        continue;
                    }
                }
            }
            System.out.println("codes list: " + codes);
        }
        
        //iterate array of categories and put them in hashmap with initial quantity "0"
        for(int category = 0; category < lstOf1stLetter.length; category++){
            orderedSet.put(lstOf1stLetter[category], 0);
        }
        
        System.out.println("orderedSet: " + orderedSet);
        
        //iterate hashmap and list and add quantities to categories
        //sum their quantity according to each category
        for (Map.Entry mapElement : orderedSet.entrySet()){
            for(int i = 0; i < codes.size(); i++){
                String key = (String)mapElement.getKey();
                int value = (int)mapElement.getValue();
                if(key.equals(codes.get(i).substring(0, 1))){
                   value = value + Integer.parseInt(codes.get(i).substring(Math.max(codes.get(i).length() - 2, 0)));
                   orderedSet.put(key, value);
                }else{
                    continue;
                }
            }
        }
        
        System.out.println("orderedSet with quantities: " + orderedSet);
        
        //convert to string
        for(Map.Entry mapElement : orderedSet.entrySet()){
            String key = (String)mapElement.getKey();
            int value = (int)mapElement.getValue();
            result.append("(" + key + " : " + value + ")" + " - ");
        }
        System.out.println("result: " + result);
        
        int index = result.lastIndexOf("-");
        if (index != -1){
            result.replace(index, index+1, "");
        }
        
        String str = result.toString();
//        if(str.endsWith(" -")){
//            str = str.substring(0, str.length()-1);
           System.out.println("str: " + str);
//        }
        return str;
    }

}
