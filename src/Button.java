import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * La classe Button étend JButton et représente un bouton dans l'interface utilisateur.
 * Ce bouton est conçu pour changer l'écran lorsqu'il est cliqué.
 */
public class Button extends JButton {

    private GridBagConstraints buttonConstraints;
    private int placementy;
    private int placementx = 0;

    /**
     * Constructeur de la classe Button.
     *
     * @param nom       Le texte à afficher sur le bouton.
     * @param ecran     L'instance de la classe Ecran qui gère les écrans de l'interface.
     * @param direction La direction vers laquelle l'écran doit changer lors du clic sur le bouton.
     * @param placementy La coordonnée y de placement du bouton dans la grille du layout.
     */
    public Button(String nom, Ecran ecran, String direction, int placementy) {
        super(nom);
        this.placementy = placementy;

        buttonConstraints = new GridBagConstraints();
        buttonConstraints.gridx = placementx;
        buttonConstraints.gridy = placementy;
        buttonConstraints.insets = new java.awt.Insets(10, 10, 10, 10);

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Action à effectuer lors du clic sur le bouton
                ecran.ecranSuivant(direction);
            }
        });
    }

    /**
     * Modifie la coordonnée y de placement du bouton dans la grille du layout.
     *
     * @param placementy La nouvelle coordonnée y de placement.
     */
    public void setPlacementy(int placementy) {
        this.placementy = placementy;
    }

    /**
     * Modifie la coordonnée x de placement du bouton dans la grille du layout.
     *
     * @param placementx La nouvelle coordonnée x de placement.
     */
    public void setPlacementx(int placementx) {
        this.placementx = placementx;
    }

    /**
     * Récupère les contraintes de placement du bouton dans la grille du layout.
     *
     * @return Les contraintes de placement du bouton.
     */
    public GridBagConstraints getConstraint() {
        return buttonConstraints;
    }
}
