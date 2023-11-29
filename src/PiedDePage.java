
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;




public class PiedDePage extends JPanel {

    
    public PiedDePage(Ecran ecran) {

        setLayout(new BorderLayout());
        JPanel flowPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JPanel flowPane2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        Button quitter = new Button("Quitter", ecran,"TERMINER", 0);
        Button changerLesJoueur =  new Button("retour", ecran, "choisirnomjoueur",0);

        flowPanel.add(quitter);

        flowPane2.add(changerLesJoueur);
       
        add(flowPanel, BorderLayout.EAST);
        add(flowPane2, BorderLayout.WEST);

    }
}
