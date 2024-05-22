import java.util.*;

public class P01UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Set<String> set = new LinkedHashSet<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            set.add(input);

        }

        for (String s : set) {
            System.out.println(s);
        }
    }
}