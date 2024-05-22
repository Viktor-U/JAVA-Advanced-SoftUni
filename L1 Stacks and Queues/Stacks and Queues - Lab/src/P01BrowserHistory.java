import java.util.ArrayDeque;
import java.util.Scanner;

public class P01BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> browser = new ArrayDeque<>();

        while (!input.equals("Home")){

            if (input.equals("back")){

                if (browser.size() <= 1){
                    System.out.println("no previous URLs");
                }else {
                    browser.pop();
                    System.out.println(browser.peek());
                }

            }else {
                browser.push(input);
                System.out.println(browser.peek());
            }





            input = scanner.nextLine();
        }

    }
}