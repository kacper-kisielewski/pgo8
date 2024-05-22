public abstract class Vehicle {
    public String brand;
    public String model;
    public int year;

    public double milesDriven;
    public double fuelConsumed;

    abstract double calculateFuelEfficiency();
}
