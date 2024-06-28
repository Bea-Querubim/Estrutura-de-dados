package testeOrdenar;

public class bubbleSort {
// passa pelo array, e a cada 'rodada', compara e troca o par de valores comparados (se um for menor que o outro)
/* 12 | 04 | 25 | 10
 * 04 | 12 | 25 | 10
 * 04 | 12 | 10 | 25
 */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean trocado;

        do {
            trocado = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    // Troca os elementos
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    trocado = true;
                }
            }
            n--;
        } while (trocado);
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);

        System.out.println("Array ordenado:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
