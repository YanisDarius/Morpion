import javax.swing.JPanel;
import java.awt.GridBagLayout;

public class Menu extends JPanel{
 

    
    public Menu(Ecran ecran){
        setLayout(new GridBagLayout());
        Titre titre = new Titre("Morpion", 0);
        titre.setPolice(75);
        Text choixmode = new Text("Choissisez votre mode de jeu", 1);
        Button mode1vs1 = new Button("Jouer 1vs1", ecran, "choisirnomjoueur", 2);
        

        add(choixmode,choixmode.getContraints());
        add(mode1vs1,mode1vs1.getConstraint());
        

        
    }
}
