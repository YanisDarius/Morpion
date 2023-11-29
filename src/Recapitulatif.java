import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JPanel;

public class Recapitulatif extends JPanel{
    public Recapitulatif(Duel duel,Ecran ecran,GrilleAffichage affiche){
        
        setLayout(new GridBagLayout());
        Titre titre = new Titre("Récapitulatif des points", 0);
        Text nombreduel = new Text("duel n°"+duel.getNombreduel(), 1);
        String textjoueu1 = ajoutS(duel.getJoueur1().getNom()+" a "+duel.getJoueur1().getNombreVictoire()  + " victoire",duel.getJoueur1().getNombreVictoire());
        String textjoueu2 = ajoutS(duel.getJoueur2().getNom()+" a "+duel.getJoueur2().getNombreVictoire()  + " victoire",duel.getJoueur2().getNombreVictoire());
        Text joueur1 =  new Text(textjoueu1, 2);
        Text joueur2 =  new Text(textjoueu2, 3);
        Button fin = new Button("Fin", ecran,"fin", 4);
        Button rejouer = new Button("Rejouer", ecran,"morpion1vs1", 4);
        Button changerLesJoueur = new Button("Menu", ecran, "menu", 4);

      

        GridBagConstraints boutonConstraints = new GridBagConstraints();
        boutonConstraints.gridx = 0;
        boutonConstraints.gridy = 5;
        boutonConstraints.gridwidth = 1;
        boutonConstraints.insets = new Insets(10, 10, 20, 10);


        JPanel jpanel = new JPanel();
        jpanel.setLayout(new GridBagLayout());
        jpanel.add(rejouer,boutonConstraints);
        boutonConstraints.gridx = 1;
        jpanel.add(changerLesJoueur,boutonConstraints);
        boutonConstraints.gridx = 2;
        jpanel.add(fin,boutonConstraints);
        boutonConstraints.gridx = 0;

        add(jpanel,boutonConstraints);
        add(titre,titre.getContraint());
        add(nombreduel,nombreduel.getContraints());
        add(joueur1,joueur1.getContraints());
        add(joueur2,joueur2.getContraints());


    }

    private String ajoutS(String text,int nombredepoint) {
        if (nombredepoint > 1){
            text=text+"s";
        }
        return text;
    }
}
