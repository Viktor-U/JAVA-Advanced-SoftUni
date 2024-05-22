import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] size = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int rows = size[0];
        int cols = size[1];

        char[][] matrix = new char[rows][cols];




    }

    public void fillMatrix (char[][] matrix, Scanner sc){

        for (int i = 0; i < matrix.length; i++) {

            matrix[i] = sc.nextLine().toCharArray();

        }

    }
}