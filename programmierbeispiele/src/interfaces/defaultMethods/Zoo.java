package interfaces.defaultMethods;

public class Zoo {
    public static void main(String[] args) {
        Animal mySnake = new Snake();
        mySnake.eat("frog");
        mySnake.travel();
    }
}

