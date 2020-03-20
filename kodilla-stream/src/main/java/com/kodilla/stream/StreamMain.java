package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String text = "example";
        poemBeautifier.beautify(text, (a) -> a.toUpperCase());
        poemBeautifier.beautify(text, (a) -> "ABC " + a +" ABC");
        poemBeautifier.beautify(text, (a) -> a.substring(2 ,5));
        poemBeautifier.beautify(text, (a) -> {
            char[] temporary = a.toCharArray();
            String result = "";
            for(int i = a.length(); i > 0; i--)
            {
                result += temporary[i-1];
            }
            return result;
        });

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
