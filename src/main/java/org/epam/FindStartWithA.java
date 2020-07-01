package org.epam;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FindStartWithA {
    public void find(ArrayList<String> ar){

       ar.stream().parallel()
               .filter(i -> i.startsWith("a") && i.length() == 3)
               .collect(Collectors.toList())
               .forEach(System.out::println);
    }
}
