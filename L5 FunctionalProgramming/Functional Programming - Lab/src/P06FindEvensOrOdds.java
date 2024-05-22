import java.util.*;
import java.util.function.BiFunction;

public class P06FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int begin = arr[0];
        int end = arr[1];

        String command = scanner.nextLine();

        BiFunction<Integer, Integer, List<Integer>> sorter = (a, b) ->{

            List<Integer> list = new ArrayList<>();

            for (int i = a; i <= b; i++) {

                list.add(i);

            }
            return list;

        };


        List<Integer> list = sorter.apply(begin, end);

        if (command.equals("odd")){

            list.stream().filter(e -> e % 2 ==1).forEach(e -> System.out.print(e + " "));

        }else {
            list.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.print(e + " "));
        }



    }
}
