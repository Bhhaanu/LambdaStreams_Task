package org.example;

import java.util.Arrays;
import java.util.List;

public class LambdaStreamExmple {
    public static void main(String[] args){
        String[] strlist = {"ABC","DEF","ARUNA","ANU","GURU","RAM"};
        List<String> list = Arrays.asList(strlist);
        list.stream().filter((s) -> s.startsWith("A")).filter((s)->s.length()==3)
                .forEach(System.out::println);
    }
}
