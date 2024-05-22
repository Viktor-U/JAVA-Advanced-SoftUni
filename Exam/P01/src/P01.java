import java.util.*;
import java.util.stream.Collectors;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> fuel = new Stack<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).forEach(fuel::push);

        ArrayDeque<Integer> consumption = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).forEach(consumption::offer);

        List<Integer> altitudes = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int reachedAltitudes = 1;

        while (!altitudes.isEmpty()) {
            int result = fuel.pop() - consumption.poll();


            if (result >= altitudes.get(0)) {

                altitudes.remove(0);
                System.out.printf("John has reached: Altitude %d%n", reachedAltitudes);
                reachedAltitudes++;

            } else {

                System.out.printf("John did not reach: Altitude %d%n", reachedAltitudes);
                reachedAltitudes--;

                break;
            }

        }
        if (altitudes.size() != 0) {

            System.out.println("John failed to reach the top.");
            if (reachedAltitudes != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Reached altitudes: ");
                for (int i = 1; i <= reachedAltitudes; i++) {
                    sb.append("Altitude ").append(i);
                    if (i != reachedAltitudes) {
                        sb.append(", ");
                    }
                }
                System.out.println(sb);

            } else {
                System.out.println("John didn't reach any altitude.");
            }
        } else {
            System.out.println("John has reached all the altitudes and managed to reach the top!");

        }
    }
}
