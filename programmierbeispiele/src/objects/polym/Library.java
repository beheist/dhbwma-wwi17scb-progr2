package objects.polym;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Library {
    public static void main(String[] args) {
        Buch buch1 = new Buch("Java für Anfänger");
        DVD dvd1 = new DVD("Die Hard 3");

        AusleihbaresObjekt[] ausleihe = new AusleihbaresObjekt[2];
        ausleihe[0] = buch1;
        ausleihe[1] = dvd1;
        for (int i = 0; i < ausleihe.length; i++) {
            ausleihe[i].verleihen(asDate("30.06.2018"));
        }
    }

    protected static Date asDate(String dateString) {
        SimpleDateFormat fmt = new SimpleDateFormat("dd.MM.yyyy");
        try {
            return fmt.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Parse error!");
            return null;
        }
    }
}

