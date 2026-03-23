package controleur;

import humain.*;

public class ControlCreerPilote {
    private Pilote pilote;

    public void creerPilote(String nom, String prenom, int poids, String club){
        pilote = new Pilote(nom,prenom,poids,club);
    }

}
