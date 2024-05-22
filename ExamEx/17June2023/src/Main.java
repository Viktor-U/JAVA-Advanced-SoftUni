import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> tools = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).forEach(tools::offer);

        ArrayDeque<Integer> substances = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).forEach(substances::push);

        List<Integer> challenges = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());


        while (!tools.isEmpty() && !substances.isEmpty() && !challenges.isEmpty()) {
            int tool = tools.pop();
            int substance = substances.peek();
            int weapon = tool * substance;

            boolean isPassed = false;

            for (int challenge : challenges) {

                if (challenge == weapon) {
                    challenges.remove((Integer) challenge);
                    isPassed = true;
                    break;
                }

            }

            if (!isPassed) {
                tools.add(tool + 1);
                if (substance > 1) {
                    substances.push(substance - 1);
                }
            }
        }

        if (challenges.isEmpty()){

            System.out.println("Harry found an ostracon, which is dated to the 6th century BCE.");
            if (!tools.isEmpty()) {
                System.out.print("Tools: ");
                int toolsSize = tools.size();
                for (int i = 0; i < toolsSize - 1; i++) {
                    System.out.print(tools.pop() + ", ");
                }
                System.out.println(tools.pop());
            }
            if (!substances.isEmpty()) {
                System.out.print("Substances: ");
                int substancesSize = substances.size();
                for (int i = 0; i < substancesSize - 1; i++) {
                    System.out.print(substances.pop() + ", ");
                }
                System.out.println(substances.pop());
            }
        }else {

            System.out.println("Harry is lost in the temple. Oblivion awaits him.");
            if (!tools.isEmpty()) {
                System.out.print("Tools: ");
                int toolsSize = tools.size();
                for (int i = 0; i < toolsSize - 1; i++) {
                    System.out.print(tools.pop() + ", ");
                }
                System.out.println(tools.pop());
            }
            if (!substances.isEmpty()) {
                System.out.print("Substances: ");
                int substancesSize = substances.size();
                for (int i = 0; i < substancesSize - 1; i++) {
                    System.out.print(substances.pop() + ", ");
                }
                System.out.println(substances.pop());
            }

            System.out.print("Challenges: ");
            for (int i = 0; i < challenges.size() - 1; i++) {
                System.out.print(challenges.get(i) + ", ");
            }
            System.out.print(challenges.get(challenges.size()-1));

        }







    }
}