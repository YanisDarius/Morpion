import javax.swing.JPanel;
import java.awt.GridBagLayout;

/**
 * La classe Menu représente l'écran d'accueil du jeu Morpion.
 * Elle étend JPanel et organise les composants graphiques du menu principal.
 */
public class Menu extends JPanel {

    /**
     * Constructeur de la classe Menu.
     *
     * @param ecran L'objet Ecran permettant la gestion des écrans dans l'interface.
     */
    public Menu(Ecran ecran) {
        setLayout(new GridBagLayout());

        // Titre du menu
        Titre titre = new Titre("Morpion", 0);
        titre.setPolice(75);

        // Texte indiquant le choix de mode de jeu
        Text choixmode = new Text("Choisissez votre mode de jeu", 1);

        // Bouton pour le mode 1vs1
        Button mode1vs1 = new Button("Jouer 1vs1", ecran, "choisirnomjoueur", 2);

        // Ajout des composants au panneau principal
        add(titre, titre.getContraint());
        add(choixmode, choixmode.getContraints());
        add(mode1vs1, mode1vs1.getConstraint());
    }
}
