package nc.univ;

public class Main {
    public static void main(String[] args){
        //automate
        Automate auto = new Automate();

        //Etats
        Etat e1 = new Etat();
        Etat e2 = new Etat();
        Etat e3 = new Etat();
        EtatFinal e4 = new EtatFinal();

        //Ajout
        auto.creerEtat(e1);
        auto.creerEtat(e2);
        auto.creerEtat(e3);
        auto.creerEtat(e4);

        //Transitions
        auto.creerTransition(e1,e2,'a');
        auto.creerTransition(e2,e2,'a');
        auto.creerTransition(e2,e3,'b');
        auto.creerTransition(e3,e3,'b');
        auto.creerTransition(e3,e4,'b');

        //debut
        auto.setEtatInitial(e1);
        System.out.println(auto.analyseMot("aba"));
    }

}
