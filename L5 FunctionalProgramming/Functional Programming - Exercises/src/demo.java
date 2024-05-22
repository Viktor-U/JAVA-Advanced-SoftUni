import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        //2 3 5

// 10 --NUM
        Predicate<Integer> filter = num -> {

            boolean isTrue = true;
            //FALSE
            for (Integer number : numbers) {

                if (num % number  != 0){

                    isTrue = false;
                    break;

                }

            }

            return isTrue;

        };

        List<Integer> qkoMie = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {

            qkoMie.add(i);

        }

        Consumer<Integer> printerche = num -> System.out.print(num + " ");

        ;


        qkoMie.stream().filter(filter).forEach(printerche);


    }
}
