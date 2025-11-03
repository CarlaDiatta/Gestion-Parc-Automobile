import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Date {
    private int jour;
    private int mois;
    private int annee;

    public Date(int jour, int mois, int annee) {
        LocalDate.of(annee, mois, jour);
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    public int getJour() {
        return jour;
    }

    public int getMois() {
        return mois;
    }

    public int getAnnee() {
        return annee;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", jour, mois, annee);
    }

    public int difference(Date autre) {
        LocalDate d1 = LocalDate.of(this.annee, this.mois, this.jour);
        LocalDate d2 = LocalDate.of(autre.annee, autre.mois, autre.jour);
        return (int)Math.abs(ChronoUnit.DAYS.between(d1, d2));
    }
}
