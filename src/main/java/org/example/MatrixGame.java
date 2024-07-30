package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MatrixGame {

    private final int[][] matrix;

    public MatrixGame(int[][] matrix) {
        this.matrix = matrix;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void changeCell(int i, int j, int number) {
        matrix[i][j] = number;
    }

    public boolean matrixHaveZero() {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt == 0) return true;
            }
        }
        return false;
    }

    public boolean checkWin() {
        return checkRows() && checkColumns() && cheakSquars();
    }

    private boolean cheakSquars() {
        ArrayList<Integer>[] arraysSquars = new ArrayList[9];
        for (int i = 0; i < arraysSquars.length; i++) {
            arraysSquars[i] = new ArrayList<>();
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                arraysSquars[i / 3 * 3 + j / 3].add(matrix[i][j]);
            }
        }
        for (int i = 0; i<arraysSquars.length; i++){
            Set<Integer> setNumbers = new HashSet<>();
            for (int j = 1; j < 10; j++) {
                setNumbers.add(j);
            }
            for (int j=0; j<arraysSquars[i].size();j++){
                setNumbers.remove(arraysSquars[i].get(j));
            }
            if (!setNumbers.isEmpty()) {
                return false;
            }
        }
        return true;

    }

    private boolean checkColumns() {
        for (int i = 0; i < matrix[0].length; i++) {
            Set<Integer> setNumbers = new HashSet<>();
            for (int j = 1; j < 10; j++) {
                setNumbers.add(j);
            }
            for (int j = 0; j < matrix.length; j++) {
                setNumbers.remove(matrix[j][i]);
            }
            if (!setNumbers.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    private boolean checkRows() {
        for (int i = 0; i < matrix.length; i++) {
            Set<Integer> setNumbers = new HashSet<>();
            for (int j = 1; j < 10; j++) {
                setNumbers.add(j);
            }
            for (int j = 0; j < matrix[i].length; j++) {
                setNumbers.remove(matrix[i][j]);
            }
            if (!setNumbers.isEmpty()) {
                return false;
            }
        }
        return true;
    }

}
