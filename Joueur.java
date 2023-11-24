import javax.swing.JPanel;

public class Joueur {
    private String nom;
    private int nombreVictoire = 0 ;
    private int nombreDefaite = 0;
    private JPanel panel;
    

    public Joueur(String nom,JPanel panel){
        this.panel=panel;
        this.nom=nom;
    }

    public int getNombreDefaite() {
        return nombreDefaite;
    }
    public String getNom() {
        return nom;
    }
    public int getNombreVictoire() {
        return nombreVictoire;
    }
    public void setNombreDefaite(int nombreDefaite) {
        this.nombreDefaite = nombreDefaite;
    }
    public void setNombreVictoire(int nombreVictoire) {
        this.nombreVictoire = nombreVictoire;
    }
    public JPanel getPanel() {
        return panel;
    }
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
}
