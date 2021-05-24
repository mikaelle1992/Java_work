
package admescola;


 
public class AdmEscola {

   
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setName("Andre santos");
        a1.setIdade(18);
        a1.setSexo("M");
        a1.setMatricula(12347);
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setName("Marcos santana da silva");
        b1.setIdade(19);
        b1.setSexo("M");
        b1.setBolsa(25.5f);
        b1.setMatricula(12358);
        b1.pagarMensalidade();
    }
    
}
