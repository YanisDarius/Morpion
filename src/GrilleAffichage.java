import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 * Represents the graphical display of the game grid in a Tic-Tac-Toe (Morpion) game.
 */
public class GrilleAffichage extends JPanel {

    private GridBagConstraints grilleConstraints;
    private int placement;
    private CellulePanel[][] cellules;
    private Ecran ecran; // Keep track of CellulePanel instances

    /**
     * Initializes a new instance of the GrilleAffichage class.
     *
     * @param duel   The Duel instance representing the game.
     * @param text   The Text instance for displaying messages.
     * @param placement The placement information for the grid in the layout.
     * @param ecran  The Ecran instance for managing screens.
     */
    public GrilleAffichage(Duel duel, Text text, int placement, Ecran ecran) {
        setLayout(new GridLayout(3, 3));
        setPreferredSize(new Dimension(600, 600));
        setMinimumSize(new Dimension(200, 200));
        this.placement = placement;
        this.cellules = new CellulePanel[3][3];
        this.ecran = ecran;

        // Create a border with a specific color
        Border cellBorder = BorderFactory.createLineBorder(Color.BLACK, 2);
        Grille grille = new Grille();

        // Create a 3x3 grid
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                CellulePanel cellule = new CellulePanel(i, j, grille, duel, text, ecran, this);

                // Add a border to each cell
                cellule.setBorder(cellBorder);

                cellules[i][j] = cellule; // Store the reference to the CellulePanel
                add(cellule);
            }
        }

        grilleConstraints = new GridBagConstraints();
        grilleConstraints.gridx = 0;
        grilleConstraints.gridy = placement;
        grilleConstraints.gridwidth = 1;
        grilleConstraints.insets = new Insets(10, 10, 20, 10);
    }

    /**
     * Gets the constraints for the layout.
     *
     * @return The GridBagConstraints for the grid layout.
     */
    public GridBagConstraints getConstraints() {
        return grilleConstraints;
    }

    /**
     * Resets the content of all cell panels in the grid.
     */
    public void resetCellules() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cellules[i][j].removeAll();
                cellules[i][j].repaint();
            }
        }
    }
}
