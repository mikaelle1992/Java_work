package pooBasico;

public class PooBasico {
    
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        
        c1.modelo = "bic";
        c1.cor = "azul";
      //  c1.ponta = 0.6f;
        c1.carga = 80;
        c1.tampada = false;
     
        c1.status();
        c1.ribiscar();
        c1.tampar();
        c1.ribiscar();
    }
    
}
