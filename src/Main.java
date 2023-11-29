import Ecran.ChoisirNomJoueur;
import Ecran.Fin;
import Fenetre.Ecran;

public class Main {
    public static void main(String[] args) {
        Ecran ecran = new Ecran();
        ChoisirNomJoueur choisirnom = new ChoisirNomJoueur(ecran);
        Fin fin = new Fin(ecran);
        
        ecran.ajouterEcran(choisirnom, "choisirnom");
        ecran.ajouterEcran(fin, "fin");
        ecran.revelationEcran();
    }
}
