
import java.awt.GridBagLayout;
import javax.swing.JPanel;

public class Morpion1vs1 extends JPanel{

    private Duel duel;
    private Joueur joueur1;
    private Joueur joueur2;

    public Morpion1vs1(Ecran ecran,Duel duel) {
    setLayout(new GridBagLayout());

    this.duel=duel;
    this.joueur1 = duel.getJoueur1();
    this.joueur2 = duel.getJoueur2();
    

    String texttitre="Morpion :  " +joueur1.getNom()+" vs "+joueur2.getNom();
    Titre titre = new Titre(texttitre,1);
    Text text = new Text("",2);

        add(titre,titre.getContraint());
        add(text,text.getContraints());

    }
    
}
