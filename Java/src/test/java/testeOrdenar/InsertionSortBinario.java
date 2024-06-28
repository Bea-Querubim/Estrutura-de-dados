package testeOrdenar;

import java.util.Arrays;
//o Insertion Sort Binário é uma otimização do Insertion Sort Direto que utiliza busca binária para melhorar a 
//eficiência na localização da posição correta para inserção do valor

public class InsertionSortBinario {

    public static void binaryInsertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int chave = arr[i];
            int posicao = Arrays.binarySearch(arr, 0, i, chave);

            if (posicao < 0) {
                posicao = -(posicao + 1);
            }

            // Move os elementos para abrir espaço para a chave
            System.arraycopy(arr, posicao, arr, posicao + 1, i - posicao);
            arr[posicao] = chave;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        binaryInsertionSort(arr);

        System.out.println("Array ordenado:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
