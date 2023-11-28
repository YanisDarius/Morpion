
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JLabel;

public class Text extends JLabel {

    private GridBagConstraints titreConstraints;
    private int police = 20;
    private int placement;

    public Text(String text, int placement) {
        super(text);
        this.placement = placement;
        
        setFont(new Font("Arial", Font.BOLD, police));
        titreConstraints = new GridBagConstraints();
        titreConstraints.gridx = 0;
        titreConstraints.gridy = placement; // Utilisation du placement fourni lors de la création
        titreConstraints.gridwidth = 1;
        titreConstraints.insets = new Insets(10, 10, 20, 10);
    }

    public void refreshText(String newText) {
        setText(newText);
    }

    public void setPolice(int police) {
        this.police = police;
        this.setFont(new Font("Arial", Font.BOLD, police));
    }

    public GridBagConstraints getContraints() {
        return titreConstraints;
    }
}
