package org.epam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;

public class FindAverage {
//    FindAverage(){
//
//    }


    public double getAverage(ArrayList<Integer> arr) {
        return arr.stream().mapToDouble(i -> i).average().orElse(0.0);
    }
}
