package nc.univ;

public class Transition {
    private Etat depart;
    private Etat arrivee;
    private char symbole;

    public Transition(Etat depart,Etat arrivee, char symbole){
        this.arrivee = arrivee;
        this.depart = depart;
        this.symbole = symbole;
    }

    public void setArrivee(Etat arrivee) {
        this.arrivee = arrivee;
    }

    public Etat getArrivee() {
        return arrivee;
    }

    public void setDepart(Etat depart) {
        this.depart = depart;
    }

    public Etat getDepart() {
        return depart;
    }

    public void setSymbole(char symbole) {
        this.symbole = symbole;
    }

    public char getSymbole() {
        System.out.println("Je check le:"+this.symbole);
        return symbole;
    }
}
