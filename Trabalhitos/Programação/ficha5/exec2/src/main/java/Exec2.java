
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
public class Exec2 {

    /**
     * @param args the command line arguments
     */
    static int[] temp = new int[7];
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int menor=0, dia = 0, maior=0, dia_m = 0, media=0, soma=0, tem=0, j;
        
        for(int i=0; i<temp.length;i++){
            System.out.println("Introduza a temperatura do dia " + i + " -> ");
            temp[i]=ler.nextInt();
        }
        
        
        for(int i=0; i<temp.length;i++){
            if(temp[i] < menor){ 
				menor = temp[i];
                                dia = i;
			}
            if(temp[i] > maior){ 
				maior = temp[i];
                                dia_m = i;
			}
            soma+=temp[i];
            
            if(temp[i] < media){ 
			tem++;
                        
			}
        }
        
        
        dia=dia+1;
        System.out.println("A menor temperatura foi -> " + menor + "°C no dia -> " + dia);
        
        
        dia_m=dia_m+1;
        System.out.println("A menor temperatura foi -> " + maior + "°C no dia -> " + dia_m);
        
        
        media=soma/temp.length;
        System.out.println("A media da temperatura semanal é de -> " +media);
     
    
        System.out.println("Houve "+tem +" dias com temperatura inferior à media semanal");
        
    }
    
}
