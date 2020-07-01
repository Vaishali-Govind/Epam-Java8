package org.epam;

import java.util.ArrayList;
import java.util.Arrays;

public class Palindromes {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("opsa","aaaa","abcba"));
        palindromeList pd = new palindromeList();
        pd.findPalindrome(strings);
    }
}
