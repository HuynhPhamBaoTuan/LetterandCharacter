import java.util.Map;

public class Controller {
    private Model model;

    public Controller() {
        model = new Model();
    }

    public void processInputString(String inputString) {
        model.setInputString(inputString);
    }

    public int getCountLetters() {
        return model.countLetters();
    }

    public Map<String, Integer> getCountWordOcc() {
        return model.countWordOcc();
    }

    public Map<Character, Integer> getCountLetter() {
        return model.countLetter();
    }
}