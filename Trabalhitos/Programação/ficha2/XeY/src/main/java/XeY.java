
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
public class XeY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y;
        
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Escreva o X ->");
        x=ler.nextInt();
        
        if(x<1){
            System.out.println("O Y é -> " + x);
        }
        else if(x==1){
            System.out.println("O Y é -> 0");
        }
        else {
            System.out.println("O Y é -> " + 2*x);
        }
    }
    
}
