import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JLabel;


public class Text extends JLabel {

    
    private GridBagConstraints titreConstraints;
    private int police = 12;
    private int placement;

    
    public Text(String Text,int placement) {
        super(Text);
        this.placement=placement;
        setFont(new Font("Arial", Font.BOLD, police));
        titreConstraints = new GridBagConstraints();
        titreConstraints.gridx = 0;
        titreConstraints.gridy = -1;
        titreConstraints.gridwidth = 1;
        titreConstraints.insets = new Insets(10, 10, 20, 10);
    }

   
    public GridBagConstraints getContraints() {
        return titreConstraints;
    }
}