package contabancaria;

public class Conta {
    private int numConta;
    private String tipo;
    private String dono;
    private int saldo;
    private boolean status;

     public Conta( ){
      this.saldo = 0;
      this.status = false;
    }
    
    public void AbrirConta(String tipo,String dono){
        
        if(tipo == "poupança"){
            this.saldo = 100;
        }else if(tipo == "corrente"){
            
        }else{
            System.out.println("Operação invalida!");
        }
      this.dono = dono;  
    }
    
      public void FecharConta(){
        
    }
    
     public void Depositar(){
        
    } 
     
     public void Sacar(){
        
    }
     
    /**
     * @return the numConta
     */
    public int getNumConta() {
        return numConta;
    }

    /**
     * @param numConta the numConta to set
     */
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the dono
     */
    public String getDono() {
        return dono;
    }

    /**
     * @param dono the dono to set
     */
    public void setDono(String dono) {
        this.dono = dono;
    }

    /**
     * @return the saldo
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

   
    
    
}
