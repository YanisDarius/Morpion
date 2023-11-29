import javax.swing.JButton;

import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JButton {

    private GridBagConstraints buttonConstraints;
    private int placementy;
    private int placementx = 0;

    public Button(String nom, Ecran ecran,String direction,int placementy){
        super(nom);
        this.placementy = placementy;

        buttonConstraints = new GridBagConstraints();
        buttonConstraints.gridx = placementx;
        buttonConstraints.gridy = placementy;
        buttonConstraints.insets = new java.awt.Insets(10, 10, 10, 10);

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                ecran.ecranSuivant(direction);
            }
        });
    }

    public void setPlacementy(int placementy) {
        this.placementy = placementy;
    }
    
    public void setPlacementx(int placementx) {
        this.placementx = placementx;
    }

    public GridBagConstraints getConstraint() {
        return buttonConstraints;
    }
}
