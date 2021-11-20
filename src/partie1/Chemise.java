package partie1;

public class Chemise extends Electromenager{
    boolean manche;

    public Chemise() {
    }

    public Chemise(int puissance, int garantie, boolean manche) {
        super(puissance, garantie);
        this.manche = manche;
    }

    public boolean isManche() {
        return manche;
    }

    public void setManche(boolean manche) {
        this.manche = manche;
    }

    @Override
    public String toString() {
        return "Chemise{" +
                "nom='" + nom + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", tva=" + tva +
                ", manche=" + manche +
                ", puissance=" + puissance +
                ", garantie=" + garantie +
                '}';
    }
}
