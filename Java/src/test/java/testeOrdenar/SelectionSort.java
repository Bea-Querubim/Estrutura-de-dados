package testeOrdenar;

public class SelectionSort {
    // o vetor pega o indice que tem o menor valor, e vai trocando de posição
    //assim ele mantem 'metade' do arry em ordem e a outra metade vai ordenar
/* 22 | 14 | 09 | 100 | 2
 * 2 | 14 | 09 | 100 | 22
 * 2 | 09 | 14 | 100 | 22
 * 2 | 09 | 14 | 22 | 100
 */
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int menorIndice = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[menorIndice]) {
                    menorIndice = j;
                }
            }
            // Troca os elementos
            int temp = arr[menorIndice];
            arr[menorIndice] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {22, 14, 9, 100, 2};
        selectionSort(arr);
        
        System.out.println("Array ordenado:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
