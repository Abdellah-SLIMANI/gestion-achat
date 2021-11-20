package partie1;

public class Article {
    //Attributs
    String nom;
    String marque;
    float prix;
    int tva;

//    Constructeurs
    public Article() {
    }
    public Article(String nom, String marque, float prix, int tva) {
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.tva = tva;
    }
// Getters
    public String getNom() {
        return nom;
    }

    public String getMarque() {
        return marque;
    }

    public float getPrix() {
        return prix;
    }

    public int getTva() {
        return tva;
    }

//    Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setTva(int tva) {
        this.tva = tva;
    }

//    toString() methode
    @Override
    public String toString() {
        return "Article{" +
                "nom='" + nom + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", tva=" + tva +
                '}';
    }
}
