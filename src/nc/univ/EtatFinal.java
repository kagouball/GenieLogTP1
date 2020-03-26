package nc.univ;

public class EtatFinal extends Etat{

    @Override
    public boolean traitermot(String mot){
        System.out.println("j'arrive à la fin");
        System.out.println("Je traite:"+mot);

        if(mot.length()==0){
            return true;
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
