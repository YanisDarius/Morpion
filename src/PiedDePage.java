import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

/**
 * La classe PiedDePage étend JPanel et représente le panneau situé en bas de l'interface.
 * Il contient des boutons pour quitter et changer de joueur.
 */
public class PiedDePage extends JPanel {

    /**
     * Constructeur de la classe PiedDePage.
     *
     * @param ecran L'objet Ecran permettant la gestion des écrans dans l'interface.
     */
    public PiedDePage(Ecran ecran) {

        setLayout(new BorderLayout());

        // Panneau de flux à droite contenant le bouton "Quitter"
        JPanel flowPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        Button quitter = new Button("Quitter", ecran, "TERMINER", 0);
        flowPanel.add(quitter);

        // Panneau de flux à gauche contenant le bouton "Retour"
        JPanel flowPane2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        Button changerLesJoueur = new Button("Retour", ecran, "choisirnomjoueur", 0);
        flowPane2.add(changerLesJoueur);

        // Ajout des panneaux de flux au panneau principal
        add(flowPanel, BorderLayout.EAST);
        add(flowPane2, BorderLayout.WEST);
    }
}
