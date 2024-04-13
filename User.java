
// Classe User
public class User {
    private String nom;
    private int id;

    // Constructeur
    public User(String nom, int id , int ageee , String profilePic) {
        this.nom = nom;
        this.id = id;
        this.ageee = ageee ;
        this.profilePic= profilePic;
    }

    // Getters et Setters
    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }
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
        public int getAgeee() {
        return ageee;
    }

    public void setAgeee(int ageee) {
        this.ageee = ageee;
    }
}