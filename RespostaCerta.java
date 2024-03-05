package com.br.beecrowd;

import java.util.Scanner;

public class RespostaCerta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Perguntas: ");
        int qdtPerguntas = sc.nextInt();


        for (int i = 1; i <= qdtPerguntas; i++) {
            int respostas = sc.nextInt();
            System.out.println("resposta " + i + ": " + respostas);
        }
    }
}
