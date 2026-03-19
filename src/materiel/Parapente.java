package materiel;

public class Parapente extends Materiel {
    private String nom;
    private String[] daterevision;
    private int tempsVolDerniereRevision;
    private int tempsVolTotal;
    private String classe;

    public Parapente(String marque, String modele, String dateAchat, String nom, int tempsVolDerniereRevision,
            int tempsVolTotal, String classe) {
        super(marque, modele, dateAchat);
        this.nom = nom;
        this.tempsVolDerniereRevision = tempsVolDerniereRevision;
        this.tempsVolTotal = tempsVolTotal;
        this.classe = classe;
        this.daterevision = new String[50];
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTempsVolDerniereRevision() {
        return tempsVolDerniereRevision;
    }

    public void setTempsVolDerniereRevision(int tempsVolDerniereRevision) {
        this.tempsVolDerniereRevision = tempsVolDerniereRevision;
    }

    public int getTempsVolTotal() {
        return tempsVolTotal;
    }

    public void setTempsVolTotal(int tempsVolTotal) {
        this.tempsVolTotal = tempsVolTotal;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

}
