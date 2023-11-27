import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class CellulePanel extends JPanel {
    private int ligne;
    private int colonne;
    private Grille grille;
    private Duel duel;

    public CellulePanel(int ligne, int colonne,Grille grille,Duel duel) {
        this.ligne = ligne;
        this.colonne = colonne;
        this.grille=grille;
        this.duel = duel;
        addMouseListener(new CelluleMouseListener());
        setPreferredSize(new Dimension(100,100));
    }

    private class CelluleMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            // Changer la couleur de la cellule en rouge (vous pouvez utiliser une autre couleur)
            if(grille.getCase(ligne,colonne) == 0) {
                grille.setGrille(ligne, colonne, duel.getJoueuractuel().getValeur());
                duel.tourSuivant();
                if (duel.getJoueuractuel().getValeur() == 1) {
                    setBackground(Color.RED);
                }else{
                    setBackground(Color.BLUE);
                }
                
            }

            // Afficher les données dans la console
            System.out.println("Clic sur la cellule : (" + ligne + ", " + colonne + ")");
        }

    
    }
}
