package exceptions.trycatch;

public class Car {
    private double distanceTravelled = 0;
    private double fuelInTank = 100;
    private static final double LITERS_PER_100KM = 10;

    public void drive(double distance) throws NotEnoughFuelException {
        double fuelNeeded = distance * LITERS_PER_100KM / 100;

        if (fuelNeeded <= fuelInTank) {
            fuelInTank -= fuelNeeded;
            distanceTravelled += distance;
            System.out.println("Remaining fuel after " + distanceTravelled + "km: " + fuelInTank);
        } else {
            throw new NotEnoughFuelException(fuelInTank * LITERS_PER_100KM, distance);
        }
    }

    public double getFuelLeft() {
        return fuelInTank;
    }
}
