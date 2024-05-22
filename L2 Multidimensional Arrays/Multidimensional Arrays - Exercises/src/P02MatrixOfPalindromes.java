import java.util.Arrays;
import java.util.Scanner;

public class P02MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int row = input[0];
        int col = input[1];

        String[][] matrix = new String[row][col];

        makePalindromeMatrix(matrix);
        printMatrix(matrix);


    }
    private static void printMatrix (String[][] matrix){

        for (String[] ints : matrix) {
            for (int c = 0; c < matrix[0].length; c++) {

                System.out.print(ints[c] + " ");

            }
            System.out.println();
        }

    }

    private static void makePalindromeMatrix(String[][] matrix) {

        char first = 97;
        char middle = 97;
        char last = 97;

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {

                matrix[r][c] = first + String.valueOf(middle) + (last) ;
                middle ++;
            }
            first++;
            last++;
            middle=first;
        }


    }
}
