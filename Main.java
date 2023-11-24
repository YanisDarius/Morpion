public class Main {
    public static void main(String[] args) {
        Ecran ecran = new Ecran();
        ChoisirNomJoueur choisirnom = new ChoisirNomJoueur(ecran);
        ecran.ajouterEcran(choisirnom, "choisirnom");
        ecran.revelationEcran();
    }
}
