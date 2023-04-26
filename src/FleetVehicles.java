import java.util.ArrayList;

public class FleetVehicles {

    private ArrayList<Vehicle> vehicles;


    public FleetVehicles() {
        vehicles = new ArrayList<Vehicle>();
    }


    public void addVehicle(Vehicle vehicle) {
        if (vehicles.contains(vehicle)) {
            System.out.println("Vehicle with plate: " + vehicle.getPlate() + " already exists in the fleet");
        } else {
            vehicles.add(vehicle);
            System.out.println("Vehicle with plate: " + vehicle.getPlate() + " added to the fleet");
        }
    }

    public void removeVehicle(Vehicle vehicle) {
        if (vehicles.contains(vehicle)) {
            vehicles.remove(vehicle);
            System.out.println("Vehicle with plate: " + vehicle.getPlate() + " removed from the fleet");
        } else {
            System.out.println("Vehicle with plate: " + vehicle.getPlate() + " does not exist in the fleet");
        }
    }


    public void listAllVehicles() {
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle with plate: " + vehicle.getPlate() + " exists in the fleet");
        }
    }
}
