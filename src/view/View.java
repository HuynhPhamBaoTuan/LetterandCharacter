package view;

import java.util.Map;

public class View {
    public void displayResult(int countLetters, Map<String, Integer> countWordOcc, Map<Character, Integer> countLetter) {
        System.out.println("Count of letters: " + countLetters);
        System.out.println("Word: " + countWordOcc);
        System.out.println("Letter: " + countLetter);
    }
}