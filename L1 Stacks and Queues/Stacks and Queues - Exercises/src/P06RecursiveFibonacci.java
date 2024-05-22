import java.util.Scanner;

public class P06RecursiveFibonacci {

    private static long[] memory;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        memory = new  long[num + 1];

        long result = fib(num);
        System.out.println(result);
    }

    private static long fib(int num) {


        if ((num < 2)){
            return 1;
        }
        if (memory[num] != 0){
            return memory[num];
        }

        memory[num] =  fib(num-1) + fib(num - 2);
        return memory[num];
    }
}
