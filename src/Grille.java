/**
 * Represents the game board (grid) for Tic-Tac-Toe (Morpion).
 */
public class Grille {
    private int[][] grille;

    /**
     * Initializes a new instance of the Grille class and resets the game board.
     */
    public Grille() {
        grille = new int[3][3];
        reinitialisation();
    }

    /**
     * Resets the game board, setting all cells to 0.
     *
     * @return The updated game board.
     */
    public int[][] reinitialisation() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grille[i][j] = 0;
            }
        }
        return grille;
    }

    /**
     * Gets the current state of the game board.
     *
     * @return The game board.
     */
    public int[][] getGrille() {
        return grille;
    }

    /**
     * Sets a cell in the game board with a specified value.
     *
     * @param ligne   The row index of the cell.
     * @param colonne The column index of the cell.
     * @param valeur  The value to set in the cell.
     * @return True if the game board is filled, false otherwise.
     */
    public boolean setGrille(int ligne, int colonne, int valeur) {
        grille[ligne][colonne] = valeur;
        return grilleRemplie();
    }

    /**
     * Gets the value of a specific cell in the game board.
     *
     * @param ligne   The row index of the cell.
     * @param colonne The column index of the cell.
     * @return The value of the specified cell.
     */
    public int getCase(int ligne, int colonne) {
        return grille[ligne][colonne];
    }

    private boolean grilleRemplie() {
        int compteur = 9;
        boolean remplie = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grille[i][j] != 0) {
                    compteur--;
                }
            }
        }
        if (compteur == 0) {
            return remplie = true;
        } else {
            return remplie;
        }
    }

    /**
     * Checks for a winning condition on the game board.
     *
     * @return The winning player's value (1 or 2) if there is a winner, 0 otherwise.
     */
    public int gagner() {
        if (grille[0][0] != 0) {
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
