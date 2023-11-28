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
    private boolean grilleremplie;

    public CellulePanel(int ligne, int colonne, Grille grille, Duel duel, Text text, Ecran ecran) {
        this.ligne = ligne;
        this.colonne = colonne;
        this.grille = grille;
        this.duel = duel;
        this.text = text;
        this.ecran = ecran;
        addMouseListener(new CelluleMouseListener());
        setPreferredSize(new Dimension(100, 100));

    }

    private class CelluleMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {

            if (grille.getCase(ligne, colonne) == 0) {
                grilleremplie = grille.setGrille(ligne, colonne, duel.getJoueuractuel().getValeur());
                System.out.println(grilleremplie);
                if (grilleremplie) {
                    grille.reinitialisation();
                    ecran.ecranSuivant("fin");
                } else {
                    if ((grille.gagner() != 0)) {
                        Recapitulatif recapitulatif = new Recapitulatif(duel, ecran);
                        ecran.ajouterEcran(recapitulatif,"recapitulatif");
                        ecran.ecranSuivant("recapitulatif");
                    }
                    duel.tourSuivant();
                    text.setText("c'est au tour de  " + duel.getJoueuractuel().getNom());
                    if (duel.getJoueuractuel().getValeur() == 1) {
                        setBackground(Color.RED);
                    } else {
                        setBackground(Color.BLUE);
                    }
                }

                System.out.println("Clic sur la cellule : (" + ligne + ", " + colonne + ")");

            }

        }

    }
}
