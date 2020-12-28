package quarter_of_year;

public class Quarter_of_Year {

    public static void main(String[] args) {
        int month = 11;
        int quarterOfyear = quarterOf(month);
    }
    
    public static int quarterOf(int month) {
        int quarter = 0;
        
        switch(month){
            case 1:
            case 2:
            case 3:
                quarter = 1;
                break;
            case 4:
            case 5:
            case 6:
                quarter = 2;
                break;
            case 7:
            case 8:
            case 9:
                quarter = 3;
                break;
            case 10:
            case 11:
            case 12:
                quarter = 4;
                break;
        }
        System.out.println ("quarter: " + quarter);
        return quarter;
    }
    
}
