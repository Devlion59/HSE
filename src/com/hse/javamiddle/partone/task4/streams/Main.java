package com.hse.javamiddle.partone.task4.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream.of("мама", "мыла", "раму").mapToInt(String :: length).forEach(System.out::println);


        String prefix = "123";

        //можно вынести какую-то лямбду в отдельный функциональный интерфейс

        Stream.of("мама", "мыла", "раму")
                .map(item -> item.split(""))
                .flatMap(Arrays::stream)
                .map(str -> {
                            String result = str.toUpperCase();
                            return prefix + result;
                        })
                .distinct()
                .sorted()
                .forEach(System.out::println);
        Stream.builder().add("").add("").add("");



    }
}
