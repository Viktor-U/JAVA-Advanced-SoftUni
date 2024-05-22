import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Engine> engineList = new ArrayList<>();
        List<Car> carsList = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            String[] arr = scanner.nextLine().split("\\s+");

            Engine engine = new Engine();

            engine.setModel(arr[0]);
            engine.setPower(arr[1]);

            if (arr.length == 3){
                if (arr[2].charAt(0) > 64){
                    engine.setEfficiency(arr[2]);
                }else {
                    engine.setDisplacement(arr[2]);
                }
            }else if (arr.length > 3 ){
                engine.setDisplacement(arr[2]);
                engine.setEfficiency(arr[3]);
            }

            engineList.add(engine);

        }

        n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] arr = scanner.nextLine().split("\\s+");

            Car car = new Car();

            car.setModel(arr[0]);

            for (Engine engine : engineList) {

                if (engine.getModel().equals(arr[1])){
                    car.setEngine(engine);
                }
            }

            if (arr.length == 3){
                if (arr[2].charAt(0) > 64){
                    car.setColor(arr[2]);
                }else {
                    car.setWeight(arr[2]);
                }
            }else if (arr.length > 3 ){
                car.setWeight(arr[2]);
                car.setColor(arr[3]);
            }

            carsList.add(car);

        }


        carsList.forEach(System.out::print);



    }
}