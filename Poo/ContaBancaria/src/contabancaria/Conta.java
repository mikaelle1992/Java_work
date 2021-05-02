package contabancaria;

public class Conta {

    private int numConta;
    private String tipo;
    private String dono;
    private int saldo;
    private boolean status;

    public Conta() {
        this.saldo = 0;
        this.status = false;
    }

    public void AbrirConta(String tipo) {
        setTipo(tipo);
        setStatus(true);

        if (tipo == "poupança") {
            this.saldo = 100;
        } else if (tipo == "corrente") {
            this.saldo = 50;
        } else {
            System.out.println("Operação invalida!");
        }

    }

    public void FecharConta() {
        
        if (this.saldo > 0) {
            System.out.println("Saldo em Conta, por favor saque o valor da conta para finalizar");

        } else if (this.saldo < 0) {
            System.out.println("Conta em Débito ");
        } else {
            setStatus(false);
            System.out.println("Conta encerrada");
        }
    }

    public void Depositar(int valor) {
        if (isStatus() == true) {
            setSaldo(getSaldo() + valor);
            System.out.println("Deposito realizado com sucesso");
        } else {
            System.out.println("Impossivel Depositar");
        }
    }

    public void Sacar(int valor) {
        if (isStatus() == true) {
            if (getSaldo() == valor || getSaldo() > valor) {
                setSaldo(getSaldo() - valor);
                System.out.println("saque realizado com sucesso");
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Conta inativa");
        }
    }
     public void pagarMensal(){
         int v =0;
         if (isStatus() == true) {
            if (getTipo() == "poupança") {
                v = 15;
        }else if (getTipo() == "corrente"){
                v = 10;
           }
        if(getSaldo() > v || getSaldo() == v){
            setSaldo(getSaldo() - v);
            System.out.println("Mensalidade paga");
        }    
        }else{
            System.out.println("Conta inativa");
        }
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
    
    public void StatusConta(){
        System.out.println("Numero da conta : " +this.numConta + " \nDono : " + this.dono + " \nTipo: " + this.tipo + " \nSaldo: " + this.saldo + "\nStatus:" + this.status);
    }
    
}
