import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

public class Morpion1vs1 extends JPanel {

    private Duel duel;
    private Joueur joueur1;
    private Joueur joueur2;

    public Morpion1vs1(Ecran ecran, Duel duel) {
        setLayout(new BorderLayout());

        this.duel = duel;
        this.joueur1 = duel.getJoueur1();
        this.joueur2 = duel.getJoueur2();
        JPanel jpanel1 = new JPanel();
        jpanel1.setLayout(new GridBagLayout());

        String texttitre = "Morpion :  " + joueur1.getNom() + " vs " + joueur2.getNom();
        Titre titre = new Titre(texttitre, 1);
        Text text = new Text("c'est au tour de  " + duel.getJoueuractuel().getNom() , 2);
        
        

        GrilleAffichage grilleAffichage = new GrilleAffichage(duel,text,4,ecran);
        



        jpanel1.add(titre, titre.getContraint());
        jpanel1.add(text, text.getContraints());
        jpanel1.add(grilleAffichage,grilleAffichage.getConstraints());

        PiedDePage pieddepage = new PiedDePage(ecran);

        add(jpanel1, BorderLayout.CENTER);
        add(pieddepage, BorderLayout.SOUTH);



    }

}
