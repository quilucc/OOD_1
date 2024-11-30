public class Motorcycle extends Vehicle {
    private double engineDisplacement;

    public Motorcycle(String plateNumber, String maker, String model, double engineDisplacement) {
        super(plateNumber, maker, model);
        this.engineDisplacement = engineDisplacement;
    }

    @Override
    public double calculateTax() {
        return engineDisplacement * 0.10;
    }
}
