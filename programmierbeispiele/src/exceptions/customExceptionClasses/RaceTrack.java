package exceptions.customExceptionClasses;

public class RaceTrack {
    public static void main(String[] args) throws Exception {
        Car myCar = new Car();
        myCar.drive(900);
        myCar.drive(120);
    }
}
