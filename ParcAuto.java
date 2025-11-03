import java.util.ArrayList;

public class ParcAuto {
    private ArrayList<Vehicule> vehicules;
    private ArrayList<Location> locations;

    public ParcAuto() {
        vehicules = new ArrayList<>();
        locations = new ArrayList<>();
    }

    public void ajouterVehicule(Vehicule v) {
        vehicules.add(v);
    }

    public void listerVehicules() {
        System.out.println("Liste de tous les véhicules du parc auto:");
        for (Vehicule v : vehicules) {
            v.afficherInfos();
        }
    }

    public void listerDisponibles() {
        System.out.println("Véhicules disponibles dans le parc auto:");
        for (Vehicule v : vehicules) {
            if (v.estDisponible()) {
                v.afficherInfos();
            }
        }
    }

    public void rechercher(String modele) {
        System.out.println("Recherche de véhicules pour le modèle: " + modele);
        for (Vehicule v : vehicules) {
            if (v.getModele().equalsIgnoreCase(modele)) {
                v.afficherInfos();
            }
        }
    }

    public boolean isVehiculeDisponible(Vehicule v) {
        return v.estDisponible();
    }

    public void ajouterLocation(Location location) {
        locations.add(location);
        location.getVehicule().setDisponible(false);
    }

    public void listerLocations() {
        System.out.println("Liste des locations en cours:");
        for (Location loc : locations) {
            loc.afficherDetails();
        }
    }
}