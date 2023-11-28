package src;


public class Joueur {
    private String nom;
    private int nombreVictoire = 0 ;
    private int nombreDefaite = 0;
  
    private int valeur;
    

    public Joueur(String nom){
        
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
   
    
    public void setvaleur(int i) {
        valeur=i;
    }
    public int getValeur() {
        return valeur;
    }
    
}
