package controleremoto;

public class ControleRemoto implements Controlador {
    private int vol;
    private boolean ligado;
    private boolean tocando;
    
    public  ControleRemoto(){
      
       this.ligado = false;
       this.tocando = false;
       this.vol = 50;
    }

    /**
     * @return the volume   
     */
     public int getVol() {
        return vol;
    }

    /**
     * @param volume the volume to set
     */
     public void setVolume(int vol) {
        this.vol = vol;
    }

    /**
     * @return the ligado
     */
      public boolean isLigado() {
        return ligado;
    }

    /**
     * @param ligado the ligado to set
     */
      public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    /**
     * @return the tocando
     */
     public boolean isTocando() {
        return tocando;
    }

    /**
     * @param tocando the tocando to set
     */
      public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-----MENU------");
        System.out.println("Está ligado ? " + this.isLigado() + " \nEstá tocando ? " + this.isTocando());
       
        System.out.println("Volume: " + getVol());
        for(int i=0; i <= this.getVol();i+=10){
            System.out.print("[]");
    }
    }
    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if(this.isLigado()){
            this.setVolume(getVol()+10);
        }else{
            System.out.println("Impossivel aumentar volume");
        }
    }

    @Override
    public void menosVolume() {
         if(this.isLigado()){
            this.setVolume(getVol()-10);
        }else{
            System.out.println("Impossivel diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVol() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() && this.getVol() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if( this.isLigado() && !(this.isTocando())){
            this.setTocando(true);
        }else{
            System.out.println("Nao consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if( this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }else{
            System.out.println("Nao consegui pausar");
        }
    }
    
}
