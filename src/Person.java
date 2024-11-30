public class Person {
    private String licenseNumber;
    private String name;
    private String surname;
    private String address;

    // Constructor
    public Person(String licenseNumber, String name, String surname, String address) {
        this.licenseNumber = licenseNumber;
        this.name = name;
        this.surname = surname;
        this.address = address;
    }
    public String getName() {
        return name + " " + surname; // Combines name and surname
    }

    // Getters and setters
    // toString method
}
