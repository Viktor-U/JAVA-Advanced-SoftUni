public class Car {

    private String model;
    private String type;
    private int horsePower ;

    public Car(String model) {
        this.model = model;
        this.type = "unknown";
        this.horsePower = -1;
    }

    public Car(String model, String type, String horsePower) {
        this.model = model;
        this.type = type;
        this.horsePower = Integer.parseInt(horsePower);
    }
    @Override
    public String toString (){

        return String.format("The car is: %s %s - %d HP." , this.model, this.type, this.horsePower);

    }

}
