import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class P08WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[][] matrix = readMatrices(scanner, rows);

        List<int[]> resultList = new ArrayList<>();


        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int row = arr[0];
        int colon = arr[1];

        int wrongValue = matrix[row][colon];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (matrix[r][c] == wrongValue){

                    int left = 0;
                    int right = 0;
                    int top = 0;
                    int bottom = 0;

                    if (isHave(matrix, r, c - 1) && matrix[r][c - 1] != wrongValue) {
                        left = matrix[r][c - 1];
                    }
                    if (isHave(matrix, r, c + 1) && matrix[r][c + 1] != wrongValue) {
                        right = matrix[r][c + 1];
                    }
                    if (isHave(matrix, r - 1, c) && matrix[r - 1][c] != wrongValue) {
                        top = matrix[r - 1][c];
                    }
                    if (isHave(matrix, r + 1, c) && matrix[r + 1][c] != wrongValue) {
                        bottom = matrix[r + 1][c];
                    }

                    resultList.add(new int[] {(left + right + bottom + top), r, c});
                }
            }
        }
        for (int[] value : resultList) {

            int sum = value[0];
            int r = value[1];
            int c = value[2];

            matrix[r][c] = sum;

        }






        for (int[] ints : matrix) {
            for (int c = 0; c < matrix[0].length; c++) {

                System.out.print(ints[c] + " ");

            }
            System.out.println();
        }






    }

    private static boolean isHave(int[][] matrix, int row , int colon) {

        return matrix.length > row && matrix[0].length > colon && row >= 0 && colon >= 0;
    }

    private static int[][] readMatrices(Scanner sc, int rows) {

        int[][] matrix = new int[rows][];

        for (int r = 0; r < rows; r++) {

            int[] arr = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[r] = arr;

        }
        return matrix;
    }
}
