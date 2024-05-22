import java.util.ArrayList;
import java.util.List;

public class RepairShop {

    private final List<Vehicle> vehicles = new ArrayList<>();
    private final int capacity;

    public RepairShop(int capacity) {
        this.capacity = capacity;
    }

    public void addVehicle (Vehicle vehicle){
        if (vehicles.size() < capacity) {
            vehicles.add(vehicle);
        }
    }
    public boolean removeVehicle (String vehicle){
        Vehicle v = null;

        for (Vehicle vehicle1 : vehicles) {
            if (vehicle1.getVIN().equals(vehicle)){
                v = vehicle1;
                break;
            }

        }

        return vehicles.remove(v);
    }

    public int getCount(){
        return vehicles.size();
    }

    public Vehicle getLowestMileage (){

        int lowestValue = Integer.MAX_VALUE;
        Vehicle vehicle = null;

        for (Vehicle v : vehicles) {

            if (v.getMileage() < lowestValue){
                lowestValue = v.getMileage();
                vehicle = v;
            }

        }
        return vehicle;
    }
    public String report(){

        StringBuilder sb = new StringBuilder();
        sb.append("Vehicles in the preparatory:");

        for (Vehicle vehicle : vehicles) {
            sb.append(System.lineSeparator());
            sb.append(vehicle);
        }
        return sb.toString();
    }

}
