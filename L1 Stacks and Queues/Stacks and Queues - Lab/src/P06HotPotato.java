import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P06HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] kids = scanner.nextLine().split("\\s+");

        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, kids);

        int num = Integer.parseInt(scanner.nextLine());

        while (queue.size() != 1) {

            for (int i = 1; i < num; i++) {
                String kidName = queue.remove();
                queue.add(kidName);
            }

            System.out.println("Removed " + queue.remove());

        }


        System.out.println("Last is " + queue.remove());


    }
}
