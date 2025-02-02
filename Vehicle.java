public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 1000.0;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public static double getRegistrationFee() {
        return registrationFee;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayVehicleDetails() {
      
        System.out.println("Owner Name " + ownerName);
        System.out.println("Vehicle Type " + vehicleType);
        System.out.println("Registration Fee" + registrationFee);
    }
}

