public class OddEvenSort {
    public static void main(String[] args) {

        int[] arr = {54, 65, 7, 33, 86, 29, 11, 91, 12};

        System.out.print("Початковий масив: ");
        printArray(arr);

        boolean isSorted = false;

        while (!isSorted) {

            System.out.println("\nisSorted == false (True)");
            isSorted = true;
            System.out.println("    isSorted = true;");
            System.out.println("    Even");
            for (int i = 0; i < arr.length - 1; i += 2) {
                if (arr[i] > arr[i + 1]) {

                    System.out.println("    arr[i] > arr[i + 1] = " + arr[i] + " > "+ arr[i + 1] + " (True)");
                    System.out.println("        i = " + i + ";");
                    System.out.println("        Swap(" + arr[i] + ", " + arr[i + 1] + ");");
                    swap(arr, i, i + 1);
                    isSorted = false;
                    System.out.println("        isSorted = false;");
                }
            }
            System.out.println("    i < length - 2 = " + (arr.length - 2) + " (False)");
            System.out.print("arr: ");
            printArray(arr);

            System.out.println("\n    Odd");
            for (int i = 1; i < arr.length - 1; i += 2) {
                if (arr[i] > arr[i + 1]) {

                    System.out.println("    arr[i] > arr[i + 1] = " + arr[i] + " > "+ arr[i + 1] + " (True)");
                    System.out.println("        i = " + i + ";");
                    System.out.println("        Swap(" + arr[i] + ", " + arr[i + 1] + ");");
                    swap(arr, i, i + 1);
                    isSorted = false;
                    System.out.println("        isSorted = false;");
                }
            }
            System.out.println("    i < length - 2 = " + (arr.length - 2) + " (False)");
            System.out.print("arr: ");
            printArray(arr);
        }

        System.out.print("\nРезультат: ");
        printArray(arr);
    }


    public static void printArray(int[] arr) {
        System.out.print('[');
        for (int j = 0; j < arr.length; j++) {

            System.out.print(arr[j]);
            if(j + 1 < arr.length) System.out.print(", ");
        }
        System.out.println(']');
    }

    public static void swap(int[] arr,int first, int second) {
        var temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
