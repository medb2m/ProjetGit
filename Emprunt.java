
public class Emprunt {
    private Livre livre;
    private User user;
    private String dateEmprunt;

    // Constructeur
    public Emprunt(Livre livre, User user, String dateEmprunt) {
        this.livre = livre;
        this.user = user;
        this.dateEmprunt = dateEmprunt;
                this.date2Emprunt = date3Emprunt;
        this.date1Emprunt = date3Emprunt;

    }

    // Getters et Setters
    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(String dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }
}
