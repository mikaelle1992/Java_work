/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhadinamica;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Mikaelle
 */
public class PilhaDinamica {    
    No topo;
    int qtd = 0;
   
    
   //empilhar 
    public void inserir(Object valor){
        // 
        No novoNo = new No(valor, topo);
        topo = novoNo;
        qtd++;
    }
    
    // desempilhar
    public Object excluir(){
        if(qtd != 0){
          Object temp = topo.getValor();
          topo = topo.getAnterior();
          qtd--;
          return temp;
        }else{
            JOptionPane.showMessageDialog(null,"pilha vazia");
            return null;
        }
    }
    
    // quant. da pilha 
    public void tamanhoDaFila(){
        System.out.println("Tamanho da pilha: "+ qtd);
    }
    
    public void imprimir(){
        No aux = topo;
        System.out.println("VALORES DA PILHA:");
         while(aux!=null){
        System.out.println(aux.getValor()+ "");
        aux = aux.getAnterior();
    }
    }
    
  
   
    public static void main(String[] args) {
        PilhaDinamica p1 = new PilhaDinamica();
        
        String  res;
        int num;
        Scanner tec = new Scanner(System.in);     
        
      System.out.println("Pilha:");
   
        do{
         System.out.println("Menu:\n1:Inserir :\n2:Remover \n3:Listar\n4:Tamanho da Pilha.");
        num = tec.nextInt();
         if(num == 1){
            do{
            System.out.println("Digite um valor: ");
             int valor = tec.nextInt();
             p1.inserir(valor);
             System.out.println("Valor inserido com sucesso! ");
             
             System.out.println("Deseja inserir outro valor [s/n]?");
              res = tec.next();
                        
            }while(res.equals("s"));
            
        }else if(num ==2){
            System.out.println(p1.excluir() + ", Removido com sucesso" );  
        }else if(num == 3){
           p1.imprimir(); 
        } else if(num == 4){
           p1.tamanhoDaFila();
        } 
         
            System.out.println("Deseja continuar no programa.[s/n]?");
            res = tec.next();
        }while(res.equals("s"));
         
        System.out.println("FIM");
        
        
    }
    
}
