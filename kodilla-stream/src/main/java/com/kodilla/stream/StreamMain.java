package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

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

    }
}
