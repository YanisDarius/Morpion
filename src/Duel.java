/**
 * Represents a Duel between two players in the Tic-Tac-Toe (Morpion) game.
 */
public class Duel {
    private Joueur joueur1;
    private Joueur joueur2;
    private int nombreduel;
    private Joueur joueuractuel;

    /**
     * Initializes a new instance of the Duel class.
     *
     * @param joueur1 The first player.
     * @param joueur2 The second player.
     */
    public Duel(Joueur joueur1, Joueur joueur2) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.nombreduel = 0;
        this.joueuractuel = joueur1;
        joueur1.setValeur(1);
        joueur2.setValeur(2);
    }

    /**
     * Increments the number of duels.
     */
    public void nouveauDuel() {
        nombreduel++;
    }

    /**
     * Gets the number of duels played.
     *
     * @return The number of duels.
     */
    public int getNombreduel() {
        return nombreduel;
    }

    /**
     * Gets the first player.
     *
     * @return The first player.
     */
    public Joueur getJoueur1() {
        return joueur1;
    }

    /**
     * Gets the second player.
     *
     * @return The second player.
     */
    public Joueur getJoueur2() {
        return joueur2;
    }

    /**
     * Switches to the next turn, changing the current player.
     */
    public void tourSuivant() {
        if (joueuractuel == joueur1) {
            joueuractuel = joueur2;
        } else {
            joueuractuel = joueur1;
        }
    }

    /**
     * Gets the current player.
     *
     * @return The current player.
     */
    public Joueur getJoueuractuel() {
        return joueuractuel;
    }

    /**
     * Records a victory for the first player and a defeat for the second player.
     */
    public void victoireJoueur1() {
        joueur1.setNombreVictoire(joueur1.getNombreVictoire() + 1);
        joueur2.setNombreDefaite(joueur2.getNombreDefaite() + 1);
    }

    /**
     * Records a victory for the second player and a defeat for the first player.
     */
    public void victoireJoueur2() {
        joueur2.setNombreVictoire(joueur2.getNombreVictoire() + 1);
        joueur1.setNombreDefaite(joueur1.getNombreDefaite() + 1);
    }
}
