public class Truck extends Vehicle {
    public double cargoWeight;

    public Truck(double milesDriven, double fuelConsumed, double cargoWeight) {
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
        this.cargoWeight = cargoWeight;
    }

    @Override
    public double calculateFuelEfficiency() {
        return milesDriven / (fuelConsumed + (cargoWeight * 0.5));
    }
}
