abstract class Vehicule {
    private String marque;
    private String modele;
    private int annee;
    private boolean disponible;

    public Vehicule(String marque, String modele, int annee) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.disponible = true;  // Le véhicule est disponible par défaut
    }
    public String getMarque() {
        return marque;
    }
    public String getModele() {
        return modele;
    }
    public int getAnnee() {
        return annee;
    }
    public void louer() {
        this.disponible = false;
        System.out.println("Le véhicule " + marque + " " + modele + " de l'année " + annee + " a été loué.");
    }
    
    public void rendre() {
        this.disponible = true;
        System.out.println("Le véhicule " + marque + " " + modele + " de l'année " + annee + " a été rendu.");
    }
    
    public boolean estDisponible() {
        return this.disponible;
    }
    
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    abstract void afficherInfos();

   

}

