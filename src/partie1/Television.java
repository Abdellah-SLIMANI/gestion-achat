package partie1;

public class Television extends Electromenager{
    int taille;

    public Television() {
    }

    public Television(int puissance, int garantie, int taille) {
        super(puissance, garantie);
        this.taille = taille;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    @Override
    public String toString() {
        return "Television{" +
                "nom='" + nom + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", tva=" + tva +
                ", puissance=" + puissance +
                ", garantie=" + garantie +
                ", taille=" + taille +
                '}';
    }
}
