
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
public class exec11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int imc, peso , altura;
        
        Scanner leitura = new Scanner(System.in);
        
        System.out.println("Introduza o seu peso -> ");
        
        peso=leitura.nextInt();
        
        System.out.println("Introduza a sua altura -> ");
        
        altura=leitura.nextInt();
        
        imc=peso/altura^2;
        
         System.out.println("O seu imc -> " + imc);
        
    }
    
}
