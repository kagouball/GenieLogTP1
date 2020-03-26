package nc.univ;

public class EtatFinal extends Etat{

    public boolean traiterMot(String mot){
        if(mot.length()>1){
            return false;
        }else{
            return true;
        }
    }
}
