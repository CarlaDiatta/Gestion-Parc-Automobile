public class Camion extends Vehicule {
    private float capacite;

    public Camion(String marque, String modele, int annee, float capacite) {
        super(marque, modele, annee);
        this.capacite = capacite;
    }

    public float getCapacite() {
        return capacite;
    }

    @Override
    public void afficherInfos() {
        System.out.println("Camion: " + getMarque() + " " + getModele() + ", Année: " + getAnnee() + ", Capacité de charge: " + capacite + " tonnes");
    }
}