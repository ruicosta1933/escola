
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
public class exec4 {

    /**
     * @param args the command line arguments
     */
    static int[][] matriz = new int[4][3];
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        for(int i=0; i<4;i++){
            for(int j=0; j<3;j++){
            System.out.println("Introduza os valores  -> ");
            matriz[i][j]=ler.nextInt();
        }
        }
        for(int i=0; i<4;i++){
            System.out.println(" ");
            for(int j=0; j<3;j++){
            System.out.print(matriz[i][j]+" ");
            
        }
        }
        
    }
    
}
