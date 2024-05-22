import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P05ReverseAndExclude {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                                   .map(Integer::parseInt)
                                   .collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());


        Predicate<Integer> filter = e -> e % n == 0;
        list.removeIf(filter);

        Collections.reverse(list);
        list.forEach(e -> System.out.print(e + " "));



    }
}
