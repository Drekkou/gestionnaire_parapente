package lieu;

public class Atterrissage{
    private String nom;
    private int altitude;
    private Lieu lieu;
    public Atterrissage(String nom, int altitude, Lieu lieu) {
        this.nom = nom;
        this.altitude = altitude;
        this.lieu = lieu;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getAltitude() {
        return altitude;
    }
    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
    public Lieu getLieu() {
        return lieu;
    }
    public void setLieu(Lieu lieu) {
        this.lieu = lieu;
    }

    
}
