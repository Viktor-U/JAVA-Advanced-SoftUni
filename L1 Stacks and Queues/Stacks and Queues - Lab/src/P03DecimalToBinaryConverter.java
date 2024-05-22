import java.util.ArrayDeque;
import java.util.Scanner;

public class P03DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> binary = new ArrayDeque<>();

        int num = Integer.parseInt(scanner.nextLine());

        if (num != 0) {
            while (num != 0) {
                binary.push(num % 2);
                num /= 2;
            }
            while (!binary.isEmpty()) {
                System.out.print(binary.pop());
            }
        }else {
            System.out.println(0);
        }
    }
}
