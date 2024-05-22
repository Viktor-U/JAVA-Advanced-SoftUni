import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P09ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Predicate<Integer> isDivisible = e -> {

                boolean isDivisibleNum = true;

                for (Integer integer : list) {

                    if (e % integer != 0){

                        isDivisibleNum = false;
                        break;

                    }
                }
                return isDivisibleNum;

        };

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            numbers.add(i);

        }


        numbers.stream().filter(isDivisible).forEach(e ->System.out.print(e + " "));



    }
}
