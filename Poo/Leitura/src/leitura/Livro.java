package leitura;


public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPagina;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPagina, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPagina = totPagina;
        this.leitor = leitor;
        this.aberto = false;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", totPagina=" + totPagina + ", pagAtual=" + pagAtual + ", aberto=" + aberto + ", leitor=" + leitor + '}';
    }

    
    
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the totPagina
     */
    public int getTotPagina() {
        return totPagina;
    }

    /**
     * @param totPagina the totPagina to set
     */
    public void setTotPagina(int totPagina) {
        this.totPagina = totPagina;
    }

    /**
     * @return the pagAtual
     */
    public int getPagAtual() {
        return pagAtual;
    }

    /**
     * @param pagAtual the pagAtual to set
     */
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    /**
     * @return the aberto
     */
    public boolean isAberto() {
        return aberto;
    }

    /**
     * @param aberto the aberto to set
     */
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    /**
     * @return the leitor
     */
    public Pessoa getLeitor() {
        return leitor;
    }

    /**
     * @param leitor the leitor to set
     */
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
         this.aberto = true;
    }

    @Override
    public void fechar() {
       this.aberto = false;
    }

    @Override
    public void folhear() {
     
    }

    @Override
    public void avantarPag() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void voltarPag() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
