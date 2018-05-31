package objects.various;

public class Buch {
    private String isbn;
    private String titel;

    public Buch(String s) {
        titel = s;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }
}
