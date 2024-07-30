package org.example;

import java.util.Scanner;

public class СellRemoval {
    private final Scanner scanner = new Scanner(System.in);
    OutputMatrix outputMatrix = new OutputMatrix();

    public void correctionMistakes(MatrixGame matrixGame) {
        while (true) {
            outputMatrix.coordinateOnMatrix(matrixGame);
            System.out.println("Введите координаты, где хотите исправить ошибку: ");
            String answer = scanner.nextLine();
            if (answer.matches("[1-9] [1-9]")) {
                int i = Integer.parseInt(answer.split(" ")[0]) - 1;
                int j = Integer.parseInt(answer.split(" ")[1]) - 1;
                System.out.println("Введите цифру: ");
                String num = scanner.nextLine();
                if (num.matches("[1-9]")) {
                    int number = Integer.parseInt(num);
                    matrixGame.changeCell(i, j, number);
                    break;
                }
            }
        }
    }
}