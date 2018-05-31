package objects.kapselung;

public class Auto {
    // Leistung: intern in kW
    private int leistung = 162;

    // Umrechnungsfaktor
    private static final double KW_IN_PS = 1.35962;

    public int getLeistungInPS() {
        return Double.valueOf(leistung * KW_IN_PS).intValue();
    }
}
