import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

public class Morpion1vs1 extends JPanel {

    private Duel duel;
    private Joueur joueur1;
    private Joueur joueur2;

    public Morpion1vs1(Ecran ecran, Duel duel) {
        setLayout(new GridBagLayout());

        this.duel = duel;
        this.joueur1 = duel.getJoueur1();
        this.joueur2 = duel.getJoueur2();

        String texttitre = "Morpion :  " + joueur1.getNom() + " vs " + joueur2.getNom();
        Titre titre = new Titre(texttitre, 1);
        Text text = new Text("", 2);
        Grille grille = new Grille(duel);
        GridBagConstraints  grilleConstraints = new GridBagConstraints();
        grilleConstraints.gridx = 0;
        grilleConstraints.gridy = 3;
        grilleConstraints.gridwidth = 1;
        grilleConstraints.insets = new Insets(10, 10, 20, 10);

        add(titre, titre.getContraint());
        add(text, text.getContraints());




    }

}
