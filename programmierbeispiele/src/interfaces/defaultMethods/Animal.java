package interfaces.defaultMethods;

interface Animal {

    // Implizit: public static final int CONSTANT = 42;
    int SPEED = 42;

    // Implizit: public void eat();
    default void eat(String food) {
        System.out.println("This " + this.getClass().getSimpleName() + " eats a " + food);
    }

    // Implizit: public void travel();
    void travel();
}
