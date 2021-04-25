/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diadasemana;

import java.util.Scanner;

/**
 *
 * @author Mikaelle
 */
public class DiaDaSemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
        System.out.print("Digite um valor de 1 á 7:");
        int num = teclado.nextInt();
        
        String dia;
        switch(num){
        
        case 1:
            dia = "Domingo!";
            break;
        case 2:
            dia = "segunda!";
            break;
         case 3:
            dia = "Terça!";
            break;
         case 4:
            dia = "Quarta!";
            break;
        case 5:
            dia = "Quinta!";
            break;
        case 6:
            dia = "Sexta!";
            break;
        case 7:
            dia = "Sabado!";
            break;
        default:
            dia ="valor incorreto digite de 1 á 7.";
            break;
    }
      System.out.print(dia);  
    }
    
    
}
