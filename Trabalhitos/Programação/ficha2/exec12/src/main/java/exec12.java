
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ruicosta1
 * 
 */
public class exec12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        int numero=in.nextInt();
        double numeroDouble=numero;
        if ((numeroDouble/numeroDouble)==(numero/numero)){
            if(numeroDouble/2!=numero/2 || numero==2){
                System.out.println("Este numero é primo!");
            } else {
                System.out.println("Este numero não é primo!");
            }
        } else {
            System.out.println("Numero não é primo!");
        }
    }
    
}
