import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class File {


    public String readFile(String file) throws IOException {
        String sentence = new String(Files.readAllBytes(Paths.get(file)));
        sentence = sentence.replaceAll(System.lineSeparator(), " ");
        return sentence;
    }

    public String[] splitString(String sentence){
        return sentence.split(" ");
    }


}

