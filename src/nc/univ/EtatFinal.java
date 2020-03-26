package nc.univ;

public class EtatFinal extends Etat{

    public boolean traiterMot(String mot){
        System.out.println("j'arrive à la fin");
        if(mot.length()>1){
            return false;
        }else{
            return true;
        }
    }
}
