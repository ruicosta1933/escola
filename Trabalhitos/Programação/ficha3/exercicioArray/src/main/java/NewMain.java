/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ruicosta
 */
public class NewMain {
    static int[] numeros[];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        imprime();
        
    }
    
    public static void imprime(){
        int i;
        for (i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
    }
    
}
