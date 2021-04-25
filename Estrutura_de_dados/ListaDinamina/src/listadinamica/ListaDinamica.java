/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadinamica;

import java.util.Scanner;

/**
 *
 * @author Mikaelle
 */
public class ListaDinamica {

    private ListaNome primeiro = null;
    private ListaNome ultimo = null;
    private int qtd = 0;

    public void inserirNoInicio(String nome) {
        ListaNome novoNome = new ListaNome();
        novoNome.setNome(nome);
        novoNome.setProx(primeiro);

        primeiro = novoNome;

        if (qtd == 0) {
            ultimo = primeiro;
        }

        qtd++;
    }

    public void inserirNoFinal(String nome) {
        if (qtd == 0) {
            inserirNoInicio(nome);
        } else {
            ListaNome novoNom = new ListaNome();
            novoNom.setNome(nome);
            novoNom.setProx(null);
            ultimo.setProx(novoNom);
            ultimo = novoNom;
            qtd++;
        }
    }

    //inserir nome na posição
    public void inserirNaPosição(int posicao, String nome) {
        if (qtd == 0) {
            inserirNoInicio(nome);
        } else if (posicao == qtd) {
            inserirNoFinal(nome);
        } else {
            ListaNome novaPosicao = buscarNaPosicao(posicao);
        }
    }

    public void removerNoInicio() {
        if (qtd == 0) {
            return;
        }

        primeiro = primeiro.getProx();
        qtd--;
    }

    public void removerNoFinal() {
        if (qtd == 0) {
            return;
        }

        if (qtd == 1) {
            removerNoInicio();
            return;
        }

        ListaNome PosicaoAnterior = buscarNaPosicao(qtd - 2);
        PosicaoAnterior.setProx(null);

        qtd--;
    }

    public void removerNaPosicao(int posicao) {
        if (qtd == 0) {
            removerNoInicio();
        } else if (posicao == qtd) {
            removerNoFinal();
        } else {
            ListaNome PosicaoAnterior = buscarNaPosicao(posicao - 1);
            ListaNome PosicaoAtual = PosicaoAnterior.getProx();

            if (PosicaoAtual.getProx() != null) {
                PosicaoAnterior.setProx(PosicaoAtual.getProx());
            } else {
                PosicaoAnterior.setProx(null);
                ultimo = PosicaoAnterior;
            }

            qtd--;
        }
    }

    public ListaNome buscarNaPosicao(int posicao) {
        if (!existeElementoNaPosicao(posicao)) {
            throw new RuntimeException("Posição não existente");
        }

        ListaNome atual = primeiro;

        for (int i = 0; i < posicao; i++) {
            atual = atual.getProx();
        }
        return atual;
    }

    public Integer retonarElementoPorPosicao(int posicao) {
        System.out.println(buscarNaPosicao(posicao).getNome());
        return null;
    }

    public Integer QuantidadeDeElementos() {
        System.out.println(qtd);
        return null; // so nao colocar o return aquji dá erro 

    }

    private boolean existeElementoNaPosicao(int posicao) {
        return posicao >= 0 && posicao < qtd;
    }

    public void imprimir() {
        if (qtd == 0) {
            System.out.println("[]");
            return;
        }
        String elementos = retornarElementos();
        System.out.println(elementos);
    }

    String retornarElementos() {
        StringBuilder elementos = new StringBuilder("[");

        ListaNome atual = primeiro;

        while (atual.getProx() != null) {
            elementos.append(atual.getNome());
            elementos.append(" ");
            atual = atual.getProx();
        }

        elementos.append(atual.getNome());

        elementos.append("]");

        return elementos.toString();
    }

    public void getPrimeiro() {
        
        System.out.println(primeiro.getNome());
    }

    public void getUltimo() {
          System.out.println(ultimo.getNome());
    }

    public static void main(String[] args) {

        ListaDinamica l1 = new ListaDinamica();

        String res,ins;
        int num;
        Scanner tec = new Scanner(System.in);

        System.out.println("Lista:");

        do {
            System.out.println("Menu:\n1:Inserir :\n2:Remover \n3:Listar\n4:Consultar.\n5:Tamanho da lista ");
            num = tec.nextInt();
            if (num == 1) {
                System.out.println("Inserir no inicio [i] ,fim [f] ou posição [p]?");
               ins = tec.next();
                if (ins.equals("p")) {
                    do {
                        System.out.println("Digite aposição: ");
                        int pos = tec.nextInt();
                        System.out.println("Digite um nome: ");
                        String nome = tec.next();
                        l1.inserirNaPosição(pos, nome);
                        System.out.println("Valor inserido com sucesso!\nDeseja inserir outro valor [s/n]? ");
                        res = tec.next();

                    } while (res.equals("s"));
                } else if (ins.equals("i")) {

                    do {
                        System.out.println("Digite um nome: ");
                        String nome = tec.next();
                        l1.inserirNoInicio(nome);
                        System.out.println("Valor inserido com sucesso!\nDeseja inserir outro valor [s/n]? ");
                        res = tec.next();

                    } while (res.equals("s"));
                } else if (ins.equals("f")) {

                    do {
                        System.out.println("Digite um nome: ");
                        String nome = tec.next();
                        l1.inserirNoFinal(nome);
                        System.out.println("Valor inserido com sucesso!\nDeseja inserir outro valor [s/n]? ");
                        res = tec.next();

                    } while (res.equals("s"));

                }

            } else if (num == 2) {
                System.out.println("Excluir no inicio [i] ,fim [f] ou posição [p]?");
                ins = tec.next();
                if (ins.equals("p")) {
                    do {
                        System.out.println("Digite aposição: ");
                        int pos = tec.nextInt();
                        l1.removerNaPosicao(pos);
                        System.out.println("Valor removido com sucesso!\nDeseja removido outro valor [s/n]?");
                        res = tec.next();

                    } while (res.equals("s"));

                } else if (ins.equals("i")) {
                    do {
                        l1.removerNoInicio();
                        System.out.println("Valor removido com sucesso!\nDeseja removido outro valor [s/n]?");
                        res = tec.next();

                    } while (res.equals("s"));

                } else if (ins.equals("f")) {

                    do {
                        l1.removerNoFinal();
                        System.out.println("Valor removido com sucesso!\nDeseja removido outro valor [s/n]?");
                        res = tec.next();

                    } while (res.equals("s"));

                }

            } else if (num == 3) {
                l1.imprimir();
            } else if (num == 4) {
                System.out.println("Buscar no inicio [i] ,fim [f] ou posição [p]?");
                 String in = tec.next();
                if (in.equals("i")) {
                    
                    do {
                        l1.getPrimeiro();
                        System.out.println("Deseja buscar outro valor [s/n]?");
                        res = tec.next();

                    } while (res.equals("s"));

                } else if (in.equals("f")) {
                    do {
                       l1.getUltimo();
                        System.out.println("Deseja buscar outro valor [s/n]?");
                        res = tec.next();

                    } while (res.equals("s"));

                } else if (in.equals("p")) {
                    do {
                        System.out.println("Digite aposição: ");
                        int pos = tec.nextInt();  
                        l1.retonarElementoPorPosicao(pos);
                        System.out.println("Deseja buscar outro valor [s/n]?");
                        res = tec.next();

                    } while (res.equals("s"));

                  
                }
            } else if (num == 5) {
                l1.QuantidadeDeElementos();
            }

            System.out.println("Deseja continuar no programa.[s/n]?");
            res = tec.next();
        } while (res.equals("s"));

        System.out.println("FIM");

    }

}
