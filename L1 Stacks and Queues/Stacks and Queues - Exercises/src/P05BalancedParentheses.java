import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P05BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split("");

        Deque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            String brace = input[i];
            switch (brace){
                case "]":
                    if (stack.isEmpty()){
                        System.out.println("NO");
                        return;
                    }
                    String openBrace = stack.pop();
                    if (!openBrace.equals("[")){
                        System.out.println("NO");
                        return;
                    }
                    break;
                case ")":
                    if (stack.isEmpty()){
                        System.out.println("NO");
                        return;
                    }
                    openBrace = stack.pop();
                    if (!openBrace.equals("(")){
                        System.out.println("NO");
                        return;
                    }
                    break;
                case "}":
                    if (stack.isEmpty()){
                        System.out.println("NO");
                        return;
                    }
                    openBrace = stack.pop();
                    if (!openBrace.equals("{")){
                        System.out.println("NO");
                        return;
                    }
                    break;
                default:
                    stack.push(brace);
                    break;
            }
        }
        System.out.println("YES");

    }
}
