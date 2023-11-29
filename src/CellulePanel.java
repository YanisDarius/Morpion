
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CellulePanel extends JPanel {
    private int ligne;
    private int colonne;
    private Grille grille;
    private Duel duel;
    private Text text;
    private Ecran ecran;
    private boolean grilleremplie;
    private Recapitulatif recapitulatif;
    private GrilleAffichage affichage;

    public CellulePanel(int ligne, int colonne, Grille grille, Duel duel, Text text, Ecran ecran,
            GrilleAffichage affichage) {
        this.ligne = ligne;
        this.colonne = colonne;
        this.grille = grille;
        this.duel = duel;
        this.text = text;
        this.ecran = ecran;
        this.affichage = affichage;
        addMouseListener(new CelluleMouseListener());
        setPreferredSize(new Dimension(150, 150));new Dimension(50, 50);
        setMinimumSize(new Dimension(50, 50)); 

    }

    private class CelluleMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {

            if (grille.getCase(ligne, colonne) == 0) {
                grilleremplie = grille.setGrille(ligne, colonne, duel.getJoueuractuel().getValeur());
                System.out.println(grilleremplie);
                if (grilleremplie) {

                    creationDeRecapitulatif();
                } else {

                    duel.tourSuivant();
                    text.setText("c'est au tour de  " + duel.getJoueuractuel().getNom());

                    if (duel.getJoueuractuel().getValeur() == 1) {
                        JLabel X = new JLabel("X");
                        X.setFont(new Font("Arial", Font.PLAIN, 50));
                        X.setForeground(Color.BLUE);
                        setLayout(new GridBagLayout());
                        add(X, new GridBagConstraints());

                    } else {
                        JLabel O = new JLabel("O");
                        O.setFont(new Font("Arial", Font.PLAIN, 50));
                        O.setForeground(Color.RED);
                        setLayout(new GridBagLayout());
                        add(O, new GridBagConstraints());
                    }
                    victoire();
                    ecran.rafraichirEcran();
                }

                System.out.println("Clic sur la cellule : (" + ligne + ", " + colonne + ")");
            }
        }
    }

    private void victoire() {
        int gagnant;
        gagnant = grille.gagner();
        if ((gagnant != 0)) {
            if (gagnant == 1) {
                duel.victoireJoueur1();
            } else {
                duel.victoireJoueur2();
            }

            creationDeRecapitulatif();
        }
    }

    private void creationDeRecapitulatif() {
        duel.nouveauDuel();
        duel.tourSuivant();
        grille.reinitialisation();
        affichage.resetCellules();
        recapitulatif = new Recapitulatif(duel, ecran, affichage);
        ecran.ajouterEcran(recapitulatif, "recapitulatif");
        ecran.ecranSuivant("recapitulatif");
    }
}
