import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Box<Integer> box = new Box<>(1);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(scanner.nextLine());
            box.add(a);
        }
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        box.swap(a, b);

        box.getList().forEach(e -> System.out.println(box + "" + e));
    }
}