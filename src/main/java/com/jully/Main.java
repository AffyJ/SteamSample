package com.jully;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = List.of("yamada", "tanaka", "yasuda", "suzuki", "iida");

        List<String> sortedResult = names.stream().sorted().toList();

        long count = names.stream().filter(name -> name.startsWith("y")).count();

        boolean hasYamada = names.stream().anyMatch(name -> name.equals("yamada"));

        System.out.println(sortedResult);
        System.out.println(count);
        System.out.println(hasYamada);
    }
}
