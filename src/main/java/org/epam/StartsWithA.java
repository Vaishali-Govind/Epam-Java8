package org.epam;

import java.util.ArrayList;
import java.util.Arrays;

public class StartsWithA {
    public static void main(String[] args) {
        FindStartWithA ob = new FindStartWithA();
        ArrayList<String> ar = new ArrayList<>(Arrays.asList("abc", "aacd", "afg", "efg", "eefff"));
        ob.find(ar);
    }
}
