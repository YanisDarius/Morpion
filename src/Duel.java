
public class Duel {
    private Joueur joueur1;
    private Joueur joueur2;
    private int nombreduel;
    private Joueur joueuractuel;

    public Duel(Joueur joueur1,Joueur joueur2){
        this.joueur1=joueur1;
        this.joueur2=joueur2;
        this.nombreduel=0;
        this.joueuractuel = joueur1;
        joueur1.setvaleur(1);
        joueur2.setvaleur(2);
    }

    public void nouveauDuel() {
        nombreduel++;
    }

    public int getNombreduel() {
        return nombreduel;
    }

    public Joueur getJoueur1() {
        return joueur1;
    }

    public Joueur getJoueur2() {
        return joueur2;
    }

    public void tourSuivant() {
        if (joueuractuel == joueur1 ) {
            joueuractuel = joueur2;
        }else {
            joueuractuel = joueur1;
        }
    }

    public Joueur getJoueuractuel() {
        return joueuractuel;
    }

    public void victoireJoueur1() {
        joueur1.setNombreVictoire(joueur1.getNombreVictoire()+1);
        joueur2.setNombreDefaite(joueur2.getNombreDefaite()+1);

    }

    public void victoireJoueur2() {
        joueur2.setNombreVictoire(joueur2.getNombreVictoire()+1);
        joueur1.setNombreDefaite(joueur1.getNombreDefaite()+1);
        
    }

    
}
