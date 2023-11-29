
public class Main {
    public static void main(String[] args) {
        Ecran ecran = new Ecran();
        Menu menu = new Menu(ecran);
        ChoisirNomJoueur choisirnom = new ChoisirNomJoueur(ecran);
        Fin fin = new Fin(ecran);
        ecran.ajouterEcran(menu, "menu");
        ecran.ajouterEcran(choisirnom, "choisirnomjoueur");
        ecran.ajouterEcran(fin, "fin");
        ecran.revelationEcran();
    }
}
