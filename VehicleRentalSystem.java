import java.util.*;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    protected double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);
    
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public double calculateRentalCost(int days) {
        return days * rentalRate;
    }
    
    public double calculateInsurance() {
        return rentalRate * 0.1;
    }
    
    public String getInsuranceDetails() {
        return "Policy: " + insurancePolicyNumber;
    }
}

class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public double calculateRentalCost(int days) {
        return days * rentalRate;
    }
    
    public double calculateInsurance() {
        return rentalRate * 0.05;
    }
    
    public String getInsuranceDetails() {
        return "Policy: " + insurancePolicyNumber;
    }
}

class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public double calculateRentalCost(int days) {
        return days * rentalRate * 1.2;
    }
    
    public double calculateInsurance() {
        return rentalRate * 0.15;
    }
    
    public String getInsuranceDetails() {
        return "Policy: " + insurancePolicyNumber;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("C123", 50, "CAR-001"));
        vehicles.add(new Bike("B456", 20, "BIKE-002"));
        vehicles.add(new Truck("T789", 100, "TRUCK-003"));

        int rentalDays = 5;
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getType() + " Rental Cost: " + vehicle.calculateRentalCost(rentalDays));
            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println(vehicle.getType() + " Insurance Cost: " + insurable.calculateInsurance());
                System.out.println(vehicle.getType() + " Insurance Details: " + insurable.getInsuranceDetails());
            }
        }
    }
}
