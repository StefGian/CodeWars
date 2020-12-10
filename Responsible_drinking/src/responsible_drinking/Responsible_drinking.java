package responsible_drinking;


public class Responsible_drinking {

    public static void main(String[] args) {
        String drinkStr = "1 shot, 5 beers, 2 shots, 1 glass of wine, 1 beer";
        String glassesOfWater = hydrate(drinkStr);
        System.out.println(glassesOfWater);
    }
    
    public static String hydrate(String drinkString) {
        String glasses= "glasses of water";
        String glass = "glass of water";
        String water = " ";
        int sum = 0;
        
        drinkString = drinkString.replaceAll("[^-?0-9]+", " ");
        
        System.out.println(drinkString);
        String str[] = drinkString.split(" ");
        for (String s : str){
           System.out.println(s); 
        }
        for(String element:str){
            try {
                int num = Integer.parseInt(element); 
                sum += num;
            }catch (NumberFormatException nfe){
                System.out.println ("Element " + element + " in the array is not an integer");
            }
        }
        System.out.println(sum);
        
        if (sum == 1){
            water = sum + " " + glass;
        }else{
            water = sum + " " + glasses;
        }
        

        return water;
    }
}
