package com.company;

import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = genMatrix(5);
        showMatrix(matrix);
        System.out.println("");
        showMatrix(rotateMatrix(matrix));
    }

    public static int[][] rotateMatrix(final int[][] inMatrix){
        int[][] ans = new int[inMatrix.length][inMatrix.length];
        int[] temp = new int[inMatrix.length];
        for (int i = 0, length = inMatrix.length; i < length; ++i){
            for(int j = 0; j < length; ++j){
                temp[j] = inMatrix[i][j];
            }

            for(int j = length; j >= 1; --j){
                ans[-(j-length)][i] = temp[j - 1];
            }
        }
        return ans;
    }

    public static void showMatrix(final int[][] inMatrix){
        for(int i = 0, length = inMatrix.length; i < length; ++i){
            for(int j = 0; j < length; ++j){
                System.out.print(inMatrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int[][] genMatrix(int size){
        int[][] ans = new int[size][size];

        for(int i = 0; i < size; ++i){
            for(int j = 0; j < size; ++j) {
                ans[i][j] = (int)(Math.random()*100 - 50);
            }
        }
        return ans;
    }
}
