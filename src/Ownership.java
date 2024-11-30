import java.util.HashMap;

public class Ownership {
    private HashMap<Vehicle, Person> ownershipRecords = new HashMap<>();

    public void transferOwnership(Vehicle vehicle, Person newOwner) {
        ownershipRecords.put(vehicle, newOwner);
    }

    public Person getOwner(Vehicle vehicle) {
        return ownershipRecords.get(vehicle);
    }
}
