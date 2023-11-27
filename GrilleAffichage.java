import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class GrilleAffichage extends JPanel {

    private GridBagConstraints grilleConstraints;
    private int placement;

    public GrilleAffichage(Duel duel,Text text,int placement,Ecran ecran) {

        setLayout(new GridLayout(3, 3));
        this.placement=placement;
        

        // Création d'une bordure avec une couleur spécifique
        Border cellBorder = BorderFactory.createLineBorder(Color.BLACK, 2);
        Grille grille = new Grille();

        // Création de la grille de 3x3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                CellulePanel cellule = new CellulePanel(i, j,grille,duel,text,ecran);
                cellule.setLayout(new BorderLayout());

                // Ajout d'une bordure à chaque cellule
                cellule.setBorder(cellBorder);

                

                // Ajout d'une étiquette pour afficher le numéro de la cellule (à titre d'exemple)
                JLabel label = new JLabel("(" + i + ", " + j + ")");
                label.setHorizontalAlignment(JLabel.CENTER);
                label.setVerticalAlignment(JLabel.CENTER);
                cellule.add(label, BorderLayout.CENTER);

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
    
}
