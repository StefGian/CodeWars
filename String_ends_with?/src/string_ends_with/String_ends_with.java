package string_ends_with;

public class String_ends_with {

    public static void main(String[] args) {
        String first = "abc";
        String second = "d";
        boolean result = solution(first, second);
    }
    
    public static boolean solution(String str, String ending) {
        boolean result = false;
        
        if (str.endsWith(ending)){
            result = true;
        }else{
            result = false;
        }
        
        System.out.println("result: " + result);
        return result;
    }
    
}
