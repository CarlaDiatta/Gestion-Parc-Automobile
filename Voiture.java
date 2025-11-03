public class Voiture extends Vehicule {
    private int nbPortes;

    public Voiture(String marque, String modele, int annee, int nbPortes) {
        super(marque, modele, annee);
        this.nbPortes = nbPortes;
    }

    public int getNbPortes() {
        return nbPortes;
    }

    @Override
    public void afficherInfos() {
        System.out.println("Voiture: " + getMarque() + " " + getModele() + ", Année: " + getAnnee() + ", Nombre de portes: " + nbPortes);
    }

}