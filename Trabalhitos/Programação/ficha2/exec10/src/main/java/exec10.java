
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
public class exec10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor, maior;
        
        Scanner ler = new Scanner(System.in);
        
        maior=0;
        
        System.out.println("Escreva os valores ->");
        
        do{
            valor=ler.nextInt();
            if(valor > maior){
                maior=valor;
            }
        }while(valor>0);
        
        System.out.println("O maior valor foi -> " + maior);
    }
    
}
