package partie1;

import java.util.ArrayList;

public class Client {
    String nom;
    int age;
    ArrayList<Article> panier;

    public Client() {
    }

    public Client(String nom, int age, ArrayList<Article> panier) {
        this.nom = nom;
        this.age = age;
        this.panier = panier;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Article> getPanier() {
        return panier;
    }

    public void setPanier(ArrayList<Article> panier) {
        this.panier = panier;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                ", panier=" + panier +
                '}';
    }
}
