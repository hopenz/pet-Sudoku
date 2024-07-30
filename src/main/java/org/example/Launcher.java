package org.example;

import java.util.Scanner;

public class Launcher {
    Scanner scanner = new Scanner(System.in);

    public void startGame() {
        FillingTheMatrix fillingTheMatrix = new FillingTheMatrix();
        OutputMatrix outputMatrix = new OutputMatrix();
        MatrixGame matrixGame = new MatrixGame(fillingTheMatrix.getNewArrayForGame());
        PeopleMove peopleMove = new PeopleMove(outputMatrix);
        СellRemoval cellRemoval = new СellRemoval();

        while (matrixGame.matrixHaveZero()) {
            peopleMove.makeStep(matrixGame);
        }
        if (matrixGame.checkWin()) {
            System.out.println("Вы победили! Поздравляю!");
        } else {
            while (true) {
                System.out.println("Вы проиграли. Хотите исправить ошибку? Да/Нет");
                String answer = scanner.nextLine().toLowerCase();
                if (answer.equals("да")) {
                    cellRemoval.correctionMistakes(matrixGame);
                    if (matrixGame.checkWin()) {
                        System.out.println("Вы победили! Поздравляю!");
                        break;
                    }
                }if (answer.equals("нет")){
                    break;
                }
            }
        }
    }
}
