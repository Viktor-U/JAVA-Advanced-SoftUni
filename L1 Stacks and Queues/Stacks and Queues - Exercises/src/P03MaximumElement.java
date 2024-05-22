import java.util.*;
import java.util.stream.Collectors;

public class P03MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            List<Integer> num = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());



            if (num.get(0) == 2){
                if (!stack.isEmpty()) {
                    stack.poll();
                }

            } else if (num.get(0) == 1) {

                stack.push(num.get(1));

            }else if(num.get(0) == 3){

                System.out.println(Collections.max(stack));

            }
        }


    }

}
