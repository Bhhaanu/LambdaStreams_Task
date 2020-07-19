package org.example;

import java.util.Arrays;
import java.util.List;

public class Avgofintegers
{
    public static void main( String[] args )
    {
        List<Integer> primes= Arrays.asList(1,2,3,4,5,6,7,8,9);
        primes.stream().mapToInt(i->i).average().ifPresent(avg->System.out.println("Avg is:"+avg));
    }
}
