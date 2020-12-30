package max.min_array;

import java.util.Arrays;

public class MaxMin_Array {

    public static void main(String[] args) {
        int[] inputArr = {15, 11, 10, 7, 12};
        int[] result = solve(inputArr);
        
    }

    public static int[] solve(int[] arr) {
        // Use the Arrays sort method to sort it into ascending order (note this mutates the array instance)
        Arrays.sort(arr);
        // Create a new array of the same length
        int[] minMaxSorted = new int[arr.length];
        // Iterate through the array (from the left and right at the same time)
        for (int i = 0, min = 0, max = arr.length - 1; i < arr.length; i += 2, min++, max--) {
            // the next maximum goes into minMaxSorted[i] 
            //if (i + 1 < minMaxSorted.length) {
                minMaxSorted[i] = arr[max];
           // }
            // the next minimum goes into minMaxSorted[i+1]... but
            // guard against index out of bounds for odd number arrays
            if (i + 1 < minMaxSorted.length) {
                 minMaxSorted[i +1] = arr[min];
            }
           
        }
        System.out.println(Arrays.toString(minMaxSorted));

    return minMaxSorted ;
}

}
