import java.util.Arrays;
import java.util.Scanner;

public class P04SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrInput = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows = arrInput[0];
        int colones = arrInput[1];

        int[][] matrix = readMatrices(scanner, rows,colones);

        System.out.println(rows);
        System.out.println(colones);
        System.out.println(getSumMatrixNum(matrix));



    }

    private static int getSumMatrixNum(int[][] matrix) {

        int sum = 0;

        for (int[] ints : matrix) {
            for (int c = 0; c < matrix[0].length; c++) {

                sum += ints[c];

            }

        }


        return sum;
    }

    private static int[][] readMatrices(Scanner sc, int rows, int colones) {

        int[][] matrix = new int[rows][colones];

        for (int r = 0; r < rows; r++) {

            int[] arr = Arrays.stream(sc.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[r] = arr;

        }
        return matrix;
    }
}
