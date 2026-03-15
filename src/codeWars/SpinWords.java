package codeWars;

import java.util.Arrays;

public class SpinWords {

    public static String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        String[] newWords = new String[words.length];

        String[] newWords2 = Arrays.stream(words)
                .map(word -> word.length() <= 5 ? word : new StringBuilder(word).reverse().toString())
                .toArray(String[]::new);

        for (int i = 0; i < words.length; i++) {
            StringBuilder word = new StringBuilder(words[i]);
            if (word.length() <= 5 && !words[i].contains("[")) {
                newWords[i] = word.toString();
            } else if (word.length() > 5 && words[i].contains("[")) {
                newWords[i] = word.reverse().toString();
            }
        }

        return String.join(" ", newWords);
        //return newWords.stream().collect(Collectors.joining(" "));
    }
}
