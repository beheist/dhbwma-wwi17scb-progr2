package basics.cond;

public class If {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        if (a > b) {
            System.out.println("A is larger than B");
        } else if (a < b) {
            System.out.println("B is larger than A");
        } else {
            System.out.println("A and B are equal!");
        }
    }
}
