import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class P02BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int n = input[0];
        int s = input[1];
        int x = input[2];

        int[] stackInput = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            stack.push(stackInput[i]);

        }
        if (stack.isEmpty()){
            System.out.println(0);
            return;
        }

        for (int i = 0; i < s; i++) {

            stack.pop();

        }
        if (stack.isEmpty()){
            System.out.println(0);
            return;
        }

        String result = Test(x, stack);

        System.out.println(result);

    }

    private static String Test(int x , Deque<Integer> stack) {


        int minNum = Integer.MAX_VALUE ;


        if (stack.contains(x)){
            return "true";
        }

        for (int i = 0; i < stack.size(); i++) {

            if (minNum >= stack.peek()){

                minNum = stack.peek();

            }

            stack.pop();

        }



        return String.valueOf(minNum);
    }
}
