import java.util.Arrays;
import java.util.Scanner;

public class P03DiagonalDifference {
    public static void main( String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        int[][] matrix = new int[n][n];
        readMatrix(matrix, scanner);

        int firstDiagonal = sumFirstDiagonals(matrix);
        int secondDiagonal = sumSecondDiagonals(matrix);

        System.out.println(Math.abs(firstDiagonal - secondDiagonal));

    }

    private static int sumSecondDiagonals(int[][] matrix) {

        int sum = 0;

        int row = matrix.length - 1;
        int colon = 0;

        while (row != -1){

            sum += matrix[row][colon];

            colon++;
            row--;
        }



        return sum;
    }

    private static int sumFirstDiagonals(int[][] matrix) {

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {

            sum += matrix[i][i];

        }


        return sum;
    }

    private static void readMatrix(int[][] matrix, Scanner scanner) {

        for (int i = 0; i < matrix.length; i++) {

            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        }
    }
}
