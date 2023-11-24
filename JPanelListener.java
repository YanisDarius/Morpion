import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class JPanelListener implements ActionListener {
    private Grille grille;
    private int ligne;
    private int colonne;

    public JPanelListener(Grille grille, int ligne, int colonne) {
        this.grille = grille;
        this.ligne = ligne;
        this.colonne = colonne;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        grille.jouerTour(ligne, colonne);

        if (grille.estPartieTerminee()) {
            JOptionPane.showMessageDialog(null, "La partie est terminée!");
            System.exit(0);
        }
    }
}
