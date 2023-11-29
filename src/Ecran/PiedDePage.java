package Ecran;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import Fenetre.Ecran;


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

        JButton changerLesJoueur = new JButton("Retour");
        changerLesJoueur.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                ecran.ecranSuivant("choisirnom");
            }
        });
        

        flowPanel.add(quitter);

        flowPane2.add(changerLesJoueur);
       
        add(flowPanel, BorderLayout.EAST);
        add(flowPane2, BorderLayout.WEST);

    }
}
