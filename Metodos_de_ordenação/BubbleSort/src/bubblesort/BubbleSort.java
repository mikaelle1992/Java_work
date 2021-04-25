package bubblesort;

import java.util.Scanner;


public class BubbleSort {

  
    public static void main(String[] args) {
        
        int N;
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Tamanho do vetor");
        N = tec.nextInt();
    
        int [] vetor = new int [N];
  
        for(int i = 0;i< vetor.length;i++){
            System.out.println("valor "+(i+1)+ " do vetor.");
            int valor = tec.nextInt();  
            vetor[i] = valor;
        }
        
       int contin, aux, fim = N;
        do{
            contin=0;
            for(int i =0;i< fim-1; i++){
                if(vetor[i] > vetor[i+1]){
                    aux = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = aux;
                    contin = i;
                }
            }
            fim--;
        }while(contin !=0);
        
        
         for(int i = 0;i< vetor.length;i++){
            System.out.println("valores ordenado : " + vetor[i]);
                    
        }
        
    }
    
}
