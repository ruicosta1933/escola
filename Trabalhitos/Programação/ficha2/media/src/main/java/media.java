
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ruicosta
 */
public class media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor,soma;
        float media;
        Scanner ler = new Scanner(System.in);
        soma = 0;
        for(int i=0; i<5; i++){
            System.out.println("Escreva um valor ->");
            valor=ler.nextInt();
            soma=+soma + valor;
        }
        
        media =  soma / 5;
        
        System.out.println("A media dos 5 valores é ->" + media);
        
        }
        
    }
    

