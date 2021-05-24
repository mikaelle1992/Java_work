
package heranca;

public class Professor extends Pessoa {
  
     private String especialid;
     private float salario;

    public Professor(String especialid, float salario) {
        this.especialid = especialid;
        this.salario = salario;
    }

    
    public void receberAum(float valor){
        setSalario(getSalario()+ valor);
    }
      
    public String getEspecialid() {
        return especialid;
    }

    public void setEspecialid(String especialid) {
        this.especialid = especialid;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
      
      
}
