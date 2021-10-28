/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ruicosta
 */
public class exec2v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] numbers = {{11,7,3},{-20,-23,63},{-22,501,10000}};
                int i, j,  soma;
                float media;
        
        soma = 0;
        media = 0;
        
        for(i=0; i<3; i++){
            
                for(j=0; j<3; j++){
            
                soma = soma + numbers[i][j];
        
        }
        
        }
        
        System.out.println("Soma é de -> " + soma);
        media=(float)soma/9;
        System.out.println("Media é de -> " + media);
        
    }
    
}
