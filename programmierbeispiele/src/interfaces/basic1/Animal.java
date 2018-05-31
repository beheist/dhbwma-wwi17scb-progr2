package interfaces.basic1;

interface Animal {

    // Implizit: public static final int CONSTANT = 42;
    int SPEED = 42;

    // Implizit: public void eat();
    void eat(String food);

    // Implizit: public void travel();
    void travel();
}
