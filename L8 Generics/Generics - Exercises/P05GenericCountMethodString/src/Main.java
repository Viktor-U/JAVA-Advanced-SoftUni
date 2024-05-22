import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Box<String>> list = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            Box<String> box = new Box<>(scanner.nextLine());

            list.add(box);
        }

        Box<String> box = new Box<>(scanner.nextLine());

        System.out.println(Box.counterGreaterElements(list,box));

    }
}