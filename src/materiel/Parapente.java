package materiel;

public class Parapente extends Materiel {
    private String nom;
    private String[] dateRevision;
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

    public void resetTempsVolDerniereRevision(){
        this.tempsVolDerniereRevision=0;
    }

    public void initDateRevision(String[] tab){
        this.dateRevision = tab;
    }

    public int ajoutDateRevision(String date){
        int n =this.dateRevision.length;
        if(n<50){
            this.dateRevision[n] = date;
            this.tempsVolDerniereRevision = 0;
            return 0;
        }else{
            return 1;
        }
    }

    public int getTempsVolTotal() {
        return tempsVolTotal;
    }

    public void addTempsVol(int tempsVol) {
        this.tempsVolTotal += tempsVol;
        this.tempsVolDerniereRevision += tempsVol;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

}
