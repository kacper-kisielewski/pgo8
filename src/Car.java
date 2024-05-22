public class Car extends Vehicle {

    public Car(double milesDriven, double fuelConsumed) {
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
    }

    @Override
    public double calculateFuelEfficiency() {
        return this.milesDriven / this.fuelConsumed;
    }
}
