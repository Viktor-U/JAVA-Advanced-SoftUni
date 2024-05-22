import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P02SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");

        ArrayDeque<String> calculator = new ArrayDeque<>();

        Collections.addAll(calculator, tokens);

        while (calculator.size() > 1){
            int firstNum = Integer.parseInt(calculator.pop());
            String op = calculator.pop();
            int secondNum = Integer.parseInt(calculator.pop());

            switch (op){
                case "+": calculator.push(String.valueOf(firstNum + secondNum));
                    break;
                case "-": calculator.push(String.valueOf(firstNum - secondNum));
                    break;
            }



        }
        System.out.println(calculator.pop());

    }
}
