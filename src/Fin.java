
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
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
        Button menu = new Button("Menu",ecran,"choisirnom", 2);

        // Ajoutez un bouton "Quitter" avec un gestionnaire d'événements
        

        

        GridBagConstraints buttonConstraints = new GridBagConstraints();
        buttonConstraints.gridx = 0;
        buttonConstraints.gridy = 1;
        buttonConstraints.insets = new java.awt.Insets(10, 10, 10, 10);

        GridBagConstraints button2Constraints = new GridBagConstraints();
        button2Constraints.gridx = 0;
        button2Constraints.gridy = 2;
        button2Constraints.insets = new java.awt.Insets(10, 10, 10, 10);

        // Ajoutez les composants au panneau
        add(remerciment, remerciment.getContraint());
        add(menu,menu.getConstraint());
        add(quitter, quitter.getConstraint());

    }
}