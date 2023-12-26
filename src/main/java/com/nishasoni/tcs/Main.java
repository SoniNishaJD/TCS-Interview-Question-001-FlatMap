package com.nishasoni.tcs;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
System.out.println("//////////////////////////Flat Map////////////////////////////");
        // Sample list of words
        List<String> words = Arrays.asList("hello", "world", "java");

        // Using flatMap to get distinct characters
        List<Character> solo = words.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .distinct()
                .collect(Collectors.toList());

        // Print the result
        System.out.println("Distinct characters: " + solo);
    }
}