package interfaces.basic2;

interface Describable {
    String getDescription();
}

public class Something implements Describable {
    public String getDescription() {
        return "Something!";
    }
}
