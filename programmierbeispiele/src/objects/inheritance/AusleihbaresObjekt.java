package objects.inheritance;

import java.util.Date;

public class AusleihbaresObjekt {
    private String titel;
    private boolean verliehen;
    private Date verliehenVon;
    private Date verliehenBis;

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public boolean isVerliehen() {
        return verliehen;
    }

    public void setVerliehen(boolean verliehen) {
        this.verliehen = verliehen;
    }

    public Date getVerliehenVon() {
        return verliehenVon;
    }

    public void setVerliehenVon(Date verliehenVon) {
        this.verliehenVon = verliehenVon;
    }

    public Date getVerliehenBis() {
        return verliehenBis;
    }

    public void setVerliehenBis(Date verliehenBis) {
        this.verliehenBis = verliehenBis;
    }
}
