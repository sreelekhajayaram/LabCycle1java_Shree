class Vehicle {
    public String company = "Toyota";
    protected String model = "Innova";
    String fuelType = "Diesel";   // default access

    void displayVehicle() {
        System.out.println("Vehicle Information");
        System.out.println("-------------------");
        System.out.println("Company   : " + company);
        System.out.println("Model     : " + model);
        System.out.println("Fuel Type : " + fuelType);
    }
}

class Car extends Vehicle {

    void displayCar() {
        displayVehicle();
        System.out.println();
        System.out.println("Car object created successfully.");
    }
}

public class Task_4 {
    public static void main(String[] args) {
        Car c = new Car();
        c.displayCar();
    }
}
