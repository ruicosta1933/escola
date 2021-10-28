/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aumento_percentual.preco;

import java.util.Scanner;

/**
 *
 * @author ruicosta
 */
public class aumento {
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        int  passado, atual;
        float valor, percentagem;
        
        Scanner leitura = new Scanner(System.in);
        
        System.out.println("Introduza o preco do ano passado -> ");
        
        passado=leitura.nextInt();
        
        System.out.println("Introduza o preco atual -> ");
        
        atual=leitura.nextInt();
        
        percentagem = (atual/passado);
        
        valor = percentagem*100;
        
        System.out.println(passado + " - " + atual + " - " + percentagem);
        
        if(percentagem>0.5){
            System.out.println("Aumento Excessivo");
    }
        System.out.println("O aumento foi de -> "+ percentagem*10 + "%");
 }
}
