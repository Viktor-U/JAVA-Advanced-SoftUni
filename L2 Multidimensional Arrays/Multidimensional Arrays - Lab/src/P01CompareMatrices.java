import java.util.Arrays;
import java.util.Scanner;

public class P01CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstMeasure = readArr(scanner);

        int fRows = firstMeasure[0];
        int fColons = firstMeasure[1];
        int[][] firstMatrix = new int[fRows][fColons];
        readMatrix(scanner, fRows, firstMatrix);


        int[] secondMeasure = readArr(scanner);
        int sRows = secondMeasure[0];
        int sColons = secondMeasure[1];
        int[][] secondMatrix = new int[sRows][sColons];
        readMatrix(scanner, sRows, secondMatrix);

        boolean isMatch = matchMatrices(fRows, fColons, firstMatrix, sRows, sColons, secondMatrix);

        if (isMatch){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }


    }

    private static boolean matchMatrices(int fRows, int fColons, int[][] firstMatrix, int sRows, int sColons, int[][] secondMatrix) {
        if (fRows == sRows && fColons == sColons){

            for (int r = 0; r < fRows; r++) {
                for (int c = 0; c < fColons; c++) {
                    if (secondMatrix[r][c] != firstMatrix[r][c]){

                        return false;

                    }
                }
            }
            return true;
        }
        return false;
    }

    private static void readMatrix(Scanner scanner, int rows, int[][] firstMatrix) {
        for (int i = 0; i < rows; i++) {

            firstMatrix[i] = readArr(scanner);

        }
    }

    private static int[] readArr(Scanner scanner) {

        return Arrays.stream(scanner.nextLine().split("\\s+")).
                mapToInt(Integer::parseInt).
                toArray();

    }
}