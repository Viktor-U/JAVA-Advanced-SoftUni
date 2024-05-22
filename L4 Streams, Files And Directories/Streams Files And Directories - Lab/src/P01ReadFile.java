import java.io.FileInputStream;
import java.io.IOException;

public class P01ReadFile {
    public static void main(String[] args) {

        String path = "C:\\Програмиране\\Java-Advanced-Exercises" +
                "\\L4 Streams, Files And Directories" +
                "\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";


        try (FileInputStream inputStream = new FileInputStream(path)){

            int oneByte = inputStream.read();
            while (oneByte != -1){
                System.out.printf("%s ",Integer.toBinaryString(oneByte));
                oneByte = inputStream.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}