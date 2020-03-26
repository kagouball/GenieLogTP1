package nc.univ;

public class Transition {
    private Etat arrivee;
    private char symbole;

    public Transition(Etat arrivee, char symbole){
        this.arrivee = arrivee;
        this.symbole = symbole;
    }

    public Etat getArrivee() {
        return arrivee;
    }

    public char getSymbole() {
        System.out.println("Je check le:"+this.symbole);
        return symbole;
    }
}
