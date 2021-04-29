package buscabinaria;

import java.util.Scanner;

public class BuscaBinaria {

    public static void main(String[] args) {
        int N = 6;

        int[] vetor = new int[N];
        Scanner tec = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("valor " + (i + 1) + " do vetor.");
            int valor = tec.nextInt();
            vetor[i] = valor;
        }

        int contin, aux, fim = N;
        do {
            contin = 0;
            for (int i = 0; i < fim - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    contin = i;
                }
            }
            fim--;
        } while (contin != 0);

        boolean achou = false;
        int inicioBusca = 0;
        int fimBusca = N - 1;
        int meio;
        String resp;
        do {
            System.out.print("Qual valor burcar ?");
            int buscado = tec.nextInt();

            while (inicioBusca <= fimBusca) {
                meio = (int) ((inicioBusca + fimBusca) / 2);
                if (vetor[meio] == buscado) {
                    achou = true;
                    break;
                } else if (vetor[meio] < buscado) {
                    inicioBusca = meio + 1;
                } else {//entao é maior e cai aqui no else.
                    fimBusca = meio - 1;
                }
            }

            if (achou) {
                System.out.println("encontrado");
            } else {
                System.out.println("Não  encontrado");
            }

            System.out.println("Deseja continuar no programa.[s/n]?");
            resp = tec.next();

        } while (resp.equals("s"));

    }

}
