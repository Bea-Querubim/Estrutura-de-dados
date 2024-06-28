package testeOrdenar;

public class InsertionSortDireto {
// Ele percorre o array da esquerda para a direita, inserindo cada elemento na posição correta em relação aos elementos já ordenados.
//comparada os valores e vai ordenando, comparando com o lado esquerdo
//"empurrando" os valores para a direita e inserindo na ordenação correta
/* 22| 14| 9| 100| 2| 11
 * 14| 22| 9| 100| 2| 11
 * 9| 14| 22| 100| 2| 11
 * 2| 9| 14| 22| 100| 11
 * 2| 9| 11| 14| 22| 100
 */
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int chave = arr[i];
            int j = i - 1;
            
            // Move os elementos do arr[0..i-1] que são maiores que a chave
            while (j >= 0 && arr[j] > chave) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = chave;
        }
    }

    public static void main(String[] args) {
        int[] arr = {22, 14, 9, 100, 2, 11};
        insertionSort(arr);
        
        System.out.println("Array ordenado:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
