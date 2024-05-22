import java.util.*;

public class P04MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int row = arr[0];
        int col = arr[1];

        int[][] matrix = new int[row][col];
        readMatrix(matrix,scanner);

        int[][] maxMatrix3x3 = createMatrix(matrix);

        int maxSum = matrixCalculator(maxMatrix3x3);

        System.out.println("Sum = " + maxSum);

        printMatrix(maxMatrix3x3);




    }

    private static int[][] createMatrix(int[][] matrix) {


        int[][] testMatrix = new int[3][3];
        int[][] maxMatrix = new int[3][3];
        int maxValue = Integer.MIN_VALUE;



        for (int r = 0; r < matrix.length - 2; r++) {
            for (int c = 0; c < matrix[0].length - 2; c++) {

                int row = 0;
                int col = 0;

                testMatrix[row][col] = matrix[r][c];
                col++;
                testMatrix[row][col] = matrix[r][c+1];
                col++;
                testMatrix[row][col] = matrix[r][c+2];
                col=0;
                row++;
                testMatrix[row][col] = matrix[r+1][c];
                col++;
                testMatrix[row][col] = matrix[r+1][c+1];
                col++;
                testMatrix[row][col] = matrix[r+1][c+2];
                col=0;
                row++;
                testMatrix[row][col] = matrix[r+2][c];
                col++;
                testMatrix[row][col] = matrix[r+2][c+1];
                col++;
                testMatrix[row][col] = matrix[r+2][c+2];
                
                if (maxValue < matrixCalculator(testMatrix)) {
                    maxValue = matrixCalculator(testMatrix);

                    for (int i = 0; i < 3; i++) {
                        System.arraycopy(testMatrix[i], 0, maxMatrix[i], 0, 3);
                    }

                }
            }
        }





        return maxMatrix;
    }

    private static int matrixCalculator(int[][] maxMatrix) {

        int sum = 0;
        
        
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                sum += maxMatrix[r][c];
            }
        }
        
        return sum;
    }

    private static void readMatrix(int[][] matrix, Scanner scanner) {

        for (int i = 0; i < matrix.length; i++) {

            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        }
    }
    private static void printMatrix (int[][] matrix){

        for (int[] ints : matrix) {
            for (int c = 0; c < matrix[0].length; c++) {

                System.out.print(ints[c] + " ");

            }
            System.out.println();
        }

    }
}
