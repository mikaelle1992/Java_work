
package heranca;

public class Aluno extends Pessoa {
   private int matricula;
   private String curso;
   private boolean situacao;

   
    public Aluno(int matricula, String curso) {
        
        this.matricula = matricula;
        this.curso = curso;
        this.situacao =  true;
    }

    @Override
    public String toString() {
        return "Aluno " +getName() + "\nIdade " + getIdade() + "\nsexo: "+getSexo() + "\nmatricula: " + matricula + ", \ncurso: " + curso + ", \nsituacao:" + situacao ;
    }
    
    
    public boolean isSituacao() {   
        return situacao;
    }

    public void setSituacao(boolean situação) {
        this.situacao = situação;
    }

    public void cancelarMatricula(){
       this.situacao = false;
        System.out.println("Matricula cancelada");
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
