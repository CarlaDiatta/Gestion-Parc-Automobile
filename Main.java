public class Main {
    public static void main(String[] args) {
        
        Voiture v1 = new Voiture("Toyota", "Corolla", 2020, 4);
        Camion c1 = new Camion("Volvo", "FH16", 2018, 25.0f);
        v1.afficherInfos();
        c1.afficherInfos();

        
        Client client1 = new Client("Carla Diatta", "C12345");
        client1.afficherInfos();

       
        ParcAuto parc = new ParcAuto();
        parc.ajouterVehicule(v1);
        parc.ajouterVehicule(c1);

        
        if (parc.isVehiculeDisponible(v1)) {
            Date dateDebut = new Date(1, 5, 2024);
            Date dateFin = new Date(10, 5, 2024);
            Location location1 = new Location(client1, v1, dateDebut, dateFin);
            parc.ajouterLocation(location1);
            location1.afficherDetails();
                        
            System.out.println("Prix de la location : " + location1.calculerPrix() + " €");
        }

        
        System.out.println("\nListe des véhicules :");
        parc.listerVehicules();
        
        System.out.println("\nRecherche de la Toyota Corolla :");
        parc.rechercher("Corolla");
        
        System.out.println("\nVéhicules disponibles :");
        parc.listerDisponibles();
        
        System.out.println("\nLocations en cours :");
        parc.listerLocations();
    }
}