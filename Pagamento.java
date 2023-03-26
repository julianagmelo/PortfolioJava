
package com.mycompany.pagamento;
import java.util.Scanner;
/**
 *
 * @author jgfro
 */
public class Pagamento {

    public static void main(String[] args) {
        Scanner pgto =new Scanner(System.in);
    int vinicial, f1;  
        System.out.println("Informe o valor do produto");
         vinicial = pgto.nextInt ();
         System.out.println("Informe a forma de pgto : \n 1- À vista em dinheiro ou cheque; \n 2- À vista no cartão de credito; \n 3- 2x com entrada; \n 4- 2x sem entrada. ");
         f1= pgto.nextInt();
        
         switch (f1){
             case 1:
                 System.out.println("O valor será de:" + vinicial*0.9);
             break; 
             case 2:
                 System.out.println("O valor será de:" +vinicial*0.85);
             break;
             case 3:
                 System.out.println("O valor será de:" +vinicial);
             break;
             case 4: 
                 System.out.println("O valor será de:" +vinicial*1.1);
            break;
             default:
                     System.out.println("Opção inválida!");
    
                     
         }
    
}
}
 