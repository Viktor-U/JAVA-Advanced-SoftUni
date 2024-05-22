import java.util.Arrays;
import java.util.Scanner;

public class P06PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = readMatrices(scanner, size, size);

        for (int i = 0; i < size; i++) {

            System.out.print(matrix[i][i] + " ");

        }
        System.out.println();

        int a = size - 1;
        int b = 0;

        while (b != size ){
            System.out.print(matrix[a][b] + " ");
            a--;
            b++;
        }


    }
    private static int[][] readMatrices(Scanner sc, int rows, int colones) {

        int[][] matrix = new int[rows][colones];

        for (int r = 0; r < rows; r++) {

            int[] arr = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[r] = arr;

        }
        return matrix;
    }
}

