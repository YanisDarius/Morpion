import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Represents a panel for choosing player names in the Tic-Tac-Toe (Morpion) game.
 */
public class ChoisirNomJoueur extends JPanel {

    /**
     * Initializes a new instance of the ChoisirNomJoueur class.
     *
     * @param ecran The Ecran instance for managing screens.
     */
    public ChoisirNomJoueur(Ecran ecran) {
        setLayout(new GridBagLayout());
        Titre titre = new Titre("Morpion 1 vs 1", 0);
        titre.setPolice(75);
        Text textjoueuer1 = new Text("Choissisez le nom du joueur 1", 1);
        RentrerText joueur1choisir = new RentrerText(2);
        Text textjoueuer2 = new Text("Choissisez le nom du joueur 2", 3);
        RentrerText joueur2choisir = new RentrerText(4);

        JButton bouton = new JButton("Confirmer");
        bouton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((joueur1choisir.length() > 0) && (joueur2choisir.length() > 0)) {
                    Joueur joueur1 = new Joueur(joueur1choisir.getText());
                    System.out.println("utilisateur 1   " + joueur1choisir.getText());

                    Joueur joueur2 = new Joueur(joueur2choisir.getText());
                    System.out.println("utilisateur 2   " + joueur2choisir.getText());
                    Duel duel = new Duel(joueur1, joueur2);
                    Morpion1vs1 morpion = new Morpion1vs1(ecran, duel);
                    ecran.ajouterEcran(morpion, "morpion1vs1");
                    ecran.ecranSuivant("morpion1vs1");
                }

            }
        });

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_SPACE || keyCode == KeyEvent.VK_ENTER) {
                    bouton.doClick();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        setFocusable(true);

        GridBagConstraints boutonConstraints = new GridBagConstraints();
        boutonConstraints.gridx = 0;
        boutonConstraints.gridy = 5;
        boutonConstraints.gridwidth = 1;
        boutonConstraints.insets = new Insets(10, 10, 20, 10);

        add(titre, titre.getContraint());
        add(textjoueuer1, textjoueuer1.getContraints());
        add(joueur1choisir, joueur1choisir.getConstraints());
        add(textjoueuer2, textjoueuer2.getContraints());
        add(joueur2choisir, joueur2choisir.getConstraints());
        add(bouton, boutonConstraints);
    }
}
