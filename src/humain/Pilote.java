package humain;

import materiel.*;

public class Pilote extends Humain {
    private String club;
    private Parapente[] parapentes;
    private Sellette[] sellettes;
    private Parachute[] parachutes;

    public Pilote(String nom, String prenom, int poids, String club) {
        super(nom, prenom, poids);
        this.club = club;
        this.parapentes = new Parapente[15];
        this.sellettes = new Sellette[15];
        this.parachutes = new Parachute[5];
    }

    public String getClub() {
        return club;
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
