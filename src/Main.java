import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person john = new Person("123456", "John", "Doe", "123 Street");
        Person jane = new Person("654321", "Jane", "Smith", "456 Avenue");

        Car car1 = new Car("ABC123", "Toyota", "Corolla", 120, "petrol");
        Motorcycle bike1 = new Motorcycle("XYZ987", "Honda", "CBR500", 500);

        SystemManager manager = new SystemManager();

        // Transfer ownership
        manager.transferVehicle(car1, john);
        manager.transferVehicle(bike1, jane);

        // Generate tax report
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car1);
        vehicles.add(bike1);
        manager.generateTaxReport(vehicles);
    }
}
