import java.util.Arrays;
import java.util.Scanner;


public class P03CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        int minNum = Integer.MAX_VALUE;

        for (int j : arr) {

            if (j < minNum) {
                minNum = j;
            }

        }
        System.out.println(minNum);


    }
}
