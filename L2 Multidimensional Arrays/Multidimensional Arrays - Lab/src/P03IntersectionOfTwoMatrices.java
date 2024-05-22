import java.util.Scanner;

public class P03IntersectionOfTwoMatrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int colones = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = new char[rows][colones];
        char[][] secondMatrix = new char[rows][colones];

        readMatrices(scanner, rows, firstMatrix);
        readMatrices(scanner, rows, secondMatrix);

        char[][] resultMatrix = makePath(firstMatrix, secondMatrix);


        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < colones; c++) {
                System.out.print(resultMatrix[r][c] + " ");
            }
            System.out.println();
        }




    }
    private static char[][] makePath(char[][]firstMatrix, char[][] secondMatrix){

        char[][] path = new char[firstMatrix.length][firstMatrix[0].length];

        for (int r = 0; r < firstMatrix.length; r++) {
            for (int c = 0; c < firstMatrix[0].length ; c++) {

                if (firstMatrix[r][c] == secondMatrix[r][c]){
                    path[r][c] = firstMatrix[r][c];
                }else {
                    path[r][c] = '*';
                }

            }

        }
        return path;

    }
    private static void readMatrices(Scanner scanner, int rows, char[][] matrix) {
        for (int r = 0; r < rows; r++) {
            char[] arr = scanner.nextLine().replaceAll(" ", "").toCharArray();

            matrix[r] = arr;

        }
    }
}
