package com.mycompany.planetas;
import java.util.Scanner;

public class Planetas {

    public static void main(String[] args) {
       Scanner s= new Scanner (System.in); 
       
        float peso;
        int planeta; 
        System.out.println("Informe seu peso");
        peso=s.nextFloat();
        System.out.println("Infome um planeta sendo: \n 1. Mercurio \n 2. Vênus \n 3. Marte \n 4. Jupiter \n 5. Saturno \n 6. Urano");
        planeta=s.nextInt();
        
        switch (planeta){
            case 1: 
                System.out.println("Seu peso em Marcurio será:"+ peso*0.37);
                break;
            case 2: 
                  System.out.println("Seu peso em Vênus será:"+ peso*0.88);
                  break;
            case 3: 
                  System.out.println("Seu peso em Marte será:"+ peso*0.38);
                  break;
            case 4:
                  System.out.println("Seu peso em Jupiter será:"+ peso*2.64);
                  break; 
            case 5: 
                  System.out.println("Seu peso em Saturno será:"+ peso*1.15);
                  break; 
            case 6: 
                  System.out.println("Seu peso em Urano será:"+ peso*1.17);
                  break;
            default: 
                  System.out.println("Opção inválida");
                  
        }
    }
    
}