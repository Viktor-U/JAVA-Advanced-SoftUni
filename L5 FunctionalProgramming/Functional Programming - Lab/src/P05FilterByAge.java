import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P05FilterByAge {


    public static class Person{
        String name;
        int age;


    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String[] arr = scanner.nextLine().split(", ");
            String name = arr[0];
            int age  = Integer.parseInt(arr[1]);

            Person p = new Person();
            p.name = name;
            p.age = age;

            people.add(p);

        }

        String type = scanner.nextLine();
        int ages = Integer.parseInt(scanner.nextLine());
        String printFormat = scanner.nextLine();

        Function<List<Person>, List<Person>> younger = list -> list.stream().filter(p -> p.age <= ages).collect(Collectors.toList());
        Function<List<Person>, List<Person>> older = list -> list.stream().filter(p -> p.age >= ages).collect(Collectors.toList());

        if (type.equals("younger")){

            people = younger.apply(people);

        }else {

            people = older.apply(people);

        }

        switch (printFormat){

            case "age":

                people.forEach(person -> System.out.println(person.age));

                break;
            case "name":

                people.forEach(person -> System.out.println(person.name));


                break;
            default:

                people.forEach(person -> System.out.println(person.name + " - " + person.age));


                break;
        }



    }
}
