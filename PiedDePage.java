import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class PiedDePage extends JPanel {

    
    public PiedDePage(Ecran ecran) {

        
        
        setLayout(new BorderLayout());
        JPanel flowPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JPanel flowPane2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        
        JButton quitter = new JButton("Quitter");
        quitter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                ecran.ecranSuivant("TERMINER");
            }
        });

        JButton retour = new JButton("retour choisir nom");
        quitter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                ecran.ecranSuivant("choisirnom");
            }
        });
        

        flowPanel.add(quitter);

        flowPane2.add(retour);
       
        add(flowPanel, BorderLayout.EAST);
        add(flowPane2, BorderLayout.WEST);

    }
}
