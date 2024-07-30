package org.example;

import java.util.Scanner;

public class PeopleMove {
    private final Scanner scanner = new Scanner(System.in);
    private final OutputMatrix outputMatrix;

    public PeopleMove(OutputMatrix outputMatrix) {
        this.outputMatrix = outputMatrix;
    }

    public void makeStep(MatrixGame matrixGame){
        while (true){
            outputMatrix.coordinateOnMatrix(matrixGame);
            System.out.println("Выберите ячейку. Введите номер строки и столбца.");
            String answer = scanner.nextLine();
            if(answer.matches("[1-9] [1-9]")){
                int i = Integer.parseInt(answer.split(" ")[0]) - 1;
                int j = Integer.parseInt(answer.split(" ")[1]) - 1;
                if (matrixGame.getMatrix()[i][j] == 0){
                    while (true) {
                        System.out.println("Введите цифру: ");
                        String num = scanner.nextLine();
                        if (num.matches("[1-9]")) {
                            int number = Integer.parseInt(num);
                            matrixGame.changeCell(i, j, number);
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }
}
