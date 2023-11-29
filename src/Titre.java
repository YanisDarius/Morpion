import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;

/**
 * La classe Titre étend JLabel et représente un composant d'étiquette utilisé pour afficher un titre.
 */
public class Titre extends JLabel {

    private GridBagConstraints titreConstraints;
    private int police = 32;
    private int placement;

    /**
     * Constructeur de la classe Titre.
     *
     * @param titreText Le texte du titre à afficher.
     * @param placement La position du titre dans la grille du layout.
     */
    public Titre(String titreText, int placement) {
        super(titreText);
        this.placement = placement;
        setFont(new Font("Arial", Font.BOLD, police));
        titreConstraints = new GridBagConstraints();
        titreConstraints.gridx = 0;
        titreConstraints.gridy = placement;
        titreConstraints.gridwidth = 1;
        titreConstraints.insets = new Insets(10, 10, 20, 10);
    }

    /**
     * Modifie la taille de la police du titre.
     *
     * @param police La nouvelle taille de la police.
     */
    public void setPolice(int police /*valeur par défaut 32 */) {
        this.police = police;
        this.setFont(new Font("Arial", Font.BOLD, police));
    }

    /**
     * Récupère les contraintes de placement du titre dans la grille du layout.
     *
     * @return Les contraintes de placement du titre.
     */
    public GridBagConstraints getContraint() {
        return titreConstraints;
    }
}
