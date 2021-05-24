
package heranca;

public class Heranca {

    public static void main(String[] args) {
     
        
        Pessoa p1 = new Pessoa();
        Aluno a1 = new Aluno(12456, "informatico");
        Professor pro1 = new Professor("matematica", 1800);
        
        p1.setName("ana");
        p1.setIdade(25);
        p1.setSexo("F");
        
        a1.setName("pedro");
        a1.setIdade(20);
        a1.setSexo("M");
        a1.fazerAniversario();
        
        
        pro1.setName("marcos");
        pro1.setIdade(37);
        pro1.setSexo("M");
        pro1.receberAum(200);
        
        
        System.out.println(a1.toString()); 
        
        
        
    }
    
}
