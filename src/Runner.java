import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {

        File file = new File();
        Calculator calculator = new Calculator();

        String sentence = file.readFile("input.txt");

        String[] splittedSentence = file.splitString(sentence);
        int apply = Integer.parseInt(splittedSentence[splittedSentence.length - 1]);

        for (int i = 0; i < splittedSentence.length - 3; i += 2) {
            if (splittedSentence[i].equals("add")) {
                apply = calculator.addition(apply, Integer.parseInt(splittedSentence[i + 1]));
            } else if (splittedSentence[i].equals("diff")) {
                apply = calculator.difference(apply, Integer.parseInt(splittedSentence[i + 1]));
            }
            else if (splittedSentence[i].equals("multiply")) {
                apply = calculator.multiplication(apply, Integer.parseInt(splittedSentence[i + 1]));
            }
            else {
                apply = calculator.division(apply, Integer.parseInt(splittedSentence[i + 1]));
            }
        }
        System.out.println(apply);
    }
}

