package com.mycompany.peso;
import java.util.Scanner; 

/**
 *
 * @author Juliana Melo 
 */
public class Peso {

    public static void main(String[] args) {
        Scanner s= new Scanner (System.in); 
       float g, a; 
        System.out.println("Informe sua altura em metros");
        a= s.nextFloat(); 
        System.out.println("Informe seu genero, sendo: \n 1 - Mulher; \n 2 - Homem;");
        g=s.nextFloat();
        
        if (g==1){
            System.out.println("O seu peso ideal é:"+ ((62.1*a)-44.7));
        }
        else {
            if (g==2){
                System.out.println("O seu peso ideal é"+ ((72.7*a)-58));
            }
        }
    }
    
}