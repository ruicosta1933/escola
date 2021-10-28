
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
public class exec13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float bi,sexo, ano, alcool, menos_30, per_m,num_cond, perc_30,per_alc,num_alcool,num_m;
        
        
        Scanner in = new Scanner(System.in);
        
        bi=sexo=num_m=ano=num_alcool=alcool=menos_30=num_cond=per_m=perc_30=per_alc=0;
        
        do{
            
        System.out.println("Digite o numero de cc: ");
        bi=in.nextFloat();
            if(bi!=0){
                num_cond++;
                System.out.println("Digite o ano : ");
                ano=in.nextFloat();
                System.out.println("Digite o sexo 0 = Masc/1 = Fem : ");
                sexo=in.nextFloat();
                System.out.println("Digite o alcool : ");
                alcool=in.nextFloat();
                
                if(2020-ano<30){
                    menos_30++;
                }
                if(sexo==1){
                    num_m++;
                }
                if(sexo==0 && alcool>0.5){
                    num_alcool++;
                }
            }
        
        
        } while(bi!=0);
        
        if(num_cond!=0){
            perc_30=menos_30/num_cond;
            per_m=num_m/num_cond;
            per_alc=num_alcool/num_cond;
            
        }
        System.out.println("% com menos de 30 anos : " + perc_30);
        System.out.println("% de mulheres : " + per_m);
        System.out.println("% com alcools : " + per_alc);
    }
    
}
