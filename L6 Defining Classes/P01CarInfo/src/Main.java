import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split(" ");

            String model = input[0] + " " + input[1];
            String hP = input[2];

            Car car = new Car(model, hP);

            cars.add(car);
        }


        for (Car car : cars) {
            System.out.println(car);
        }

    }
}