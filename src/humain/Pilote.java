package humain;

import materiel.*;
import lieu.*;


public class Pilote extends Humain{
    private Club club;
    private Parapente[] parapentes;
    private Sellette[] sellettes;
    private Parachute[] parachutes;
    
    public Pilote(String nom, String prenom, String poids, Club club) {
        super(nom, prenom, poids);
        this.club = club;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public Parapente[] getParapentes() {
        return parapentes;
    }

    public void setParapentes(Parapente[] parapentes) {
        this.parapentes = parapentes;
    }

    public Sellette[] getSellettes() {
        return sellettes;
    }

    public void setSellettes(Sellette[] sellettes) {
        this.sellettes = sellettes;
    }

    public Parachute[] getParachutes() {
        return parachutes;
    }

    public void setParachutes(Parachute[] parachutes) {
        this.parachutes = parachutes;
    }

    
}
