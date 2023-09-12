package com.geopokrovskiy.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author geopokrovskiy
 */
public class WordChooser {
    /**
     * Chooses a random word from a text file.
     * @param fileName
     * @return word
     */
    public static String chooseWord(String fileName) {
        List<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.ready()) {
                String line = reader.readLine();
                String[] strippedLine = line.split(" ");
                for (String word : strippedLine) {
                    words.add(word.
                            trim().
                            toLowerCase());
                }
            }
            Random random = new Random();
            int idx = random.nextInt(words.size());
            return words.get(idx);
        } catch (IOException e) {
            throw new IllegalArgumentException ("File cannot be read!");
        }
    }
}
