package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String []args){
        List<String> list = Arrays.asList("radar","madam","uncle","pip","hi","aa");
        list.stream().filter((s)->isPalindrome(s)).forEach(System.out::println);

    }
    public static boolean isPalindrome(String originalString) {

        String tempString = originalString.replaceAll("\\s+", "").toLowerCase();

        boolean b=IntStream.range(0, tempString.length() / 2)
                .noneMatch(i -> tempString.charAt(i) != tempString.charAt(tempString.length() - i - 1));
        return b;
    }
}




