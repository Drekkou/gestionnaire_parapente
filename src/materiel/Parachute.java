package materiel;

public class Parachute extends Materiel {
    private int ptav;
    private String dateDernierRepliage;
    private String nom;

    public Parachute(String marque, String modele, String dateAchat, int ptav, String dateDernierRepliage, String nom) {
        super(marque, modele, dateAchat);
        this.ptav = ptav;
        this.dateDernierRepliage = dateDernierRepliage;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return nom;
    }

    public int getPtav() {
        return ptav;
    }

    public void setPtav(int ptav) {
        this.ptav = ptav;
    }

    public String getDateDernierRepliage() {
        return dateDernierRepliage;
    }

    public void setDateDernierRepliage(String dateDernierRepliage) {
        this.dateDernierRepliage = dateDernierRepliage;
    }

}
