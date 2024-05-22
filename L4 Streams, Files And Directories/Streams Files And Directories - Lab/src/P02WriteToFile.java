import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class P02WriteToFile {
    public static void main(String[] args) throws IOException {


        Set<Character> punctuations = Set.of(',', '.', '!', '?');

        String path = "C:\\Програмиране\\Java-Advanced-Exercises\\L4 Streams, Files And Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);
        FileOutputStream fileOutputStream = new FileOutputStream("02.WriteToFileOutput.txt");

        int oneByte = fileInputStream.read();

        while (oneByte != -1){

            char sm = (char) oneByte;

            if (!punctuations.contains(sm)){

                System.out.print(sm);

            }

            oneByte = fileInputStream.read();
        }


    }
}
