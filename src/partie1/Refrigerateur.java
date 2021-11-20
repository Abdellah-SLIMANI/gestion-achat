package partie1;

public class Refrigerateur extends Electromenager{
    int volume;

    public Refrigerateur() {
    }

    public Refrigerateur(int puissance, int garantie, int volume) {
        super(puissance, garantie);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Refrigerateur{" +
                "nom='" + nom + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", tva=" + tva +
                ", puissance=" + puissance +
                ", garantie=" + garantie +
                ", volume=" + volume +
                '}';
    }
}
