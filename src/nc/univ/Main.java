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
        System.out.println(auto.analyseMot("aaabbbbb"));


        //BONUS
        //automate
        Automate autoB = new Automate();
        //Etats
        Etat e1B = new Etat();
        Etat e2B = new Etat();
        Etat e3B = new Etat();
        Etat e4B = new Etat();
        EtatFinal e5B = new EtatFinal();
        //Ajout
        autoB.creerEtat(e1B);
        autoB.creerEtat(e2B);
        autoB.creerEtat(e3B);
        autoB.creerEtat(e4B);
        autoB.creerEtat(e5B);
        //Transitions
        autoB.creerTransition(e1B,e1B,'a');
        autoB.creerTransition(e1B,e1B,'b');

        autoB.creerTransition(e1B,e2B,'b');
        autoB.creerTransition(e2B,e3B,'a');

        autoB.creerTransition(e3B,e3B,'b');
        autoB.creerTransition(e3B,e3B,'a');

        autoB.creerTransition(e3B,e4B,'b');
        autoB.creerTransition(e4B,e5B,'a');

        autoB.creerTransition(e5B,e5B,'a');
        autoB.creerTransition(e5B,e5B,'b');

        //debut
        autoB.setEtatInitial(e1B);
        System.out.println(autoB.analyseMot("aaaaababbbbbbbbabbbbbb"));
    }

}
