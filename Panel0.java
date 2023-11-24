import javax.swing.*;
import java.awt.*;

public class Panel0 extends JPanel {

    public Panel0() {
        // Création d'un JLabel avec le texte "O"
        JLabel labelO = new JLabel("O");
        labelO.setFont(new Font("Arial", Font.PLAIN, 40));

        // Ajout du JLabel au panneau
        add(labelO);
    }

    
}
