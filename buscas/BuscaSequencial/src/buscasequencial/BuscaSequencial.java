/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscasequencial;

import java.util.Scanner;

/**
 *
 * @author Mikaelle
 */
public class BuscaSequencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vetor = new int[6];
        String resp;
        int p = 0;
        boolean achou = false;

        Scanner tec = new Scanner(System.in);

            
        System.out.println("Digite 10 numeros:");
        for(int i = 0;i< vetor.length;i++){
            System.out.print("valor "+(i+1)+ ":");
            int valor = tec.nextInt(); 
            vetor[i] = valor;
        }

        do {
            System.out.print("Qual valor quer burcar? " );
            int busca = tec.nextInt();

            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] == busca) {
                    p = i;
                    achou = true;   
                    break;
                }
            }

            if (achou) {
                System.out.println("valor encontado na posição : " + p);

            } else {
                System.out.println("valor não encontado...");
            }

            System.out.print(" Deseja inserir outro valor [s/n]?");
            resp = tec.next();

        }while(resp.equals("s"));
        
        
    }  

}
