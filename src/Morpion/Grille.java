package Morpion;



public class Grille {
    private int[][] grille;

    public Grille() {
        grille = new int[3][3];
        reinitialisation();
    }

    public int[][] reinitialisation() {
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

    public boolean setGrille(int ligne, int colonne , int valeur) {
        grille[ligne][colonne] = valeur;
        return grilleRemplie();
    }

    public int getCase(int ligne,int colonne) {
        return grille[ligne][colonne];
    }

    private boolean grilleRemplie() {
        int compteur = 9;
        boolean remplie = false ;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grille[i][j] != 0) {
                    compteur--;
                }
            }
        }
        if (compteur == 0){
            return remplie=true;
        }else{
            return remplie;
        }
    }


    public int gagner() {
        if(grille[0][0] != 0){
        for (int i = 0; i < 3; i++) {
            if (grille[i][0] == grille[i][1] && grille[i][1] == grille[i][2] && grille[i][0] != 0) {
                return grille[i][0]; 
            }
            if (grille[0][i] == grille[1][i] && grille[1][i] == grille[2][i] && grille[0][i] != 0) {
                return grille[0][i]; 
            }
        }

        
        if (grille[0][0] == grille[1][1] && grille[1][1] == grille[2][2] && grille[0][0] != 0) {
            return grille[0][0]; 
        }
        if (grille[0][2] == grille[1][1] && grille[1][1] == grille[2][0] && grille[0][2] != 0) {
            return grille[0][2]; 
        }
    }
        return 0; 
    }

}