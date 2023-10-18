public class HeapMin {
    public static void main(String[] args) {

        int[] arr = {54, 65, 7, 33, 86, 29, 11, 91, 12};

        System.out.print("Початковий масив: ");
        printArray(arr);

        // ----------------- make min heap
        minHeap(arr);

        System.out.println("\nОдин за одним витягувати елемент із купи");
        for (int i = arr.length - 1; i > 0; i--){

            swap(arr, i, 0);
            System.out.println("Swap(" + arr[i] + ", " + arr[0] + ");");
            System.out.println("heapify(arr, 0, " + i + ");");
            heapify(arr, 0, i);
        }

        System.out.print("result: ");
        printArray(arr);
    }

    public static void minHeap (int[] arr){

        System.out.println("Будуємо дерево");
        for (int i = arr.length / 2 - 1; i >= 0; i--) {

            System.out.println("heapify(arr, " + i + ", " + arr.length + ");");
            heapify(arr, i, arr.length);
        }


    }

    public static void heapify(int[] arr, int i, int j) {

        System.out.println("    i(h) = " + i + "; j(length) =" + j + ";");

        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int main = i;

        System.out.println("    left = i * 2 + 1 = " + left + "; right = i * 2 + 2 = " + right + "; main = " + main +';');

        if (left < j && arr[left] < arr[main]) {

            main = left;
            System.out.println("    left < j && arr[left] < arr[main] (True) -> main = " + left + ';');
        } else {

            System.out.println("    left < j && arr[left] < arr[main] (False)");
        }

        if (right < j && arr[right] < arr[main]) {

            main = right;
            System.out.println("    right < j && arr[right] < arr[main] (True) -> main = " + right + ';');
        } else {

            System.out.println("    right < j && arr[right] < arr[main] (False)");
        }

        if (i != main) {

            System.out.println("i != main (True)");
            System.out.println("    Swap(" + arr[i] + ", " + arr[main] + ");");
            swap(arr, i, main);

            System.out.print("arr:");
            printArray(arr);

            System.out.println("    heapify(arr, " + main + ", " + j + ");");
            heapify(arr, main, j);
        }
    }

    public static void swap(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void printArray(int[] arr) {
        System.out.print('[');
        for (int j = 0; j < arr.length; j++) {

            System.out.print(arr[j]);
            if(j + 1 < arr.length) System.out.print(", ");
        }
        System.out.println(']');
    }

}
