package humain;

public class Humain {
    private String nom;
    private String prenom;
    private String poids;

    public Humain(String nom, String prenom, String poids) {
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

    public String getPoids() {
        return poids;
    }

    public void setPoids(String poids) {
        this.poids = poids;
    }

}
