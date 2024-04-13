import java.util.ArrayList;
import java.util.List;

public class Librairie {
    // Déclaration d'une liste pour stocker les livres du catalogue
    private List<Livre> catalogue;

    // Constructeur de la classe Librairie
    public Librairie() {
        // Initialisation de la liste catalogue en tant qu'ArrayList vide
        this.catalogue = new ArrayList<>();
        bbbbbbb
    }

    // Méthode pour ajouter un livre au catalogue
    public void ajouterLivre(Livre livre) {
        catalogue.add(livre); // Ajoute le livre à la liste catalogue
    }

    // Méthode pour obtenir le catalogue complet de la librairie
    public List<Livre> getCatalogue() {
        return catalogue; // Retourne la liste complète des livres dans le catalogue
    }
}
