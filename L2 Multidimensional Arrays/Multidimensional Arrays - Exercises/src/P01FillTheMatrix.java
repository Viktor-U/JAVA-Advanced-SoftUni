import java.util.Scanner;

public class P01FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int n = Integer.parseInt(input[0]);
        String pathType = input[1];

        if (pathType.equals("A")) {

            pathA(n);

        } else if (pathType.equals("B")) {

            pathB(n);

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


    private static void pathA(int n) {

        int[][] matrix = new int[n][n];

        int num = 1;

        for (int c = 0; c < n; c++) {
            for (int r = 0; r < n; r++) {

                matrix[r][c] = num;
                num++;

            }

        }
        printMatrix(matrix);

    }
    private static void pathB(int n) {

        int[][] matrix = new int[n][n];

        int num = 1;
        for (int c = 0; c < n; c++) {
           if (c % 2 == 0){
               for (int r = 0; r < n; r++) {
                   matrix[r][c] = num;
                   num++;
               }

           }else {

               for (int r = n - 1; r >= 0; r--) {
                   matrix[r][c] = num;
                   num++;
               }
           }

        }




        printMatrix(matrix);


    }
}
