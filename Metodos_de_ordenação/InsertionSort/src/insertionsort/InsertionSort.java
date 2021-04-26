package insertionsort;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        int N, aux, j;
        Scanner tec = new Scanner(System.in);

        System.out.println("Tamanho do vetor");
        N = tec.nextInt();
        int[] v = new int[N];

        for (int i = 0; i < v.length; i++) {
            System.out.println("valor " + (i + 1) + " do vetor.");
            int valor = tec.nextInt();
            v[i] = valor;
        }

        for (int i = 1; i < N; i++) {
            aux = v[i];
            j = i - 1;
            while ((j >= 0) && (aux < v[j])) {
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = aux;
        }

        for (int i = 0; i < v.length; i++) {
            System.out.println("valores ordenado : " + v[i]);

        }

    }

}
