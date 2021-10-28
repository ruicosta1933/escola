
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
public class novo {

    /**
     * @param args the command line arguments
     */
    static int[][] lista = new int[3][3];
    
    public static void main(String[] args) {
        int opcao=0;
        Scanner ler = new Scanner(System.in);
        do{
            System.out.println("1 - Inicializar matriz");
            System.out.println("2 - Imprimir matriz");
            System.out.println("3 - Ler matriz");
            System.out.println("4 - Procura matriz");
            System.out.println("5 - Ordena matriz");
            System.out.println("6 - Conta repetidos");
            System.out.println("0 - Terminar");
            System.out.println("Introduza a sua opcao");
            opcao=ler.nextInt();
            switch (opcao) {
            case 1:
                inicializa();
                break;
            case 2:
                imprime();
                break;
            case 3:
                ler();
                break;
            case 4:
                procura();
                break;
            case 5:
                ordena();
                break;
            case 6:
                repete();
                break;
        } 
        }while(opcao!=0);
        
        
    }
    
    public static void inicializa(){ //inicializa todas as posiçoes a -1
        
         for (int i=0;i<lista.length;i++){
             for (int j=0;j<lista.length;j++){
            lista[i][j]=-1;
             }
        }
        
    }
    public static void imprime(){ //imprime o conteudo do array

        for (int[] ints : lista) {
            for (int j = 0; j < lista.length; j++) {
                System.out.println(ints[j]);
            }
        }
        
    }
    public static void ler(){ //pede ao utilizador o conteudo para o array
        Scanner ler = new Scanner(System.in);
        
        for(int i=0; i<lista.length;i++){
            for(int j=0; j<lista.length;j++){
            System.out.println("Introduza o numero para a posição [" +i+ "]["+j+"] -> ");
            lista[i][j]=ler.nextInt();
        }
        }
        
    }
    public static void procura(){
        
        Scanner leitura = new Scanner(System.in);
        int numero, index, i,j, jindex;
        
        System.out.println("Numero para procurar  -> ");
            numero=leitura.nextInt();
        index=-1;
        jindex=0;
        i=0;
        j=0;
        
        while(index==-1 && i<lista.length){
            if(lista[i][j]==numero){
                index=i;
                jindex=j;
            }
            i++;j++;
        }
        
        if(index==-1){
            System.out.println("Nao existe");
        }
        else System.out.println("O numero " + numero +"existe na posicao -> ["+index+"]["+jindex+"]");
            
    }
    public static void ordena(){
        int i, j, l, c;

        for (i = 0; i < lista.length; i++) {
            for (j = 0; j < lista.length; j++) {
                
                for (l = 0; l < lista.length; l++) {
                    for (c = 0; c < lista.length; c++) {
                        
                        if (lista[i][j] < lista[l][c]) {
                            int aux = lista[i][j];
                            lista[i][j] = lista[l][c];
                            lista[l][c] = aux;
                        }
                    }
                }
            }
        }
        
    }
    public static void repete(){
        int guarda=0,k=0;
        
        int i, j, l, c;

        for (i = 0; i < lista.length; i++) {
            for (j = 0; j < lista.length; j++) {
                
                for (l = 0; l < lista.length; l++) {
                    for (c = 0; c < lista.length; c++) {
                        
                        if (lista[i][j] == lista[l][c]) {
                             k=1;
                        }
                    }
                }
            }
        }
        
        if(k==1){
            System.out.println("Tem " + k + " elementos repetidos");
        }
        else System.out.println("Nao tem repetidos");
        
    }
    
}
