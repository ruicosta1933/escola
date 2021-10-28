
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
    static int[] notas = new int[20];
    static String[] nome = new String[20];
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int menor=0, dia = 0, maior=0, dia_m = 0, media=0, soma=0, tem=0, j;
        
        for(int i=0; i<notas.length;i++){
            System.out.println("Introduza o nome do aluno -> ");
            nome[i]=ler.next();
            System.out.println("Introduza a nota do aluno "+ nome[i] +" -> ");
            notas[i]=ler.nextInt();
        }
        
        
        for(int i=0; i<notas.length;i++){
            soma+=notas[i];
            
        }
        media=soma/notas.length;
        for(int i=0; i<notas.length;i++){
            
            if(notas[i] > media){ 
			tem++;
                        System.out.println("O aluno "+ nome[i] +" tem nota "+notas[i]);
			}
            
            
            
            
        }
        System.out.println("A media da turma é de -> " +media);
        
        System.out.println("Houve "+tem +" alunos com nota superior à media semanal");
        
        
        
     
    
        
        
    }
    
}
