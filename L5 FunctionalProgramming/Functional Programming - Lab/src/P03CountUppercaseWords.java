import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P03CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split(" ");

        Predicate<String> isUppercase = s -> Character.isUpperCase(s.charAt(0));

        Function<String[], List<String>> getUpperCase = arr -> Arrays.stream(arr).filter(isUppercase).collect(Collectors.toList());


        System.out.println(getUpperCase.apply(text).size());

        getUpperCase.apply(text).forEach(System.out::println);




    }
}
