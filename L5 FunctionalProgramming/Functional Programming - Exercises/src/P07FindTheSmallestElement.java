import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P07FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Function<List<Integer>, Integer> smallestNum = list -> list.stream().mapToInt(v -> v).min().orElseThrow();
        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(list.lastIndexOf(smallestNum.apply(list)));




    }
}
