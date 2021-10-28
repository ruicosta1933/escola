
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
public class exec2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] paises = new String[5];
        Scanner ler = new Scanner(System.in);
        for(int i=0; i<paises.length;i++){
            System.out.println("Introduza o numero para a posição " + i + " -> ");
            paises[i]=ler.next();
        }
        
         Arrays.sort(paises);
        
        
        for(int i=0; i<paises.length;i++){
            System.out.println(paises[i]);
        }
        
    }
    
}
