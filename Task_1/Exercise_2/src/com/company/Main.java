package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter top number to get all perfect numbers => ");
        Scanner scan = new Scanner(System.in);
        System.out.println(perfectNumberFinder(scan.nextInt()));
    }

    public static String perfectNumberFinder(int fin){
        int temp;
        String ans = "";
        for(int i = 2; i < fin; ++i){
            temp = 1;
            for(int j = 2; j < i; ++j){
                if(i%j == 0){
                    temp += j;
                }
            }
            if(temp == i){
                ans += temp;
                ans +=' ';
            }
        }
        return ans;
    }

}
