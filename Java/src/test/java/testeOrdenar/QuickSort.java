package testeOrdenar;

public class QuickSort {
// Seleciona-se um elemento pivô do array.
// Reorganiza o array de modo que todos os elementos menores que o pivô estejam à esquerda dele e todos os elementos maiores estejam à direita.
//Aplica recursivamente (é originada quando uma função chama a si própria) o mesmo processo às sub-listas à esquerda e à direita do pivô

    public static void quickSort(int[] arr, int inicio, int fim) {
        if (inicio < fim) {
            int indicePivo = particionar(arr, inicio, fim);
            
            quickSort(arr, inicio, indicePivo - 1);  // Ordena a sub-lista esquerda
            quickSort(arr, indicePivo + 1, fim);     // Ordena a sub-lista direita
        }
    }
    
    public static int particionar(int[] arr, int inicio, int fim) {
        int pivo = arr[fim];
        int i = inicio - 1;
        
        for (int j = inicio; j < fim; j++) {
            if (arr[j] <= pivo) {
                i++;
                // Troca arr[i] com arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // Troca arr[i+1] com arr[fim] (pivô)
        int temp = arr[i + 1];
        arr[i + 1] = arr[fim];
        arr[fim] = temp;
        
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;
        
        quickSort(arr, 0, n - 1);
        
        System.out.println("Array ordenado:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}