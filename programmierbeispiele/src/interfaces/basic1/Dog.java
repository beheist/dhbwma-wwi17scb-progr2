package interfaces.basic1;

public class Dog implements Animal {
    /**
     * Die Override-Annotation:
     * 1. Compiler prüft, ob Methode wirklich überschrieben wird
     * 2. Lesbarkeit / Verständlichkeit des Codes wird erhöht
     **/
    @Override
    public void eat(String food) {
        System.out.println("The dog eats a " + food);
    }

//    @Override
//    public void eat2() {
//
//    }

    @Override
    public void travel() {
        System.out.println("The dog runs at " + this.SPEED + " km/h.");
    }
}
