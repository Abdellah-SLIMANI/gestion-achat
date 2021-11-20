package partie1;

public class Pantalon extends Electromenager{
    double longueur;

    public Pantalon() {
    }

    public Pantalon(int puissance, int garantie, int longueur) {
        super(puissance, garantie);
        this.longueur = longueur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    @Override
    public String toString() {
        return "Pantalon{" +
                "nom='" + nom + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", tva=" + tva +
                ", puissance=" + puissance +
                ", garantie=" + garantie +
                ", longueur=" + longueur +
                '}';
    }
}
