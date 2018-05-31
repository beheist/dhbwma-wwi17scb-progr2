package basics.loops;

public class Break {
    public static void main(String[] args) {
        int a = 0;

        while (true) {
            a++;
            if (a >= 10) {
                break;
            }
            System.out.println(a);
        }
    }
}
