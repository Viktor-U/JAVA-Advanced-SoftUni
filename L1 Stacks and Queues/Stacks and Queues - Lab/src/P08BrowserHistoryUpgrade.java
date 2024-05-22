import java.util.ArrayDeque;
import java.util.Scanner;

public class P08BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> browser = new ArrayDeque<>();
        ArrayDeque<String> forward = new ArrayDeque<>();

        while (!input.equals("Home")){

            if (input.equals("back")){

                if (browser.size() <= 1){
                    System.out.println("no previous URLs");
                }else {
                    forward.push(browser.pop());
                    System.out.println(browser.peek());

                }

            } else if (input.equals("forward")) {

                if (forward.size() < 1){

                    System.out.println("no next URLs");

                }else {
                    browser.push(forward.peek());
                    System.out.println(forward.pop());
                }

            } else {
                browser.push(input);
                System.out.println(browser.peek());
                forward.clear();
            }





            input = scanner.nextLine();
        }

    }
}
