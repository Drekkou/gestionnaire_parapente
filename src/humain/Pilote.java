package humain;

import materiel.*;
import lieu.*;

public class Pilote extends Humain {
    private Club club;
    private Parapente[] parapentes;
    private Sellette[] sellettes;
    private Parachute[] parachutes;

    public Pilote(String nom, String prenom, String poids, Club club) {
        super(nom, prenom, poids);
        this.club = club;
        this.parapentes = new Parapente[15];
        this.sellettes = new Sellette[15];
        this.parachutes = new Parachute[5];
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

    public Sellette[] getSellettes() {
        return sellettes;
    }

    public Parachute[] getParachutes() {
        return parachutes;
    }

    public void addParapente(Parapente parapente) {
        this.parapentes[this.parapentes.length] = parapente;
    }

    public void addParapente(Parachute parachute) {
        this.parachutes[this.parachutes.length] = parachute;
    }

    public void addParapente(Sellette sellette) {
        this.sellettes[this.sellettes.length] = sellette;
    }
}
