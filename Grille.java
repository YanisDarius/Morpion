

public class Grille {
    private int[][] grille;

    public Grille() {
        grille = new int[3][3];
        retianalisation(grille);
    }

    public int[][] retianalisation(int[][] grille) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grille[i][j] = 0;
            }
        }
        return grille;
    }

    public int[][] getGrille() {
        return grille;
    }

    public void setGrille(int ligne, int colonne , int valeur) {
        grille[ligne][colonne] = valeur;
        
    }

    public int getCase(int ligne,int colonne) {
        return grille[ligne][colonne];
    }
}