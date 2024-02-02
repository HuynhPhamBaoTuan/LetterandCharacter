import java.util.HashMap;
import java.util.Map;

public class Model {
    private String inputString;

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public int countLetters() {
        int letterCount = 0;

        for (char c : inputString.toCharArray()) {
            if (Character.isLetter(c)) {
                letterCount++;
            }
        }

        return letterCount;
    }

    public Map<String, Integer> countWordOcc() {
        Map<String, Integer> wordOcc = new HashMap<>();
        String[] words = inputString.toLowerCase().split("\\s+");

        for (String word : words) {
            wordOcc.put(word, wordOcc.getOrDefault(word, 0) + 1);
        }

        return wordOcc;
    }

    public Map<Character, Integer> countLetter() {
        Map<Character, Integer> letter = new HashMap<>();

        for (char c : inputString.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                letter.put(c, letter.getOrDefault(c, 0) + 1);
            }
        }

        return letter;
    }
}