
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
public class exec3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int encontrado = 0;
        String[] nome = new String[1];
        String[] nomes = new String[]{"João", "Maria", "José", "Ana", "Francisco"};
        Scanner ler = new Scanner(System.in);
        
            System.out.println("Introduza um nome -> ");
            nome[1]=ler.next();
           
        for(int i=0;i<nomes.length;i++){
            if(nome[1] == nomes[i]){
                encontrado = 1;
            }
        }
        
        if(encontrado == 1 ){
            System.out.println("Nome encontrado ");
        }
        else System.out.println("Nome nao encontrado ");
        
    }
    
}
