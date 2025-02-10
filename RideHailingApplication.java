import java.util.*;

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    protected double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate per Km: " + ratePerKm;
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

class Car extends Vehicle implements GPS {
    private String location;

    public Car(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location = location;
    }

    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}

class Bike extends Vehicle implements GPS {
    private String location;

    public Bike(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location = location;
    }

    public double calculateFare(double distance) {
        return distance * ratePerKm * 0.8; // Bikes have lower fare
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}

class Auto extends Vehicle implements GPS {
    private String location;

    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location = location;
    }

    public double calculateFare(double distance) {
        return distance * ratePerKm * 0.9; // Autos have a slight discount
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        List<Vehicle> rides = new ArrayList<>();
        rides.add(new Car("C101", "John Doe", 10, "Downtown"));
        rides.add(new Bike("B202", "Jane Smith", 8, "Uptown"));
        rides.add(new Auto("A303", "Mike Ross", 9, "Suburbs"));

        double distance = 15;
        for (Vehicle ride : rides) {
            System.out.println(ride.getVehicleDetails());
            System.out.println("Fare for " + distance + " km: " + ride.calculateFare(distance));
            if (ride instanceof GPS) {
                GPS gpsEnabled = (GPS) ride;
                System.out.println("Current Location: " + gpsEnabled.getCurrentLocation());
            }
            System.out.println();
        }
    }
}

