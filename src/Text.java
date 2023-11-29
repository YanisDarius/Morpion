import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;

/**
 * La classe Text étend JLabel et représente un composant d'étiquette utilisé pour afficher du texte.
 */
public class Text extends JLabel {

    private GridBagConstraints titreConstraints;
    private int police = 20;
    private int placement;

    /**
     * Constructeur de la classe Text.
     *
     * @param text      Le texte à afficher.
     * @param placement La position du texte dans la grille du layout.
     */
    public Text(String text, int placement) {
        super(text);
        this.placement = placement;

        setFont(new Font("Arial", Font.BOLD, police));
        titreConstraints = new GridBagConstraints();
        titreConstraints.gridx = 0;
        titreConstraints.gridy = placement; // Utilisation du placement fourni lors de la création
        titreConstraints.gridwidth = 1;
        titreConstraints.insets = new Insets(10, 10, 20, 10);
    }

    /**
     * Rafraîchit le texte affiché.
     *
     * @param newText Le nouveau texte à afficher.
     */
    public void refreshText(String newText) {
        setText(newText);
    }

    /**
     * Modifie la taille de la police du texte.
     *
     * @param police La nouvelle taille de la police.
     */
    public void setPolice(int police) {
        this.police = police;
        this.setFont(new Font("Arial", Font.BOLD, police));
    }

    /**
     * Récupère les contraintes de placement du texte dans la grille du layout.
     *
     * @return Les contraintes de placement du texte.
     */
    public GridBagConstraints getContraints() {
        return titreConstraints;
    }
}
