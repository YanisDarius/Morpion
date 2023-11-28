
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Recapitulatif extends JPanel{
    public Recapitulatif(Duel duel,Ecran ecran){

        setLayout(new GridBagLayout());
        Titre titre = new Titre("Récapitulatif des points", -1);
        Text joueur1 =  new Text(duel.getJoueur1().getNom()+" a "+duel.getJoueur1().getNombreVictoire()  + " victoire ", 2);
        Text joueur2 =  new Text(duel.getJoueur2().getNom()+ " a " +duel.getJoueur2().getNombreVictoire() + "victoire", 3);
        

        JButton fin = new JButton("fin");
        fin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                ecran.ecranSuivant("fin");
            }
        });
        GridBagConstraints boutonConstraints = new GridBagConstraints();
        boutonConstraints.gridx = -1;
        boutonConstraints.gridy = 5;
        boutonConstraints.gridwidth = 1;
        boutonConstraints.insets = new Insets(10, 10, 20, 10);

        add(fin,boutonConstraints);

        JButton rejouer = new JButton("rejouer");
        rejouer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                ecran.ecranSuivant("morpion1vs1");
            }
        });
        boutonConstraints.gridx = 0;
        add(rejouer,boutonConstraints);

        JButton changerLesJoueur = new JButton("changer les joueur");
        changerLesJoueur.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                ecran.ecranSuivant("choisirnom");
            }
        });
        boutonConstraints.gridx = 2;
        add(changerLesJoueur,boutonConstraints);

        add(titre,titre.getContraint());
        add(joueur1,joueur1.getContraints());
        add(joueur2,joueur2.getContraints());


    }
}
