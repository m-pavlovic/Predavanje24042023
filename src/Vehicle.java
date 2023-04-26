import java.util.concurrent.ThreadLocalRandom;

public class Vehicle {

    private String model;
    private int years;
    private String color;
    private String brand;
    private String plate;
    private int id;
    private static int countId = 100;


    public Vehicle (String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.id = countId++;
        this.years = ThreadLocalRandom.current().nextInt(1, 20 + 1);
        this.color = "black";
        this.plate = "AA-00-00";
    }

    public String getPlate() {
        return this.plate;
    }

    public void driveVehicle() {
        System.out.println("Driving vehicle " + this.brand + " " + this.model + " with plate " + this.plate);
    }

}
