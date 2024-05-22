import java.util.Collections;
import java.util.Scanner;
import java.util.PriorityQueue;

public class P07MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] kids = scanner.nextLine().split("\\s+");

        PriorityQueue<String> queue = new PriorityQueue<>();
        Collections.addAll(queue, kids);

        int num = Integer.parseInt(scanner.nextLine());
        int cycle = 1;
        while (queue.size() != 1) {



            for (int i = 1; i <= num; i++) {
                String kidName = queue.remove();
                queue.add(kidName);
            }
            if (isPrime(cycle)){
                System.out.println("Prime " + queue.peek());

            }else {
                System.out.println("Removed " + queue.remove());
            }
            cycle++;
        }


        System.out.println("Last is " + queue.remove());


    }
    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
