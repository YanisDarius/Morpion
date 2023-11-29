import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

/**
 * La classe Morpion1vs1 représente l'interface du jeu Morpion pour un joueur contre un autre joueur.
 * Elle étend JPanel et organise les composants graphiques de l'interface.
 */
public class Morpion1vs1 extends JPanel {

    private Duel duel;
    private Joueur joueur1;
    private Joueur joueur2;

    /**
     * Constructeur de la classe Morpion1vs1.
     *
     * @param ecran L'objet Ecran permettant la gestion des écrans dans l'interface.
     * @param duel L'objet Duel représentant la partie en cours.
     */
    public Morpion1vs1(Ecran ecran, Duel duel) {
        setLayout(new BorderLayout());

        this.duel = duel;
        this.joueur1 = duel.getJoueur1();
        this.joueur2 = duel.getJoueur2();
        JPanel jpanel1 = new JPanel();
        jpanel1.setLayout(new GridBagLayout());

        // Titre de l'interface
        String texttitre = "Morpion : " + joueur1.getNom() + " vs " + joueur2.getNom();
        Titre titre = new Titre(texttitre, 1);

        // Texte indiquant le tour du joueur
        Text text = new Text("C'est au tour de " + duel.getJoueuractuel().getNom(), 2);
        text.setPolice(24);

        // Affichage de la grille de jeu
        GrilleAffichage grilleAffichage = new GrilleAffichage(duel, text, 4, ecran);

        // Ajout des composants au panneau principal
        jpanel1.add(titre, titre.getContraint());
        jpanel1.add(text, text.getContraints());
        jpanel1.add(grilleAffichage, grilleAffichage.getConstraints());

        // Pied de page contenant les boutons
        PiedDePage pieddepage = new PiedDePage(ecran);

        // Ajout des panneaux au panneau principal
        add(jpanel1, BorderLayout.CENTER);
        add(pieddepage, BorderLayout.SOUTH);
    }
}
