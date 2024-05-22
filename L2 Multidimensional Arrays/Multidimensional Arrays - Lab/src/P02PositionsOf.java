import java.util.Arrays;
import java.util.Scanner;

public class P02PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sizeArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = sizeArr[0];
        int colones = sizeArr[1];

        int[][] matrix = new int[rows][colones];
        readMatrices(scanner, rows, matrix);

        int num = Integer.parseInt(scanner.nextLine());

        result(rows, colones, matrix, num);


    }

    private static void result(int rows, int colones, int[][] matrix, int num) {
        boolean isFound = false;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < colones; c++) {

                if (matrix[r][c] == num){

                    System.out.println(r + " " + c);
                    isFound = true;

                }

            }
        }
        if (!isFound){
            System.out.println("not found");
        }
    }

    private static void readMatrices(Scanner scanner, int rows, int[][] matrix) {
        for (int r = 0; r < rows; r++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            matrix[r] = arr;

        }
    }


}

