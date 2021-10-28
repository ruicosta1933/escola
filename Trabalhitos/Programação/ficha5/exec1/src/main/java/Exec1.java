
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
public class Exec1 {

    /**
     * @param args the command line arguments
     */
    static int[] lista = new int[10];
    
    public static void main(String[] args) {
        int opcao=0;
        Scanner ler = new Scanner(System.in);
        do{
            System.out.println("1 - Carregar Array");
            System.out.println("2 - Pesquisa");
            System.out.println("3 - Ler Array");
            System.out.println("4 - Ordem Crescente");
            System.out.println("5 - Ordem Decrescente");
            System.out.println("6 - Somar tudo");
            System.out.println("7 - Maior valor");
            System.out.println("8 - Menor valor");
            System.out.println("0 - Terminar");
            System.out.println("Introduza a sua opcao");
            opcao=ler.nextInt();
            switch (opcao) {
            case 1:
                inicializa();
                break;
            case 2:
                procura();
                break;
            case 3:
                ler();
                break;
            case 4:
                ordena();
                break;
            case 5:
                ordena_d();
                break;
            case 6:
                soma();
                break;
            case 7:
                maior();
                break;
            case 8:
                menor();
                break;
        } 
        }while(opcao!=0);
        
        
    }
    
    public static void inicializa(){ //inicializa todas as posiçoes a -1
        
         for (int i=0;i<lista.length;i++){
            lista[i]=-1;
        }
        
    }
    public static void imprime(){ //imprime o conteudo do array
        
         for (int i=0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
        
    }
    public static void ler(){ //pede ao utilizador o conteudo para o array
        Scanner ler = new Scanner(System.in);
        
        for(int i=0; i<lista.length;i++){
            System.out.println("Introduza o numero para a posição " + i + " -> ");
            lista[i]=ler.nextInt();
        }
        
    }
    public static void procura(){
        
        Scanner leitura = new Scanner(System.in);
        int numero, index, i;
        
        System.out.println("Numero para procurar  -> ");
            numero=leitura.nextInt();
        index=-1;
        i=0;
        while(index==-1 && i<lista.length){
            if(lista[i]==numero){
                index=1;
            }
            i++;
        }
        
        if(index==-1){
            System.out.println("Nao existe");
        }
        else System.out.println("O numero " + numero +"existe na posicao -> " + index);
            
    }
    public static void ordena(){
        int i, j , aux ;
        
        for (i=0;i<lista.length;i++){
            for(j=i+1; j<lista.length;j++){
                if(lista[j]<lista[i]){
                    aux=lista[i];
                    lista[i]=lista[j];
                    lista[j]=aux;
                }
            }
        }
        for ( i=0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
        
    }
        public static void ordena_d(){
        int i, j , aux ;
        
        for (i=0;i<lista.length;i++){
            for(j=i+1; j<lista.length;j++){
                if(lista[j]>lista[i]){
                    aux=lista[i];
                    lista[i]=lista[j];
                    lista[j]=aux;
                }
            }
        }
        for ( i=0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
        
    }
        
    public static void soma(){
        int soma=0;
        for(int i=0; i<lista.length;i++){
            soma+=lista[i];
        }
        System.out.println("A soma dos elementos é de -> " +soma);
    }
    
    public static void maior(){
        int maior=0;
        for(int i=0; i<lista.length;i++){
            if(lista[i] > maior){ 
				maior = lista[i];
			}
        }
        System.out.println("O maior elemento é -> " + maior);
    }
    
    public static void menor(){
        int menor=0;
        for(int i=0; i<lista.length;i++){
            if(lista[i] < menor){ 
				menor = lista[i];
			}
        }
        System.out.println("O menor elemento é -> " + menor);
    }
    
}
