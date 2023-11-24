public class Joueur {
    private String nom;
    private int nombreVictoire = 0 ;
    private int nombreDefaite = 0;

    public Joueur(String nom){
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
}
