public class Car {

    private final String model;
    private final String horsePower;


    public Car(String model, String horsePower) {
        this.model = model;
        this.horsePower = horsePower;
    }

    @Override
    public String toString (){

        return String.format("The car is: %s - %s HP." , this.model, this.horsePower);

    }
}
