package com.company;

public class Main {

    public static void main(String[] args) {
	    buildPyramid(9);
    }

    public static void buildPyramid(int height){
        int spacesCount = height - 1;
        for(int h = 1; h <= height; ++h){
            for(int j = 1; j <= spacesCount; ++j){
                System.out.print(" ");
            }
            for(int j = 1; j <= h; ++j){
                System.out.print(j);
            }
            for(int j = h-1; j > 0; --j){
                System.out.print(j);
            }
            for(int j = 1; j <= spacesCount; ++j) {
                System.out.print(" ");
            }
            System.out.println("");
            --spacesCount;
        }
    }


}
