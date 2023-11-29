import java.awt.GridBagLayout;
import javax.swing.JPanel;


/**
 * La classe Fin représente un panneau Swing affichant un message de remerciement
 * et un bouton "Quitter" pour terminer l'application.
 */
public class Fin extends JPanel {

    /**
     * Constructeur de la classe Fin.
     *
     * @param ecran L'instance de la classe Ecran utilisée pour la gestion des écrans.
     */
    public  Fin(Ecran ecran) {
        
        setLayout(new GridBagLayout());
        Titre remerciment = new Titre("Merci d'avoir jouer au Morpion  !", 0);
        Button quitter = new Button("quitter",ecran,"TERMINER",1);
        Button menu = new Button("Menu",ecran,"menu", 2);

        
        // Ajoutez les composants au panneau
        add(remerciment, remerciment.getContraint());
        add(menu,menu.getConstraint());
        add(quitter, quitter.getConstraint());

    }
}