/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leitura;

/**
 *
 * @author Mikaelle
 */
public class Leitura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Pessoa [] p = new Pessoa[2];
         Livro [] l = new Livro [2];
         
         p[0] = new Pessoa ("Ana",32,"F");
         p[1] = new Pessoa ("Pedro",29,"M");
         
         l[0] = new Livro ("titulo 1"," autor 1",250, p[1]);
         l[1] = new Livro ("titulo 2"," autor 2",320,p[0]);
         
         
         System.out.println(l[0].toString());
        // l[0].abrir();
         l[0].avancarPag();
         l[0].avancarPag();
         
         System.out.println(l[0].getPagAtual());
         l[0].abrir();
         l[0].folhear(251);
    }
    
}
