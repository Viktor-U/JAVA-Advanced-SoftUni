import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split("\\(");
        int rotation = Integer.parseInt(arr[1].replace(")", ""));
        int times = rotation / 90;

        String input = scanner.nextLine();
        List<String> list = new ArrayList<>();


        while (!input.equals("END")){

            list.add(input);

            input = scanner.nextLine();
        }

        int row = list.size();
        int col = findLongestWord(list);

        String[][] matrix = new String[row][col];
        readMatrix(list, matrix);


        for (int i = 0; i < times ; i++) {

        matrix = rotateMatrix(matrix);

        }


        printMatrix(matrix);



    }
    private static void printMatrix (String[][] matrix){

        for (String[] ints : matrix) {
            for (int c = 0; c < matrix[0].length; c++) {

                System.out.print(ints[c]);

            }
            System.out.println();
        }

    }

    private static String[][] rotateMatrix(String[][] matrix) {



            int row = matrix[0].length;
            int col = matrix.length;

            String[][] newMatrix = new String[row][col];

            int newRow = 0;
            int newCol = newMatrix[0].length - 1;

        for (String[] strings : matrix) {
            for (int c = 0; c < row; c++) {

                newMatrix[newRow][newCol] = strings[c];

                newRow++;
            }
            newCol--;
            newRow = 0;
        }
            return newMatrix;

    }

    private static void readMatrix(List<String> list, String[][] matrix) {

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {

                if (list.get(r).length() > c) {
                    String currentChar = String.valueOf(list.get(r).toCharArray()[c]);
                    matrix[r][c] = currentChar;
                }else {
                    matrix[r][c] = " ";
                }

            }
        }

    }

    private static int findLongestWord(List<String> list) {


        int size = 0;


        for (String s : list) {

            int currentWord = s.length();

            if (currentWord > size) {
                size = currentWord;
            }

        }


        return size;
    }
}
