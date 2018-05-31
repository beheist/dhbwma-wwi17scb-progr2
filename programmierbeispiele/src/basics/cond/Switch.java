package basics.cond;

public class Switch {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        int diff = a - b;

        switch (diff) {
            case 2:
                System.out.println("A is larger than B");
                break;
            case -2:
                System.out.println("This will never happen");
                break;
            default:
                System.out.println("Something went REALLY wrong.");
        }
    }
}
