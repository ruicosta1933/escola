
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
public class exec8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, produto;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Escreva os valores ->");
        produto=1;
        do{
            num=ler.nextInt();
            if(num%2==0 && num>0){
                produto=produto*num;
            }
        }while(num!=0);
        System.out.println("O produto é ->" + produto);
    }
    
}
