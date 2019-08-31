import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;

class FileTest {

    @Test
    public void voidreadingFileWithOneLine() throws IOException {
        Path resourceDirectory = Paths.get( "tests", "resources", "test1.txt");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();
        String testFileName = absolutePath;
        String expected = "apply 1";
        File file = new File();
        String result =   file.readFile(testFileName);
        assertEquals(expected, result);
    }

    @Test
    public void voidreadingFileWithNoLines() throws IOException {
        Path resourceDirectory = Paths.get( "tests", "resources", "test0.txt");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();
        String testFileName = absolutePath;
        String expected = "";
        File file = new File();
        String result =   file.readFile(testFileName);
        assertEquals(expected, result);
    }

    @Test
    public void voidreadingFileWithLotOfLines() throws IOException {
        Path resourceDirectory = Paths.get( "tests", "resources", "test2.txt");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();
        String testFileName = absolutePath;
        String expected = "add 2 multiply 3 apply 4 ";
        File file = new File();
        String result =   file.readFile(testFileName);
        assertEquals(expected, result);
    }


}