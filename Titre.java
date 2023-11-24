import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JLabel;


public class Titre extends JLabel {

    
    private GridBagConstraints titreConstraints;
    private int police = 32;
    private int placement ;

    
    public Titre(String titreText,int placement) {
        
        super(titreText);
        this.placement=placement;
        setFont(new Font("Arial", Font.BOLD, 32));
        titreConstraints = new GridBagConstraints();
        titreConstraints.gridx = 0;
        titreConstraints.gridy = placement;
        titreConstraints.gridwidth = 1;
        titreConstraints.insets = new Insets(10, 10, 20, 10);
    }

   
    public GridBagConstraints getContraint() {
        return titreConstraints;
    }

    
}