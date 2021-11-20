package partie1;

import java.awt.*;

public class Vestimentaire extends Article{
//    Attributs
    int taille;
    Color couleur;
    Categorie cible;

//    Constructeurs
    public Vestimentaire() {
    }

    public Vestimentaire(int taille, Color couleur, Categorie cible) {
        this.taille = taille;
        this.couleur = couleur;
        this.cible = cible;
    }

//    Getters and setters
    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public Categorie getCible() {
        return cible;
    }

    public void setCible(Categorie cible) {
        this.cible = cible;
    }

    @Override
    public String toString() {
        return "Vestimentaire{" +
                "taille=" + taille +
                ", couleur=" + couleur +
                ", cible=" + cible +
                '}';
    }
}
