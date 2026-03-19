package lieu;

public class Lieu {
    private String nom;
    private int codePostale;

    public Lieu(String nom, int codePostale) {
        this.nom = nom;
        this.codePostale = codePostale;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCodePostale() {
        return codePostale;
    }

    public void setCodePostale(int codePostale) {
        this.codePostale = codePostale;
    }

    
}
