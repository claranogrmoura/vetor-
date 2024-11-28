/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetoe;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Vetor3 {
  
public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a nota do " + (i + 1) + "º aluno: ");
            notas[i] = scanner.nextDouble();
        }

        double media = soma / 5;

        int acimaDaMedia = 0;
        int abaixoDaMedia = 0;
        int naMedia = 0;

        for (int i = 0; i < 5; i++) {
            if (notas[i] > media) {
                acimaDaMedia++;
            } else if (notas[i] < media) {
                abaixoDaMedia++;
            } else {
                naMedia++;
            }
        }

        System.out.printf("Média das notas: %.2f\n", media);
        System.out.println("Alunos acima da média: " + acimaDaMedia);
        System.out.println("Alunos abaixo da média: " + abaixoDaMedia);
        System.out.println("Alunos exatamente na média: " + naMedia);

        scanner.close();
    }
}
