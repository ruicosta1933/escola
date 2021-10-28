
import static java.lang.System.in;
import java.lang.reflect.Array;
import java.util.Arrays;
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
public class exec1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[10];
        for(int i=0; i<numeros.length;i++){
            
            System.out.println("Introduza o numero para a posição " + i + " -> ");
            numeros[i]=ler.nextInt();
            
       
        }
        
        Arrays.sort(numeros);
        
        for(int i=0; i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
        
        
    }
    
}
