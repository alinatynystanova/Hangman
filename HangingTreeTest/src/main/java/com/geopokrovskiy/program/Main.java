package com.geopokrovskiy.program;

import com.geopokrovskiy.utils.WordChooser;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word = WordChooser.chooseWord("words.txt");
        char[] guessedLetters = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            guessedLetters[i] = '*';
        }

        int mistakes = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ваше слово: " + String.valueOf(guessedLetters));

        while (mistakes < 9) {
            System.out.println("Введите букву:");
            char letter = scanner.nextLine().charAt(0);

            if (word.indexOf(letter) != -1) {
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == letter) {
                        guessedLetters[i] = letter;
                    }
                }

                System.out.println("Ваше слово: " + String.valueOf(guessedLetters));

                if (String.valueOf(guessedLetters).equals(word)) {
                    System.out.println("Вы выиграли!");
                    break;
                }
            } else {
                mistakes++;
                hangman(mistakes);

                if (mistakes == 9) {
                    System.out.println("Вы проиграли! Загаданное слово: " + word);
                }
            }
        }
    }

    public static void hangman(int mistakes) {
        if (mistakes == 1) {
            System.out.println("___|___");
            System.out.println();
        }
        if (mistakes == 2) {
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (mistakes == 3) {
            System.out.println("   ____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (mistakes == 4) {
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (mistakes == 5) {
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (mistakes == 6) {
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |          / \\ ");
        }
        if (mistakes == 7) {
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |          / \\ ");
        }
        if (mistakes == 8) {
            System.out.println("___|___      /   \\");
        }
    }
}



