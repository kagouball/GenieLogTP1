package nc.univ;

import java.util.ArrayList;

public class Etat {
    protected ArrayList<Transition> transitions = new ArrayList<Transition>();

    public void addTransition(Transition t){
        transitions.add(t);
    }

    public boolean traitermot(String mot){
        System.out.println("Je traite:"+mot);

        if(mot.length()==0){
            return false;
        }

        boolean trouve = false;
        int i = 0;
        while(!trouve && i<transitions.size()){
            Transition t = transitions.get(i);
            char s = t.getSymbole();
            if(s == mot.charAt(0)){
                trouve = t.getArrivee().traitermot(mot.substring(1));
            }
            i++;
        }
        return trouve;
    }
}
