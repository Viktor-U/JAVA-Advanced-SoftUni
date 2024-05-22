import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P07Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimension = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = dimension[0];
        int cols = dimension[1];

        List<List<Integer>> matrix = createMatrix(rows, cols);

        String input = scanner.nextLine();

        while (!input.equals("Nuke it from orbit")){

            int[] inputArr = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int row = inputArr[0];
            int col = inputArr[1];
            int radius = inputArr[2];

            destroyCells(matrix, row ,col ,radius);



            input = scanner.nextLine();

        }

        printMatrix(matrix);

    }

    private static void destroyCells(List<List<Integer>> matrix, int row, int col, int radius) {


        for (int r = row - radius; r <= row + radius ; r++) {

            if (isValid(matrix, r , col)) {
                matrix.get(r).set(col, 0);
            }
        }

        for (int c = col - radius; c <= col + radius; c++) {
            if (isValid(matrix, row, c)) {
                matrix.get(row).set(c, 0);
            }
        }


        for (int r = 0; r < matrix.size(); r++) {
            List<Integer> currentRow = matrix.get(r);
            currentRow.removeAll(List.of(0));

            if (matrix.get(r).size() == 0){
                matrix.remove(r);
                r--;
            }

        }



    }

    private static boolean isValid(List<List<Integer>> matrix, int r, int col) {

        return r >= 0 && r < matrix.size() && col >= 0 && col < matrix.get(r).size();

    }

    private static void printMatrix(List<List<Integer>> matrix) {

        for (List<Integer> integers : matrix) {
            integers.forEach(e -> System.out.print(e + " ") );
            System.out.println();
        }

    }

    private static  List<List<Integer>> createMatrix(int rows, int cols) {

        List<List<Integer>> matrix = new ArrayList<>();

        int counter = 1;

        for (int r = 0; r < rows; r++) {
            List<Integer> numbers = new ArrayList<>();
            for (int c = 0; c < cols; c++) {
                numbers.add(counter);
                counter++;
            }
            matrix.add(numbers);
        }

        return matrix;
    }
}
