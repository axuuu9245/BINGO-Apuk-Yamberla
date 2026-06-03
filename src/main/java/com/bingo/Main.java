package com.bingo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         String [][] bingo = new String[5][5];
            for(int i = 0; i < bingo.length; i++){
                for(int j = 0; j < bingo[i].length; j++){
                    int aux;
                    boolean repetido;
                do{
                    repetido = false;
                    aux = (int)(Math.random() * 100);

            for(int f = 0; f < bingo.length; f++){
                for(int c = 0; c < bingo[f].length; c++){
                    if(bingo[f][c] != null &&
                       Integer.parseInt(bingo[f][c]) == aux){
                        repetido = true;
                    }
                }
            }
        }while(repetido);
        bingo[i][j] = String.valueOf(aux);
    }
}
            
            for(int i=0;i<bingo.length;i++){
                for(int j=0;j<bingo[i].length;j++){
                    System.out.print(bingo[i][j]+"\t");
                }
                System.out.println();
            }

            while(true){
                System.out.println("Ingrese fila (0-4): ");
                int fila = sc.nextInt();
                System.out.println("Ingrese columna (0-4): ");
                int columna = sc.nextInt();

                if(fila >= 0 && fila < 5 && columna >= 0 && columna < 5){
                bingo[fila][columna] = "x";
                }else{
                System.out.println("Coordenadas inválidas.");
                }

                for(int i=0;i<bingo.length;i++){
                for(int j=0;j<bingo[i].length;j++){
                    System.out.print(bingo[i][j]+"\t");
                }
                System.out.println();
            }

            }


    }
}