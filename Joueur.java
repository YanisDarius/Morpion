import javax.swing.JPanel;

public class Joueur {
    private String nom;
    private int nombreVictoire = 0 ;
    private int nombreDefaite = 0;
    private JPanel panel;
    private int valeur;
    

    public Joueur(String nom,JPanel panel){
        this.panel=panel;
        this.nom=nom;
        this.valeur = 0 ;
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
    public void setvaleur(int i) {
        valeur=i;
    }
    public int getValeur() {
        return valeur;
    }
    
}
