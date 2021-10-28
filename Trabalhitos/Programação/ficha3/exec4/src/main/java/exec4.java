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
    public static void main(String[] args) {
        // TODO code application logic here
        char[] nome = {'A', 'n', 'a', ' ', 'S', 'a', 'n', 't', 'o', 's', '\n'};
        char[] apelido = new char[6] ;
        int conta, conta_c;
        conta=0;
        conta_c=0;
        for(int i=0; i<nome.length; i++){
            if(nome[i] == ' ' ){
                for(int j=0; j<apelido.length; j++){
                    i++;
                apelido[j]=nome[i];
                }
            }
        if(nome[i] == 'a' | nome[i] == 'A' |  nome[i] == 'e' | nome[i] == 'i' | nome[i] == 'o' | nome[i] == 'u'){
            conta++;
        }
        else conta_c++;
        
        }
        for(int i=0; i<apelido.length; i++){
        
        System.out.println(apelido[i]);
        }
        
      
        
        System.out.println("O numero de vogais é -> " + conta);
        System.out.println("O numero de consoantes é -> " + conta_c);
    }
    
}
