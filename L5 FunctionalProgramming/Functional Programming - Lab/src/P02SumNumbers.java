import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class P02SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();


        Function<int[], String> countNumbers = arr -> "Count = " + arr.length;
        Function<int[], String> sumNumbers = arr -> "Sum = " + Arrays.stream(arr).sum();

        System.out.println(countNumbers.apply(array));
        System.out.println(sumNumbers.apply(array));



    }
}
