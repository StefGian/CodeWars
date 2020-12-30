package remove_parentheses;

public class Remove_parentheses {

    public static void main(String[] args) {
        String str = "(first group) (second group) (third group)";
        String result = removeParentheses(str);
    }
    
    public static String removeParentheses(final String str) {
        String copyStr = str;
        copyStr = copyStr.replaceAll("\\(.*\\)", "");
        System.out.println(copyStr);
        return copyStr; 
    }
    
}
