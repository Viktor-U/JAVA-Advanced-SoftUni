import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")){

            switch (command){
                case "add":
                    list = list.stream().map(e -> e + 1).collect(Collectors.toList());
                    break;
                case "multiply" :
                    list = list.stream().map(e -> e * 2).collect(Collectors.toList());
                    break;
                case "subtract" :
                    list = list.stream().map(e -> e - 1).collect(Collectors.toList());
                    break;
                default:
                    list.forEach(e -> System.out.print(e + " "));
                    System.out.println();
                    break;

            }


            command = scanner.nextLine();
        }

    }
}
