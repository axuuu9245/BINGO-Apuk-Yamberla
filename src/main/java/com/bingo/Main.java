package com.bingo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         int [][] bingo = new int[5][8];
            for(int i =0;i<bingo.length;i++){
                for(int j=0;j<bingo[i].length;j++){
                    bingo[i][j]=(int)(Math.random()*100);
                }
            }

            System.out.println("Bienvenidos al Juego de BINGO");
            
            for(int i=0;i<bingo.length;i++){
                for(int j=0;j<bingo.length;j++){
                    System.out.print("  "+bingo[i][j]+" ");
                }
                System.out.println();
            }

        


    }
}