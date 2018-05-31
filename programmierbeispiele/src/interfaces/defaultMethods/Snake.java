package interfaces.defaultMethods;

public class Snake implements Animal {
    @Override
    public void travel() {
        System.out.println("The snake slithers at " + this.SPEED + " km/h.");
    }
}
