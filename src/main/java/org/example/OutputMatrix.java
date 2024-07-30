package org.example;

public class OutputMatrix {

    public void showMatrix(MatrixGame matrixGame) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matrixGame.getMatrix()[i][j] + " ");
                if (j == 2 || j == 5) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if (i == 2 || i== 5){
                System.out.println("- - - - - - - - - - -");
            }
        }
    }
    public void coordinateOnMatrix(MatrixGame matrixGame){
        System.out.println("   1 2 3   4 5 6   7 8 9");
        System.out.println();
        for (int i = 0; i < 9; i++) {
            System.out.print(i + 1 + "  ");
            for (int j = 0; j < 9; j++) {
                System.out.print(matrixGame.getMatrix()[i][j] + " ");
                if (j == 2 || j == 5) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if (i == 2 || i== 5){
                System.out.println("   - - - - - - - - - - -");
            }
        }
    }
}