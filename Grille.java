import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Grille extends JPanel {
    private char[][] tableau;
    private Joueur joueurActuel;
    private JPanel[][] panneaux;
    private Joueur joueur1;
    private Joueur joueur2;
    private Duel duel;

    public Grille(Duel duel) {
        this.duel = duel;
        joueur1 = duel.getJoueur1();
        joueur2 = duel.getJoueur2();
        tableau = new char[3][3];
        joueurActuel = joueur1; // Le joueur 'X' commence
        initialiserTableau();

        // Initialisation des panneaux
        panneaux = new JPanel[3][3];
        setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                panneaux[i][j] = new JPanel();
                panneaux[i][j].setLayout(new BorderLayout());
                panneaux[i][j].setFont(new Font("Arial", Font.PLAIN, 40));
                panneaux[i][j].addMouseListener(new JPanelMouseListener(this, i, j));
                add(panneaux[i][j]);
            }
        }
    }

    private void initialiserTableau() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tableau[i][j] = '-';
            }
        }
    }

    public void jouerTour(int ligne, int colonne) {
        if (estCaseValide(ligne, colonne)) {
            tableau[ligne][colonne] = joueurActuel == joueur1 ? 'X' : 'O';
            panneaux[ligne][colonne].add(new JLabel(String.valueOf(tableau[ligne][colonne])), BorderLayout.CENTER);
            
            if (estPartieTerminee()) {
                JOptionPane.showMessageDialog(null, "La partie est terminée!");
                if (estPartieGagnante()) {
                    if (joueurActuel == joueur1) {
                        duel.victoireJoueur1();
                    } else {
                        duel.victoireJoueur2();
                    }
                }
                duel.nouveauDuel();
                resetGrille();
            } else {
                changerJoueur();
            }
        }
    }

    private boolean estCaseValide(int ligne, int colonne) {
        return tableau[ligne][colonne] == '-';
    }

    private void changerJoueur() {
        joueurActuel = (joueurActuel == joueur1) ? joueur2 : joueur1;
    }

    private boolean estPartieTerminee() {
        // Logique pour vérifier la fin de partie
        // ...
        return false;
    }

    private boolean estPartieGagnante() {
        // Logique pour vérifier s'il y a une partie gagnante
        // ...
        return false;
    }

    private void resetGrille() {
        // Réinitialiser la grille pour une nouvelle partie
        initialiserTableau();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                panneaux[i][j].removeAll();
            }
        }
        joueurActuel = joueur1;
        revalidate();
        repaint();
    }
}

class JPanelMouseListener extends MouseAdapter {
    private Grille grille;
    private int ligne;
    private int colonne;

    public JPanelMouseListener(Grille grille, int ligne, int colonne) {
        this.grille = grille;
        this.ligne = ligne;
        this.colonne = colonne;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        grille.jouerTour(ligne, colonne);
    }
}
