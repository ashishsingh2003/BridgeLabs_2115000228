class VehicleClass {
    static double registrationFee = 5000.0;
    String ownerName;
    String vehicleType;
    final String registrationNumber;

    public VehicleClass(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: $" + registrationFee);
    }

    public void displayVehicleDetails() {
        if (this instanceof VehicleClass) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        } else {
            System.out.println("Invalid Vehicle object.");
        }
    }
}

public class Vehicle {
    public static void main(String[] args) {
        VehicleClass car = new VehicleClass("Ashish", "Car", "CAR1234");
        VehicleClass bike = new VehicleClass("Gaurav", "Bike", "BIKE5678");

        car.displayVehicleDetails();
        System.out.println();
        bike.displayVehicleDetails();

        System.out.println();
        VehicleClass.updateRegistrationFee(6000.0);

        System.out.println();
        car.displayVehicleDetails();
        System.out.println();
        bike.displayVehicleDetails();
    }
}
