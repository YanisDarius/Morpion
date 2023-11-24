import javax.swing.*;
import java.awt.*;

public class PanelX extends JPanel {

    public PanelX() {
        // Création d'un JLabel avec le texte "X"
        JLabel labelX = new JLabel("X");
        labelX.setFont(new Font("Arial", Font.PLAIN, 40));

        // Ajout du JLabel au panneau
        add(labelX);
    }

   
}
