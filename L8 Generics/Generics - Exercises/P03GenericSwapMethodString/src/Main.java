import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Box<String> box = new Box<>("a");

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String a = scanner.nextLine();
            box.add(a);
        }
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        box.swap(a, b);

       box.getList().forEach(e -> System.out.println(box + e));
    }
}