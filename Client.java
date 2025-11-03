public class Client {
    private String nom;
    private String id;

    public Client(String nom, String id) {
        this.nom = nom;
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public String getId() {
        return id;
    }
    public void afficherInfos() {
        System.out.println("Client: " + nom + ", ID: " + id);
    }
}