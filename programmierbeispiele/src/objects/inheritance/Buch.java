package objects.inheritance;

public class Buch extends AusleihbaresObjekt {
    private String isbn;

    public String getISBN(){
        return isbn;
    }

    public void setISBN(String isbn){
        this.isbn = isbn;
    }
}
