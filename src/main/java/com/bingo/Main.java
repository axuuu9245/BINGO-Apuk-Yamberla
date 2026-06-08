package com.bingo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[][] bingo = new String[6][];

        int min = 3;
        int max = 5;

        for (int i = 0; i < bingo.length; i++) {
            int random = (int) (Math.random() * (max - min + 1)) + min;
            bingo[i] = new String[random];
            for (int j = 0; j < bingo[i].length; j++) {
                int aux;
                boolean repetido;
                do {
                 repetido = false;
                 aux = (int) (Math.random() * 50) + 1;
                    for (int f = 0; f < bingo.length; f++) {
                        if (bingo[f] == null) {
                            continue;
                        }
            for (int c = 0; c < bingo[f].length; c++) {
                if (bingo[f][c] != null &&
                     Integer.parseInt(bingo[f][c]) == aux) {
                        repetido = true;
                        }
                    }
                }
                } while (repetido);
            bingo[i][j] = String.valueOf(aux);
         }
        }
        System.out.print("Ingrese el número sorteado: ");
        String numero = sc.next();
        boolean encontrado = false;
        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo[i].length; j++) {
                if (bingo[i][j].equals(numero)) {
                 bingo[i][j] = "X";
                    encontrado = true;
                }
            }
        }
            if (encontrado) {
                System.out.println("Número encontrado.");
            } else {
             System.out.println("Número no encontrado.");
            }
    }
}