package interfaces.basic2;

public class Logger {

    static void log(Describable thing) {
        System.out.println("I logged a " + thing.getDescription());
    }

    public static void main(String[] args) {
        Something myThing = new Something();
        log(myThing);
    }
}
