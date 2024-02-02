import java.util.Map;
import java.util.Scanner;
import view.View;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your content: ");
        String inputString = scanner.nextLine();

        Controller controller = new Controller();
        controller.processInputString(inputString);

        int countLetters = controller.getCountLetters();
        Map<String, Integer> countWordOcc = controller.getCountWordOcc();
        Map<Character, Integer> countLetter = controller.getCountLetter();

        View view = new View();
        view.displayResult(countLetters, countWordOcc, countLetter);
    }
}