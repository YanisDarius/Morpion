import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

/**
 * La classe RentrerText étend JTextField et représente un champ de texte
 * permettant à l'utilisateur de saisir du texte.
 */
public class RentrerText extends JTextField {

    private int placement;
    private GridBagConstraints textConstraints;

    /**
     * Constructeur de la classe RentrerText.
     *
     * @param placement La position du champ de texte dans la grille du layout.
     */
    public RentrerText(int placement) {
        super(10); // 10 est la largeur par défaut du champ de texte
        this.placement = placement;
        textConstraints = new GridBagConstraints();
        textConstraints.gridx = 0;
        textConstraints.gridy = placement;
        textConstraints.gridwidth = 1;
        textConstraints.insets = new Insets(10, 10, 20, 10);
    }

    /**
     * Récupère la longueur du texte saisi dans le champ.
     *
     * @return La longueur du texte saisi.
     */
    public int length() {
        return this.getText().length();
    }

    /**
     * Récupère les contraintes de placement du champ de texte dans la grille du layout.
     *
     * @return Les contraintes de placement du champ de texte.
     */
    public GridBagConstraints getConstraints() {
        return textConstraints;
    }
}
