package relacionclass;

import java.util.Random;


public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovado;

    
    public void marcarLuta(Lutador l1, Lutador l2){
            if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2 ){
                    setAprovado(true);
                    this.desafiante = l1;
                    this.desafiado = l2;
            }else{
                setAprovado(false);
            }      
       
    }
    
    public void lutar(){
      if(this.aprovado){
          System.out.println("####Desafiante####");
          this.desafiante.apresentar();
           System.out.println("####Desafiado####");
          this.desafiado.apresentar();
          
          Random aleatorio = new Random();
          int vencedor = aleatorio.nextInt(3);//0, 1, 2
          
          switch(vencedor){
              case 0://empate
                    System.out.println("Empate!!!!!");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                  break;
              case 1://desafiado ganha
                   System.out.println(this.desafiado.getNome() + "  Ganha a luta");
                   this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    
                  break;
              case 2://desafiante ganha
                   System.out.println(this.desafiante.getNome() + " Ganha a luta");
                   this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                  break;
                  
          }
      }else{
          System.out.println("Essa luta nao pode acontecer !");
      }
    }
    /**
     * @return the desafiante
     */
    
    
    public Lutador getDesafiante() {
        return desafiante;
    }

    /**
     * @param desafiante the desafiante to set
     */
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    /**
     * @return the dasafiado
     */
    public Lutador getDesafiado() {
        return desafiado;
    }

    /**
     * @param dasafiado the dasafiado to set
     */
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    /**
     * @return the rounds
     */
    public int getRounds() {
        return rounds;
    }

    /**
     * @param rounds the rounds to set
     */
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    /**
     * @return the aprovado
     */
    public boolean isAprovado() {
        return aprovado;
    }

    /**
     * @param aprovado the aprovado to set
     */
    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
    
    
}
