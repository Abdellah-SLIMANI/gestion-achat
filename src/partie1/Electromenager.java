package partie1;

public class Electromenager extends Article{
    int puissance;
    int garantie;

    public Electromenager() {
    }

    public Electromenager(int puissance, int garantie) {
        this.puissance = puissance;
        this.garantie = garantie;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public int getGarantie() {
        return garantie;
    }

    public void setGarantie(int garantie) {
        this.garantie = garantie;
    }

    @Override
    public String toString() {
        return "Electromenager{" +
                "puissance=" + puissance +
                ", garantie=" + garantie +
                '}';
    }
}
