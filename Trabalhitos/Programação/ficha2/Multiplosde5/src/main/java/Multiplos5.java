
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
public class Multiplos5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor1, valor2;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Escreva o primeiro valor ->");
        valor1=ler.nextInt();
        System.out.println("Escreva o segundo valor ->");
        valor2=ler.nextInt();
        for(int i=valor1; i<=valor2;i++){
            if(i%5==0){
                System.out.println(i);
            }
        }
    }
    
}
