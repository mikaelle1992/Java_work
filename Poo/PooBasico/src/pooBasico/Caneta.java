
package pooBasico;


public class Caneta {
   public String modelo;
   public String cor;
   private float ponta;
   protected int carga; 
   public  boolean tampada;
  
    public void status(){
        System.out.println("Caneta: " +this.modelo +", \nCor: "+this.cor+", \nPonta : "+this.ponta+",\nCarga :"+ this. carga);
    }
    
    public void ribiscar(){
        if(tampada){
            System.out.println("erro!, destampe a caneta");
        }else{
            System.out.println("Rabiscando....");
        }
    }
    
   public void tampar(){
        tampada = true;
    }
    public void destampar(){
        tampada = false;
    }
    
    
}
