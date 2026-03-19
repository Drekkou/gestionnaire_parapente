package lieu;

public class Club {
    private String nom;
    private Lieu village;
    private Atterrissage[] atterrissages;
    private Decollage[] decollages;
    public Club(String nom, Lieu village) {
        this.nom = nom;
        this.village = village;
        this.atterrissages = new Atterrissage[3];
        this.decollages = new Decollage[10];
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Lieu getVillage() {
        return village;
    }
    public void setVillage(Lieu village) {
        this.village = village;
    }
    public Atterrissage[] getAtterrissages() {
        return atterrissages;
    }
    public void setAtterrissages(Atterrissage[] atterrissages) {
        this.atterrissages = atterrissages;
    }
    public Decollage[] getDecollages() {
        return decollages;
    }
    public void setDecollages(Decollage[] decollages) {
        this.decollages = decollages;
    }

    
}
