package com.mycompany.tester;
import java.util.Scanner; 
public class Tester {

    
    public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    int prato, sobremesa, bebida, cal=0; 
 
        System.out.println("Informe o prato \n 1. Vegetariano; \n 2. Peixe; \n 3. Frango; \n 4. Carne.");
        prato =s.nextInt(); 
        System.out.println("Informe a sobremesa \n 1. Abacaxi; \n 2. Sorvete Diet; \n 3. Mousse Diet; \n 4. Mousse de Chocolate.");
        sobremesa=s.nextInt(); 
        System.out.println("Informe a bebida \n 1. Chá; \n 2. Suco de laranja; \n 3. Suco de melao; \n 4. Refrigerante diet.");
        bebida=s.nextInt();
        
        switch (prato){
            case 1: 
                cal=180; 
            break; 
            case 2:
                cal= 230;
            break; 
            case 3:
                 cal= 250;
            break; 
            case 4:
                cal= 350;
            break; 
            default:
             System.out.println("Opção inválida");
        }
         switch (sobremesa){
            case 1: 
                cal= cal+75; 
            break; 
            case 2:
                cal= cal+110;
            break; 
            case 3:
                 cal= cal+170;
            break; 
            case 4:
                cal= cal+200;
                break; 
                default:
             System.out.println("Opção inválida");
        }
         switch (bebida){
            case 1:
                    cal= cal+20;
                    System.out.println("O total de calorias consumidas é:"+cal);
            break; 
            case 2:
                    cal= cal+70;
                    System.out.println("O total de calorias consumidas é:"+cal);
            break; 
            case 3:
                    cal= cal+100;
                    System.out.println("O total de calorias consumidas é:"+cal);
            break; 
            case 4:
                cal=cal+65; 
                System.out.println("O total de calorias consumidas é:"+cal);
            break; 
         default:
             System.out.println("Opção inválida");
         
                
        }
           
       
    }
}
