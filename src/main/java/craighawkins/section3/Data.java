package craighawkins.section3;

import java.util.*;

public class Data {

    public static int findLargest(ArrayList<Integer> nums) {
        int largest = nums.get(0);

        for (int number : nums) {
            if (number > largest) {
                largest = number;
            }
        }

        return largest;
    }
}