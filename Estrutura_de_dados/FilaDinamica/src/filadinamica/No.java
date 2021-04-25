
package filadinamica;


public class No {
 private int valor;
 private No proximo;
 // proximo do tipo No para ter o endereço do proximo

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * @return the proximo
     */
    public No getProximo() {
        return proximo;
    }

    /**
     * @param proximo the proximo to set
     */
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
  
}
