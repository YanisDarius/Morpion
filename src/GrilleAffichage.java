
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class GrilleAffichage extends JPanel {

    private GridBagConstraints grilleConstraints;
    private int placement;
    private CellulePanel[][] cellules; // Keep track of CellulePanel instances

    public GrilleAffichage(Duel duel, Text text, int placement, Ecran ecran) {
        setLayout(new GridLayout(3, 3));
        setPreferredSize(new Dimension(600, 600));
        setMaximumSize(new Dimension(200,200));
        this.placement = placement;
        this.cellules = new CellulePanel[3][3];

        // Création d'une bordure avec une couleur spécifique
        Border cellBorder = BorderFactory.createLineBorder(Color.BLACK, 2);
        Grille grille = new Grille();

        // Création de la grille de 3x3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                CellulePanel cellule = new CellulePanel(i, j, grille, duel, text, ecran,this);
                

                // Ajout d'une bordure à chaque cellule
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

    public GridBagConstraints getConstraints() {
        return grilleConstraints;
    }

    
    public  void resetCellules() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cellules[i][j].removeAll(); 
                cellules[i][j].repaint();   
            }
        }
    }
}
