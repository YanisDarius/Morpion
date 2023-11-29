/**
 * La classe Joueur représente un joueur dans le jeu du Morpion.
 */
public class Joueur {

    private String nom;            // Nom du joueur
    private int nombreVictoire = 0; // Nombre de victoires du joueur
    private int nombreDefaite = 0;  // Nombre de défaites du joueur
    private int valeur;             // Valeur attribuée au joueur dans le jeu (par exemple, X ou O)

    /**
     * Constructeur de la classe Joueur.
     *
     * @param nom Le nom du joueur.
     */
    public Joueur(String nom) {
        this.nom = nom;
        this.valeur = 0;
    }

    /**
     * Obtient le nombre de défaites du joueur.
     *
     * @return Le nombre de défaites du joueur.
     */
    public int getNombreDefaite() {
        return nombreDefaite;
    }

    /**
     * Obtient le nom du joueur.
     *
     * @return Le nom du joueur.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Obtient le nombre de victoires du joueur.
     *
     * @return Le nombre de victoires du joueur.
     */
    public int getNombreVictoire() {
        return nombreVictoire;
    }

    /**
     * Définit le nombre de défaites du joueur.
     *
     * @param nombreDefaite Le nombre de défaites à définir.
     */
    public void setNombreDefaite(int nombreDefaite) {
        this.nombreDefaite = nombreDefaite;
    }

    /**
     * Définit le nombre de victoires du joueur.
     *
     * @param nombreVictoire Le nombre de victoires à définir.
     */
    public void setNombreVictoire(int nombreVictoire) {
        this.nombreVictoire = nombreVictoire;
    }

    /**
     * Définit la valeur attribuée au joueur dans le jeu.
     *
     * @param i La valeur à attribuer.
     */
    public void setValeur(int i) {
        this.valeur = i;
    }

    /**
     * Obtient la valeur attribuée au joueur dans le jeu.
     *
     * @return La valeur attribuée au joueur.
     */
    public int getValeur() {
        return valeur;
    }
}
