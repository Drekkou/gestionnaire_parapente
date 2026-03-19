package materiel;

public class Sellette extends Materiel {
    private String nom;
    private int nombreHeurevol;

    public Sellette(String marque, String modele, String dateAchat, String nom, int nombreHeurevol) {
        super(marque, modele, dateAchat);
        this.nom = nom;
        this.nombreHeurevol = nombreHeurevol;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNombreHeurevol() {
        return nombreHeurevol;
    }

    public void setNombreHeurevol(int nombreHeurevol) {
        this.nombreHeurevol = nombreHeurevol;
    }

}
