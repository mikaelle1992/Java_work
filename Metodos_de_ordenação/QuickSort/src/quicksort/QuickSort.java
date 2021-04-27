package quicksort;

import java.util.Scanner;

public class QuickSort {

    public void quick(int[] vetor, int esq, int dir) {

        if (esq < dir) {
            int pos = particao(vetor, esq, dir);
            quick(vetor, esq, pos);
            quick(vetor, pos + 1, dir);

        }
    }

    public int particao(int[] vetor, int esq, int dir) {
        int meio = (int) (esq + dir) / 2;
        int pivo = vetor[meio];
        int i = esq - 1;
        int j = dir + 1;

        while (true) {
            do {
                i++;
            } while (vetor[i] < pivo);
            do {
                j--;
            } while (vetor[j] > pivo);
            if (i >= j) {
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }

    }

    public static void main(String[] args) {
        int N;
        QuickSort q1 = new QuickSort();

        Scanner tec = new Scanner(System.in);

        System.out.print("Tamanho do vetor:");
        N = tec.nextInt();
    
        int [] vetor = new int [N];
        
        for (int i = 0; i <N; i++) {
            System.out.print("valor "+(i+1)+ " do vetor.");
            int valor = tec.nextInt();
            vetor[i] = valor;
        }

        q1.quick(vetor, 0, N - 1);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("valores ordenado : " + vetor[i]);
        }

    }

}
