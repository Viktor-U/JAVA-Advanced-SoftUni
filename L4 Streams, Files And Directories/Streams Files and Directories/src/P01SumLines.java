import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class P01SumLines {
    public static void main(String[] args) {

        String path = "C:\\Програмиране\\Java-Advanced-Exercises\\L4 Streams, Files And Directories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String pathA = "C:\\Програмиране\\Java-Advanced-Exercises\\L4 Streams, Files And Directories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";
        String pathB = "C:\\Програмиране\\Java-Advanced-Exercises\\L4 Streams, Files And Directories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Result.txt";

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path));
             BufferedReader readerA = Files.newBufferedReader(Path.of(pathA));
             BufferedWriter writer = Files.newBufferedWriter(Paths.get(pathB))) {

            String line = reader.readLine();


            while (line != null){

                System.out.println(line);

                line = reader.readLine();
            }
            String lineA = readerA.readLine();
            while (lineA != null){

                System.out.println(lineA);
                lineA = reader.readLine();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}