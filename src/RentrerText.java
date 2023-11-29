

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

public class RentrerText extends JTextField{

private int placement;
private GridBagConstraints textConstraints;

    public RentrerText(int placement) {
        super(10);
        this.placement=placement;
        textConstraints = new GridBagConstraints();
        textConstraints.gridx = 0;
        textConstraints.gridy = placement;
        textConstraints.gridwidth = 1;
        textConstraints.insets = new Insets(10, 10, 20, 10);
    }
        
    

    public int length() {
        return this.getText().length();
    }

    public GridBagConstraints getConstraints() {
        return textConstraints;
    }
}
