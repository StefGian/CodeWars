package vowel_count;

public class Vowel_Count {

    public static void main(String[] args) {
        String input = "abracadabra";
        int numOfVowels = getCount(input);
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        
        char[] arrVowels = {'a', 'e', 'i', 'o', 'u'};
        
        //iterate string and array to check if vowels exist
        for (char ch : str.toCharArray()){
            for (char c : arrVowels){
                if (ch == c){
                   vowelsCount++; 
                }else{
                    continue;
                }
            }
        }
        
        System.out.println("num: " + vowelsCount);
        return vowelsCount;
    }

}
