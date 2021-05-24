
package admescola;

public class Bolsista extends Aluno {
    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    public void renovarBolsa(){
        System.out.println("Renovando  a bolsa de " + this.name);
    }
    @Override
    public void pagarMensalidade(){
        System.out.println(this.name + " é bolsista! Pagamento facilitado ");
    }
    
}
