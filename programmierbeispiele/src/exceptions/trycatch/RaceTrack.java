package exceptions.trycatch;

public class RaceTrack {
    public static void main(String[] args) {
        Car myCar = new Car();
        double distance = Math.random() * 2000;

        try {
            myCar.drive(distance);
        } catch (NotEnoughFuelException e) {
            System.out.println("Not enough fuel for " + distance + " km.");
        } finally {
            System.out.println("Remaining fuel: " + myCar.getFuelLeft());
        }
    }
}
