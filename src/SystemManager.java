import java.util.List;

public class SystemManager {
    private Ownership ownership = new Ownership();

    public void transferVehicle(Vehicle vehicle, Person newOwner) {
        ownership.transferOwnership(vehicle, newOwner);
    }

    public void generateTaxReport(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            Person owner = ownership.getOwner(vehicle);
            if (owner != null) {
                System.out.println("Owner: " + owner.getName() + ", Vehicle: " + vehicle.getPlateNumber() +
                        ", Tax: " + vehicle.calculateTax());
            }
        }
    }
}
