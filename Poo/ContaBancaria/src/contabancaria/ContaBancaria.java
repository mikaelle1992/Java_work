package contabancaria;

public class ContaBancaria {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        
        conta1.AbrirConta("poupança");
         conta1.setNumConta(123456);
         conta1.setDono("mikaelle rubia pinheiro");
         conta1.Depositar(20);
         conta1.StatusConta();
         
         conta1.Sacar(50);
         
        System.out.println("Saldo " + conta1.getSaldo()); 
         conta1.Sacar(100);
         conta1.pagarMensal();
         System.out.println("Saldo " + conta1.getSaldo()); 
         
         System.out.println();
         conta2.AbrirConta("corrente");
         conta2.setNumConta(123445);
         conta2.setDono("Pedro Santos");
         conta2.Depositar(550);
         conta2.StatusConta();
         
         conta2.FecharConta();
    } 
}
