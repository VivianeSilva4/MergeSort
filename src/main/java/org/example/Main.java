package org.example;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MergeSort merge = new MergeSort();
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int tamanho = 0, a = 0;

        System.out.println("informe o tamanho do vetor: ");
        tamanho = sc.nextInt();
        int vetor [] = new int[tamanho];

        while(a < vetor.length){
            vetor[a] = random.nextInt(100);
            a++;
        }

            MergeSort.imprimir(vetor);
            System.out.println(" ");
            MergeSort.mergeSort(vetor,0,vetor.length-1);
            MergeSort.imprimir(vetor);
    }
}