package fix_string_case;

public class Fix_String_Case {

    public static void main(String[] args) {
        String word = "coDE";
        String result = solve(word);
    }
    
    public static String solve(final String str) {
        String result = " ";
        char[] arrChars = str.toCharArray();
        int countLowerCase = 0;
        int countUpperCase = 0;
        
        for (char ch : arrChars){
            if (Character.isLowerCase(ch)){
                countLowerCase++;
            }else{
                countUpperCase++;
            }
        }
        
        System.out.println("countUpperCase: " + countUpperCase);
        System.out.println("countLowerCase: " + countLowerCase);
        
        if(countLowerCase > countUpperCase){
            result = str.toLowerCase();
        }else if (countLowerCase < countUpperCase){
            result = str.toUpperCase();
        }else{
            result = str.toLowerCase();
        }
        
        System.out.println("result:" + result);
        
        return result; 
    }
    
}
