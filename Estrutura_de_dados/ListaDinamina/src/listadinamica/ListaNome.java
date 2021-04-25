/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadinamica;


public class ListaNome {
    private String nome;
    private ListaNome Prox;

    
    public ListaNome(){
        
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
     * @return the Prox
     */
    public ListaNome getProx() {
        return Prox;
    }

    /**
     * @param Prox the Prox to set
     */
    public void setProx(ListaNome Prox) {
        this.Prox = Prox;
    }
    
}
