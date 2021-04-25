/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somaestruturaderepeticao;

import java.util.Scanner;

/**
 *
 * @author Mikaelle
 */
public class SomaEstruturaDeRepeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, s = 0;
        String resp;
        
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.print("Digite um numero:");
            n = teclado.nextInt();
            s +=n; // s = s +n;
            System.out.print("Deseja continuar ?[S/N]?");
            resp = teclado.next();
        }while(resp.equals("S"));
        System.out.print("A soma dos numeros digitados é :" + s );
      }
    
    
}
