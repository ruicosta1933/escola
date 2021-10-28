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
        // TODO code application logic here
        int[] lista = {12, 5, -21, 10, -345, 22, 50, -125, 80, -1};
        int multiplicacao, conta, maior;
        multiplicacao=1;
        conta=maior=0;
        for(int i=0; i<10;i++){
            if(lista[i]>maior){
                maior=lista[i];
            }
            if(lista[i]>=0){
                multiplicacao= multiplicacao * lista[i];
            }
            if(lista[i]<0){
            conta++;
            }
        }
        System.out.println("A multiplicação é -> " + multiplicacao);
        System.out.println("O numero de negativos é -> " + conta);
        System.out.println("O maior numero é -> " + maior);
    }
    
}
