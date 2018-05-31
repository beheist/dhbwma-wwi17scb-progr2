package exceptions.trycatch;

public class RaceTrack2 {
    public static void main(String[] args) {
        System.out.println(funny());
    }

    private static int funny() {
        try {
            return 1;
        }
        finally {
            return 2;
        }
    }
}
