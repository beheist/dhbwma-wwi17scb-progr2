package exceptions.basics;

public class TestException {
    public static void main(String[] args) {
        doThing();
    }

    private static void doThing() {
        throw new RuntimeException("You screwed up!");
    }
}


