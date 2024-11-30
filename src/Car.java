public class Car extends Vehicle {
    private double co2Emissions;
    private String fuelType;

    public Car(String plateNumber, String maker, String model, double co2Emissions, String fuelType) {
        super(plateNumber, maker, model);
        this.co2Emissions = co2Emissions;
        this.fuelType = fuelType;
    }

    @Override
    public double calculateTax() {
        switch (fuelType.toLowerCase()) {
            case "petrol":
                return co2Emissions * 1.4;
            case "diesel":
                return co2Emissions * 1.8;
            case "hybrid":
                return co2Emissions * 1.2;
            default:
                return 0;
        }
    }
}
