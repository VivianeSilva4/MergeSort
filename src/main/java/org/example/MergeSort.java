package org.example;

public class MergeSort {
        public static void mergeSort(int vetor[],int inicio,int fim){
            int meio,i,j,k;
            int aux[] = new int[vetor.length];
            if(inicio < fim){
                meio = (inicio+fim)/2;
                mergeSort(vetor,inicio,meio);
                mergeSort(vetor,meio + 1,fim);

                i = inicio;
                j = meio + 1;
                k = inicio;

                while(i <= meio && j <= fim){
                    if(vetor[i] < vetor[j]){
                        aux[k] = vetor[i];
                        i++;
                    }else{
                        aux[k] = vetor[j];
                        j++;
                    }
                    k++;
                }
                while(i <= meio){
                    aux[k] = vetor[i];
                    k++;
                    i++;
                }
                while(j <= fim){
                    aux[k] = vetor[j];
                    k++;
                    j++;
                }
                for(int a = inicio;a <= fim;a++){
                    vetor[a] = aux[a];
                }
            }
        }
        public static void imprimir(int vetor[]){
            for(int a : vetor){
                System.out.print(a+" ");
            }
        }

}