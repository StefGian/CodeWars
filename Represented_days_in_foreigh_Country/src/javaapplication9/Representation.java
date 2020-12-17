package javaapplication9;

import java.util.ArrayList;
import java.util.List;

public class Representation {

    public static void main(String[] args) {
        int[][] tripDates = {{305,329}, {206, 220}, {297, 307}, {151,153}, {237,243}, {308,332}};
        int sumOfDays = daysRepresented(tripDates);

    }

    public static int daysRepresented(int[][] trips) {
        int days = 0;
        int arrayIndex = 0;

        for (int[] x : trips) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        List<Integer> nums = new ArrayList<Integer>();

        while (arrayIndex <= trips.length - 1) {
            for (int i = trips[arrayIndex][0]; i <= trips[arrayIndex][1]; i++) {
                nums.add(i);
            }
            arrayIndex++;
            System.out.println("arrayIndex: " + arrayIndex);
        }

        System.out.println("nums1: " + nums);

        days = nums.size();
        System.out.println("days: " + days);
        return days;
    }

}
