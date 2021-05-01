
package pooBasico;


public class Caneta {
   private String modelo;
   private String cor;
   private float ponta;
   private int carga; 
   private  boolean tampada;
  
   public  Caneta(String modelo,String cor,float ponta){
       this.setModelo(modelo);
       this.setCor(cor);
       this.setPonta(getPonta());
       this.setCarga(80);
       this.setTampada(true);
       rabiscar();
 
   }
  
   public void tampar(){
        setTampada(true);
    }
    public void destampar(){
        setTampada(false);
    }
  

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the ponta
     */
    public float getPonta() {
        return ponta;
    }

    /**
     * @param ponta the ponta to set
     */
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    /**
     * @return the carga
     */
    public int getCarga() {
        return carga;
    }

    /**
     * @param carga the carga to set
     */
    public void setCarga(int carga) {
        this.carga = carga;
    }

    /**
     * @return the tampada
     */
    public boolean isTampada() {
        return tampada;
    }

    /**
     * @param tampada the tampada to set
     */
    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    
      public void rabiscar(){
        if(isTampada()){
            System.out.println("erro!, destampe a caneta");
        }else{
            System.out.println("Rabiscando....");
        }
      }
           public void status(){
        System.out.println("Caneta: " +this.getModelo() +", \nCor: "+this.getCor()+", \nPonta : "+this.getPonta()+",\nCarga :"+ this.getCarga());
    }
        
    
}
