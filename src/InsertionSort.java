public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {54, 65, 7, 33, 86, 29, 11, 91, 12};

        System.out.print("Початковий масив: ");
        printArray(arr);

        for (int i = 1; i < arr.length; i++){
            System.out.println("\n" + i + ")");

            int key = arr[i];
            System.out.println("i = " + i + "; key = " + key + " (index " + i + ");");

            int j = i - 1;
            System.out.println("j = i - 1 = " + j + ';');
            
            while (j >= 0 && arr[j] > key){
                System.out.println("j >= 0 && arr[j] > key (True)");
                System.out.println("    j = " + j + " (" + arr[j] + ");");

                arr[j + 1] = arr[j];

                System.out.println("    arr[" + j + " + 1] = arr["+ j + "] = " + arr[j] + ';');
                j--;
                System.out.println("    j-- = " + j + ';');
                System.out.print("arr: ");
                printArray(arr);
                System.out.println();
            }
            System.out.println("j >= 0 && arr[j] > key (False)");

            arr[j + 1] = key;
            System.out.println("arr[" + j + " + 1] = key = " + key + ';');
            System.out.print("arr: ");
            printArray(arr);

        }

    }

    public static void printArray(int[] arr) {
        System.out.print('[');
        for (int j = 0; j < arr.length; j++) {

            System.out.print(arr[j]);
            if(j + 1 < arr.length) System.out.print(", ");     // можно менять запятую на ; или просто пробел
        }
        System.out.println(']');
    }
}
