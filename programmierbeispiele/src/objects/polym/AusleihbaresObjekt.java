package objects.polym;

import java.util.Date;

public class AusleihbaresObjekt {
    protected Date verliehenBis;
    protected String title;

    public AusleihbaresObjekt(String title) {
        this.title = title;
    }

    public void verleihen(Date verliehenBis) {
        this.verliehenBis = verliehenBis;
        System.out.println(title + " ist jetzt verliehen!");
    }
}
