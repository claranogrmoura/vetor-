/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vetor1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class vector1{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int[] num = new int [10];
        int soma=0;
        double media;
        System.out.println("Digite 10 números");
        for(int i=0; i<10; i++){
           System.out.print("Numero" + (i) + ":");
           num [i] = scanner.nextInt();
           soma += num [i];
           
        }
        media = soma/10.0;
        System.out.println("SOMA" + soma);
        System.out.println("Media" + media);
    }
    
}
