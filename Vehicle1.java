public class Vehicle1 {
    private String make;
    private String model;
    private int year;
    private String fuelType;

    // Constructor
    public Vehicle1(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    // Getters and Setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    // Methods with sample implementation
    public void fuelEfficiency() {
        System.out.println("Calculating fuel efficiency...");
    }

    public void distanceTraverse() {
        System.out.println("Calculating distance traversed...");
    }

    public void maxSpeed() {
        System.out.println("Calculating maximum speed...");
    }

    // Optional: Override toString
    @Override
    public String toString() {
        return "Vehicle1{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }

    // Main Method for Testing
    public static void main(String[] args) {
        Vehicle1 vehicle = new Vehicle1("Toyota", "Corolla", 2020, "Petrol");
        System.out.println(vehicle);
        vehicle.fuelEfficiency();
        vehicle.distanceTraverse();
        vehicle.maxSpeed();
    }
}
