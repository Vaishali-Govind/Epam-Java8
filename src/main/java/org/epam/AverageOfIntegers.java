package org.epam;

import java.util.ArrayList;
import java.util.Arrays;

public class AverageOfIntegers {
    public static void main(String[] args) {
        ArrayList<Integer> arr =
                new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        FindAverage avg = new FindAverage();
        double ans = avg.getAverage(arr);
        System.out.println(ans);
    }
}
