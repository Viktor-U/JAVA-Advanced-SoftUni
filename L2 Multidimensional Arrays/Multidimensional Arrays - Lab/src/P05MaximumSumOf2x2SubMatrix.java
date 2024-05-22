import java.util.Arrays;
import java.util.Scanner;

public class P05MaximumSumOf2x2SubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrInput = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows = arrInput[0];
        int colones = arrInput[1];

        int[][] matrix = readMatrices(scanner, rows, colones);

        int maxSum = Integer.MIN_VALUE;
        int mainNum = 0;
        int rightNum = 0;
        int belowNum = 0;
        int diagonalNum = 0;

        for (int r = 0; r < rows - 1; r++) {
            for (int c = 0; c < colones - 1; c++) {

                if (matrix[r][c] + matrix[r][c + 1] + matrix[r + 1][c] + matrix[r + 1][c + 1] > maxSum){
                    maxSum = matrix[r][c] + matrix[r][c + 1] + matrix[r + 1][c] + matrix[r + 1][c + 1];
                    mainNum = matrix[r][c];
                    rightNum = matrix[r][c + 1];
                    belowNum = matrix[r + 1][c];
                    diagonalNum = matrix[r + 1][c + 1];
                }

            }

        }

        System.out.println(mainNum + " " + rightNum);
        System.out.println(belowNum + " " + diagonalNum);
        System.out.println(maxSum);



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
