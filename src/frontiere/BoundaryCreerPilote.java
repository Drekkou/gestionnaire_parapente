package frontiere;

import controleur.ControlCreerPilote;

public class BoundaryCreerPilote {
    private ControlCreerPilote controlCreerPilote;

    public BoundaryCreerPilote(ControlCreerPilote controlCreerPilote) {
        this.controlCreerPilote = controlCreerPilote;
    }

    public void CreerPilote(){
        String nom;
        String prenom; 
        int poids; 
        String club;
        nom = Clavier.entrerChaine("Quel est votre nom ?");
        prenom = Clavier.entrerChaine("Quel est voter prénom ?");
        poids = Clavier.entrerEntier("Quel est voter poids ?");
        club = Clavier.entrerChaine("Quel est voter club?");
        this.controlCreerPilote.creerPilote(nom, prenom, poids, club);
    }
}
