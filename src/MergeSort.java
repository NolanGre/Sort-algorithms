public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {7, 89, 4, 68, 70, 49, 10, 62, 51};

        System.out.print("Початковий масив: ");
        printArray(arr);
        System.out.println(" ");

        mergeSort(arr, 0, arr.length - 1);

        System.out.print("\nВідсортований масив: ");
        printArray(arr);
    }

    static public void mergeSort(int[] arr, int left, int right) {

        if (left >= right) return;

        int middle = left + (right - left) / 2;

        mergeSort(arr, left, middle);
        mergeSort(arr, middle + 1, right);

        merge(arr, left, middle, right);
    }

    static void merge(int[] arr, int left, int middle, int right) {

        System.out.println("left = " + left + "; right = " + right + "; middle = " + middle + ';');

        int sizeL = middle - left + 1;
        int sizeR = right - middle;

        System.out.println("L size = " + sizeL + ";  R size = " + sizeR + ';');

        int[] L = new int[sizeL];
        int[] R = new int[sizeR];

        for (int i = 0; i < sizeL; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < sizeR; j++)
            R[j] = arr[middle + 1 + j];

        System.out.println("Копіюємо масив");

        System.out.print("L: ");
        printArray(L);
        System.out.print("R: ");
        printArray(R);

        int i = 0;
        int j = 0;

        int k = left;
        System.out.println("i = " + i + "; j = " + j + "; k = " + k + ';');

        while (i < sizeL && j < sizeR) {
            if (L[i] <= R[j]) {
                System.out.println("L[i] <= R[j] (True)");
                arr[k] = L[i];
                System.out.println("    arr[k] = L[i] = " + arr[k] + ';');
                i++;
                System.out.print("    i++ = " + i);
            }
            else {
                System.out.println("L[i] <= R[j] (False)");
                arr[k] = R[j];
                System.out.println("    arr[k] = R[j] = " + arr[k] + ';');
                j++;
                System.out.print("    j++ = " + j);
            }
            k++;
            System.out.println("; k++ = " + k + ';');
        }

        System.out.println("i < sizeL && j < sizeR (False)");

        while (i < sizeL) {
            System.out.println("i < sizeL (True)");
            arr[k] = L[i];
            System.out.println("    arr[k] = L[i] = " + arr[k] + ';');
            i++;
            k++;
            System.out.println("    i++ = " + i + "; k++ = " + k + ';');
        }

        while (j < sizeR) {
            System.out.println("j < sizeR (True)");
            arr[k] = R[j];
            System.out.println("    arr[k] = R[j] = " + arr[k] + ';');
            j++;
            k++;
            System.out.println("    j++ = " + j + "; k++ = " + k + ';');
        }

        System.out.print("arr: ");
        printArray(arr, left, k);
        System.out.println(" ");
    }


    public static void printArray(int[] arr) {
        System.out.print('[');
        for (int j = 0; j < arr.length; j++) {

            System.out.print(arr[j]);
            if(j + 1 < arr.length) System.out.print(", ");     // можно менять запятую на ; или просто пробел
        }
        System.out.println(']');
    }

    public static void printArray(int[] arr, int left, int k) {
        System.out.print("[");
        for (int j = left; j < k; j++) {

            System.out.print(arr[j]);
            if(j + 1 < k) System.out.print(", ");     // можно менять запятую на ; или просто пробел
        }
        System.out.println(']');
    }
}
