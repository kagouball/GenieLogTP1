package nc.univ;

import java.util.ArrayList;

public class Etat {
    private ArrayList<Transition> transitions = new ArrayList<Transition>();

    public Etat(){

    }

    public void addTransition(Transition t){
        transitions.add(t);
    }

    public boolean traiterMot(String mot){
        boolean trouve = false;
        int i = 0;
        while(!trouve && i<transitions.size()){
            Transition t = transitions.get(i);
            char s = t.getSymbole();
            if(s == mot.charAt(0)){
                trouve = t.getArrivee().traiterMot(mot.substring(1));
            }
            i++;
        }
        return trouve;
    }
}
