import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n ; i++) {

            String[] arr = scanner.nextLine().split(" ");
            String name = arr[0];
            int age = Integer.parseInt(arr[1]);

            Person person = new Person(name, age);

            people.add(person);

        }

        people.stream()
                .filter(person -> person.getAge() > 30)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);

    }
}