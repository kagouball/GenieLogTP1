package nc.univ;

public class EtatFinal extends Etat{

    @Override
    public boolean traitermot(String mot){

        System.out.println("j'arrive à la fin");
        if(mot.length()>1){
            return false;
        }else{
            return true;
        }
    }
}
