import java.util.Arrays;
import java.util.Scanner;

public class P05MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = inputArr[0];
        int cols = inputArr[1];


        String[][] matrix = new String[rows][cols];
        readMatrix(matrix,scanner);

        String input = scanner.nextLine();
        while (!input.equals("END")){

            String[] command = input.split("\\s+");
            // swap 0 1 0 0


            if (command[0].equals("swap") && command.length == 5 ){

                int firstRow = Integer.parseInt(command[1]);
                int firstCol = Integer.parseInt(command[2]);
                int secondRow = Integer.parseInt(command[3]);
                int secondCol = Integer.parseInt(command[4]);

                if (isValid(matrix,firstRow,firstCol,secondRow,secondCol)) {


                    String firstValue = matrix[firstRow][firstCol];
                    matrix[firstRow][firstCol] = matrix[secondRow][secondCol];
                    matrix[secondRow][secondCol] = firstValue;
                    printMatrix(matrix);
                }else {
                    System.out.println("Invalid input!");

                }
            }else {
                System.out.println("Invalid input!");
            }

            input = scanner.nextLine();
        }



    }

    private static void printMatrix(String[][] matrix) {

        for (String[] strings : matrix) {
            for (int c = 0; c < matrix[0].length; c++) {

                System.out.print(strings[c] + " ");

            }
            System.out.println();
        }


    }


    private static boolean isValid(String[][] matrix, int firstRow, int firstCol, int secondRow, int secondCol) {


        if (matrix.length <= firstRow && matrix.length <= secondRow && matrix[0].length <= firstCol && matrix[0].length <= secondCol){
            return false;
        }
        return 0 <= firstRow || 0 <= secondRow || 0 <= firstCol || 0 <= secondCol;
    }

    private static void readMatrix(String[][] matrix, Scanner scanner) {

        for (int i = 0; i < matrix.length; i++) {

            matrix[i] = (scanner.nextLine().split("\\s+"));

        }
    }
}
