
// Classe User
public class User {
    private String nom;
    private int id;

    // Constructeur
    public User(String nom, int id) {
        this.nom = nom;
        this.id = id;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}