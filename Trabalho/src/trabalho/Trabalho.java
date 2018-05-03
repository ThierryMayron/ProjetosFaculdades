/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.util.Scanner;

/**
 *
 * @author thierry.59521
 */
public class Trabalho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);  
        int valor[] = new int[4];  
        System.out.print("Digite o 1º valor: ");  
        valor[0] = sc.nextInt();  
        int menor = valor[0]; int maior = valor[0];
        for(int i = 1; i < valor.length; i++){  
            System.out.print("Digite o " +(i+1)+"º valor: ");  
            valor[i] = sc.nextInt();  
            if(valor[i] > maior){   
                maior = valor[i];  
            }  
        }  
        for (int j = 1; j < valor.length; j++) {  
            if(valor[j] < menor){  
                menor = valor[j];  
            }  
        }
        
        System.out.println("Maior valor = "+ maior);
    }
    
    
}
