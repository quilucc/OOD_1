public abstract class Vehicle {
    private String plateNumber;
    private String maker;
    private String model;

    public Vehicle(String plateNumber, String maker, String model) {
        this.plateNumber = plateNumber;
        this.maker = maker;
        this.model = model;
    }
    public String getPlateNumber() {
        return plateNumber;
    }

    public abstract double calculateTax();

    // Getters and setters
}
