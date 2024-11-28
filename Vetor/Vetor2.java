/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetor2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Vetor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = scanner.nextLine();
        }
//chamar o nome
        System.out.print("Digite o nome a ser buscado: ");
        String nomeBusca = scanner.nextLine();

        // Buscar o nome no vetor
        boolean encontrado = false;
        for (int i = 0; i < 10; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBusca)) {  // Comparação sem diferenciar maiúsculas e minúsculas
                System.out.println("O nome \"" + nomeBusca + "\" foi encontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("O nome \"" + nomeBusca + "\" não foi encontrado.");
        }

        scanner.close();
    }
}
