/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.helloworld;

import java.util.Scanner;

/**
 *
 * @author ruicosta
 */
public class HelloWorld {
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        int num1, soma, i;
        float media;
        
        Scanner leitura = new Scanner(System.in);
        
        soma=0;
        media=0;
        
        for(i=1; i<=5; i++){
            System.out.println("Introduza um numero -> ");
            num1=leitura.nextInt();
            soma=soma+num1;
        }
        media=(float)soma/5;
        System.out.println("A media dos 5 numeros -> " + media);
    }
 }
