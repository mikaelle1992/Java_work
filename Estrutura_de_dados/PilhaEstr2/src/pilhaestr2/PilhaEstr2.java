/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhaestr2;

/**
 *
 * @author Mikaelle
 */
public class PilhaEstr2 {

   public int max =10;
   public int [] pilha = new int [max];
   public int topo; 
   
   
   public void construtor (){
       topo = -1;
   }
   
   public  boolean Pilha_vazia(){
       if(topo == -1){
           return true;
       }else{
           return false;
       }
   }
   
   public boolean Pilha_cheia(){
       if(topo == max-1){
            return true;
       }else{
            return false;
       }
   }
   
   
    public boolean Pilha_push(int valor){
        //push = empilhar;
        if(Pilha_cheia()){
            return false;
       }else{
            topo ++;
            pilha[topo]= valor;
               return true;
        }
    }
   
    
      public void Pilha_pop(int valor){
          //pop = desempilhar
          if(Pilha_vazia()){
              System.out.println("Pilha vazia");
              
          }else{
             int  valor1 = pilha[topo];
              topo--;
             System.out.println("valor "+ valor1 + " foi removido" );
          }
      }
      
       public void  Pilha_consulta(int valor){
           if(Pilha_vazia()){
                 System.out.println("Pilha vazia");
           }else{
                int num = topo;
                  System.out.println("O numero de consulta "+ pilha[topo]+" esta na  posição : " +num);
    }
       }
       
       public int Pilha_Qtd(){
               topo++;
           System.out.print("quantidade de itens na pilha:");
          return topo;
       }
       
          public void clear(){
        
          if(Pilha_vazia()){
              System.out.println(" Pilha ja esta vazia");
              
          }else{
              while(topo >0){
           
              topo--;
             System.out.println("removido :" +pilha[topo]);
             
              }
              System.out.println("quantidade :"+ topo);
          }
      }
       
       
    public static void main(String[] args) {
        
        PilhaEstr2 pilha = new PilhaEstr2();
        pilha.construtor();
        
        pilha.Pilha_push(2);
        pilha.Pilha_push(3);
        pilha.Pilha_push(35);
        pilha.Pilha_push(77);
       
        pilha.Pilha_pop(77);
        pilha.Pilha_consulta(3);
        
        System.out.println(pilha.Pilha_Qtd());
        
       pilha.clear();
    
     
       
    }
    
}
