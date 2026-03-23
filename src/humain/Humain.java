package humain;

public class Humain {
    private String nom;
    private String prenom;
    private int poids;

    public Humain(String nom, String prenom, int poids) {
        this.nom = nom;
        this.prenom = prenom;
        this.poids = poids;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

}
