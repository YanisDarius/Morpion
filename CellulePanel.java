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
    private Text text;
    private Ecran ecran;

    public CellulePanel(int ligne, int colonne, Grille grille, Duel duel, Text text, Ecran ecran) {
        this.ligne = ligne;
        this.colonne = colonne;
        this.grille = grille;
        this.duel = duel;
        this.text = text;
        addMouseListener(new CelluleMouseListener());
        setPreferredSize(new Dimension(100, 100));
    }

    private class CelluleMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            // Changer la couleur de la cellule en rouge (vous pouvez utiliser une autre
            // couleur)
            if (grille.getCase(ligne, colonne) == 0)
                if (grille.setGrille(ligne, colonne, duel.getJoueuractuel().getValeur())) {
                    grille.reinitialisation();
                    ecran.ecranSuivant("fin");
                } else {
                    if (grille.gagner() != 0) {
                        // gagner joueur
                    }
                    duel.tourSuivant();
                    text.setText("c'est au tour de  " + duel.getJoueuractuel().getNom());
                    if (duel.getJoueuractuel().getValeur() == 1) {
                        setBackground(Color.RED);
                    } else {
                        setBackground(Color.BLUE);
                    }
                }
            // Afficher les données dans la console
            System.out.println("Clic sur la cellule : (" + ligne + ", " + colonne + ")");

        }

    }

}
