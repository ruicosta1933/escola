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
public class Nota {
    public static void main(String[] args) {
    int nota;
    
    
    Scanner leitura = new Scanner(System.in);
    
    System.out.println("Introduza uma nota -> ");
    
    nota=leitura.nextInt();
    
    if(nota>=10){
        System.out.println("Parabens");
    }
    else System.out.println("Marque novo exame");
    }
}
