
package relacionclass;


public class Lutador {
    private String nome; 
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String Categoria;
    private int vitoria, derrotas, empates;
   
    public Lutador (String nome,String nacio, int idade,float altura, float peso, int vitoria ,int derrotas, int empates){
        this.nome= nome; 
        this.nacionalidade=nacio;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitoria= vitoria;
        this.derrotas = derrotas ; 
        this.empates = empates;
 
    }
    
    public void apresentar(){
        System.out.println("----------------------------------");
        System.out.println("Apresentamos o Lutador: "+ getNome());
        System.out.println("Diretamente de " + getNacionalidade() + "\nCom " +getIdade() + "anos." );
        System.out.println(getAltura() +  " m de altura ");
        System.out.println("Pesando " + getPeso()+ "kg");
        System.out.println(getVitoria( ) + " Vitórias");
        System.out.println(getDerrotas() + " Derrotas ");
        System.out.println(getEmpates() +" Empates");
         
    }
    
      public void status(){
          System.out.println("----------------------------------");
          System.out.println(getNome() + " É peso " + getCategoria());
          System.out.println(getVitoria( ) + " Vitórias");
          System.out.println(getDerrotas() + " Derrotas ");
          System.out.println(getEmpates() +" Empates");
    }
      
        public void ganharLuta(){
            setVitoria(getVitoria()+1);
        
    }
         public void perderLuta(){
            setDerrotas(getDerrotas()+1);
        
    }
        
         public void empatarLuta(){
         setEmpates(getEmpates() + 1);
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nacionalidade
     */
    public String getNacionalidade() {
        return nacionalidade;
    }

    /**
     * @param nacionalidade the nacionalidade to set
     */
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
     public float getAltura() {
        return altura;
    }
    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */ 
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    /**
     * @return the Categoria
     */
    public String getCategoria() {
        return Categoria;
    }

    /**
     * @param Categoria the Categoria to set
     */
    private void setCategoria() {
        if(this.peso < 52.2){
            this.Categoria = "inválida";
        }else if(this.peso<= 70.3){
            this.Categoria = "Leve";
        }else if(this.peso<= 83.9){
            this.Categoria = "Médio";
        }else if(this.peso<= 120.2){
            this.Categoria = "Pesado";
        }else{
            this.Categoria = "inválida";
        }
    }

    /**
     * @return the vitoria
     */
    public int getVitoria() {
        return vitoria;
    }

    /**
     * @param vitoria the vitoria to set
     */
    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    /**
     * @return the derotas
     */
    public int getDerrotas() {
        return derrotas;
    }

    /**
     * @param derotas the derotas to set
     */
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    /**
     * @return the empates
     */
    public int getEmpates() {
        return empates;
    }

    /**
     * @param empates the empates to set
     */
    public void setEmpates(int empates) {
        this.empates = empates;
    }

    /**
     * @return the altura
     */
   
         
         
}
