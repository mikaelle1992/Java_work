
package filadinamica;
   
import java.util.Scanner;


public class FilaDinamica {

    private static void Switch(int num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 No inicio = null;
 No fim =null;
 int qtd;
 
 public void inserir(int valor){
     No fila = new No();
     fila.setValor(valor);
     
     if(inicio == null){
         inicio = fila;
         fim = fila;
         fila.setProximo(null);
     }else{
         fim.setProximo(fila);
         fila.setProximo(null);
         fim = fila;
         
     }
     qtd++;
     
 }
 
  public void imprimir(){
       No aux = inicio;
       
       while(aux!= null){
           System.out.println("Valor: " + aux.getValor());
           aux = aux.getProximo();
       }
  }
  
   public int excluir(){
      No aux = inicio;
      if(inicio == fim && inicio != null){
          inicio =  null;
          fim = null;
      }else{
          inicio = inicio.getProximo();
      }
      qtd--;
      return aux.getValor();
  }
   
   public void  tamanhoDaFila(){
       System.out.println("Tamanho da fila " + qtd);
   }

    public static void main(String[] args) {
        
        FilaDinamica f1 = new FilaDinamica();
        String  res;
        int num;
        Scanner tec = new Scanner(System.in);
        
        
        System.out.println("Fila:");
      //  System.out.println("Menu:\n1:Inserir valor na fila:\n2:Remover valor na fila\n3:Listar a Fila\n4:Consultar tamanho da fila.");
      //  num = tec.nextInt(); 
        do{
         System.out.println("Menu:\n1:Inserir :\n2:Remover \n3:Listar\n4:Tamanho da fila.");
        num = tec.nextInt();
         if(num == 1){
            do{
            System.out.println("Digite um valor: ");
             int valor = tec.nextInt();
             f1.inserir(valor);
             System.out.println("Valor inserido com sucesso! ");
             
             System.out.println("Deseja inserir outro valor [s/n]?");
              res = tec.next();
                        
            }while(res.equals("s"));
            
        }else if(num ==2){
            System.out.println(f1.excluir() + " Removido com sucesso" );  
        }else if(num == 3){
           f1.imprimir(); 
        } else if(num == 4){
           f1.tamanhoDaFila();
        } 
         
            System.out.println("Deseja continuar no programa.[s/n]?");
            res = tec.next();
        }while(res.equals("s"));
         
        System.out.println("FIM");
       
        
    }
 //To change body of generated methods, choose Tools | Templates.
    
    
}
