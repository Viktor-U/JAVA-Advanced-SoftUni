import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class main {
    public static void main(String[] args) {


        String path = "C:\\Програмиране\\Java-Advanced-Exercises\\L4 Streams, Files And Directories" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";

        try (BufferedReader reader = Files.newBufferedReader(Path.of(path))){

            int a = reader.read();
            int count = 0;
            while (a != -1){
                count++;
                a = reader.read();
            }
            System.out.println(count);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
