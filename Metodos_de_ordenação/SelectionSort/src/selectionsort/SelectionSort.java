package selectionsort;

import java.util.Scanner;

public class SelectionSort {

  
    public static void main(String[] args) {
         int troca, menor, N;
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Tamanho do vetor");
        N = tec.nextInt();
    
        int [] vetor = new int [N];
        
         for(int i = 0;i< vetor.length;i++){
            System.out.println("valor "+(i+1)+ " do vetor.");
            int valor = tec.nextInt();  
            vetor[i] = valor;
        }
        
        for(int i = 0; i <N-1; i++){
            menor =i;
            for(int j = i+1; j<N; j++){
                if(vetor[j] < vetor[menor]){
                    menor = j;
                }if(i != menor){
                    troca = vetor[i];
                    vetor[i] = vetor[menor];
                    vetor[menor] = troca;
                }
            }
            
        }
        System.out.println("Ordenado");
          for(int i = 0;i< vetor.length;i++){
            System.out.println("valor : " + vetor[i]);
     }
        
    }
    
}
