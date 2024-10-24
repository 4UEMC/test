import java.util.Random;

public class Ampoile implements Eclairage {
    private String nom;
    private int etat;
    private double ProbaP;

    public Ampoile(String nom,  double probaP) {
        this.nom = nom;
        this.etat = 0;
        ProbaP = probaP;
    }

    public String getNom() {
        return nom;
    }

    private int probaPanne(){
        Random aleat = new Random();
        if(aleat.nextInt(1000)<ProbaP)
            return -1;
        return 1;
    }

    /**
     * Allume l'ampoule Ã  pleine puissance
     */
    @Override
    public void allumer() {
        this.etat=etat*probaPanne();
        if(this.etat!=10 && this.etat>=0)
            this.etat=10;
    }

    /**
     * Eteint l'ampoule
     */
    @Override
    public void eteindre() {
        this.etat=etat*probaPanne();
        if(this.etat>=0)
            this.etat=0;
    }

    /**
     * Augmente l'intensitÃ© lumineuse de l'ampoule
     */
    @Override
    public void intensifier() {
        if(getNom()!="tube"){
            this.etat*=probaPanne();
            if(this.etat<10 && this.etat>=0)
                this.etat++;
        }
        else
            allumer();
    }

    /**
     * diminue l'intensitÃ© lumineuse de l'ampoule
     */
    @Override
    public void diminuer() {
        if(getNom()!="tube"){
            this.etat=etat*probaPanne();
            if(this.etat>0)
                this.etat--;
        }
        else
            eteindre();
    }

    /**
     * Permet de connaÃ®tre l'Ãtat de l'ampoule
     * @return l'Ã©tat de la lampe 0..10 ou -1 si en panne
     */
    @Override
    public int etat() {
        return this.etat;
    }

    /**
     * @return l'Ã©tat de l'objet sous la forme d'une chaÃ®ne de caractÃ¨res
     */
    @Override
    public String toString() {
        return "AmpouleLED{" +
                "etat=" + this.etat +
                '}';
    }


}
