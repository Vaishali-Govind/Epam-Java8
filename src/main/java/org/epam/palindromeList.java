package org.epam;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class palindromeList {
    public void findPalindrome (ArrayList<String> lis){

       lis.stream().filter(getPalindrome).collect(Collectors.toList()).forEach(System.out::println);
    }

    private Predicate<String> getPalindrome = (String input) -> {
        String temp = input.toLowerCase();
        return IntStream.range(0,temp.length()/2).noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length()-i-1));
    };
}
