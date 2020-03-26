package nc.univ;

import java.util.ArrayList;

public class Automate {
    private Etat etatInitial;
    private ArrayList<Etat> listEtats = new ArrayList<Etat>();

    public void setEtatInitial(Etat e){
        this.etatInitial = e;
    }

    public void creerEtat(Etat e){
        listEtats.add(e);
    }

    public void creerTransition(Etat depart, Etat arrive, char s){
        Transition newTransition = new Transition(arrive,s);
        depart.addTransition(newTransition);
    }

    public boolean analyseMot(String mot){
        return etatInitial.traitermot(mot);
    }

}
