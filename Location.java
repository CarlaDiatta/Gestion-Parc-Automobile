public class Location {
    private Client client;
    private Vehicule vehicule;
    private Date dateDebut;
    private Date dateFin;
    private static final float PRIX_JOURNALIER_DEFAULT = 50.0f;  

    public Location(Client client, Vehicule vehicule, Date dateDebut, Date dateFin) {
        this.client = client;
        this.vehicule = vehicule;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    
        vehicule.louer();
    }

    public Client getClient() {
        return client;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public int getDuree() {
        return dateDebut.difference(dateFin) + 1; 
    }

    public float calculerPrix() {
        return getDuree() * PRIX_JOURNALIER_DEFAULT;
    }

    public void afficherDetails() {
        System.out.println("Détails de la location :");
        System.out.println("Client: " + client.getNom() + " (ID: " + client.getId() + ")");
        System.out.println("Véhicule: " + vehicule.getMarque() + " " + vehicule.getModele());
        System.out.println("Date de début: " + dateDebut);
        System.out.println("Date de fin: " + dateFin);
        System.out.println("Durée: " + getDuree() + " jours");
        System.out.println("Prix total: " + calculerPrix() + " €");
    }
}
