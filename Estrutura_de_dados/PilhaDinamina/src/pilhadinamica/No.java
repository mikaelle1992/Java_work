/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhadinamica;

/**
 *
 * @author Mikaelle
 */
public class No {
    private Object valor;
    private No anterior;
    
    public No(Object valor, No anterior ){
        this.valor = valor;
        this.anterior = anterior;
        
    }

    /**
     * @return the valor
     */
    public Object getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Object valor) {
        this.valor = valor;
    }

    /**
     * @return the anterior
     */
    public No getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }
}
