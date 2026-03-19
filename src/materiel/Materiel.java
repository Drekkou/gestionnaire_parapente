package materiel;

public class Materiel {
    private String marque;
    private String modele;
    private String dateAchat;

    public Materiel(String marque, String modele, String dateAchat) {
        this.marque = marque;
        this.modele = modele;
        this.dateAchat = dateAchat;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(String dateAchat) {
        this.dateAchat = dateAchat;
    }

}
