public class CocktailSort {
    public static void main(String[] args) {

        int[] arr = {54, 65, 7, 33, 86, 29, 11, 91, 12};

        System.out.print("Початковий масив: ");
        printArray(arr);
        
        int left = 0;
        int right = arr.length - 1;
        System.out.print("\nleft = " + left + "; right = " + right + ';');

        while (left < right) {

            System.out.println("\nleft < right (True)");
            for (int i = left; i < right; i++) {

                System.out.println("    i = " + i + "; arr[i] = " + arr[i] + "; arr[i + 1] = " + arr[i + 1] + ';');
                if (arr[i] > arr[i + 1]) {

                    System.out.println("    arr[i] > arr[i + 1] (True)");
                    System.out.println("        Swap(" + arr[i] + ", " + arr[i + 1] + ");");
                    swap(arr, i, i + 1);
                } else {

                    System.out.println("    arr[i] > arr[i + 1] (False)");
                }
            }
            System.out.println("    i < right (False)");

            System.out.print("arr: ");
            printArray(arr);

            right--;
            System.out.println("\nright-- = " + right + ';');

            for (int i = right; i > left; i--) {

                System.out.println("    i = " + i + "; arr[i - 1] = " + arr[i - 1] + "; arr[i] = " + arr[i] + ';');
                if (arr[i - 1] > arr[i]) {

                    System.out.println("    arr[i - 1] > arr[i] (True)");
                    System.out.println("        Swap(" + arr[i - 1] + ", " + arr[i] + ");");
                    swap(arr, i - 1, i);
                } else {

                    System.out.println("    arr[i - 1] > arr[i] (False)");
                }
            }
            System.out.println("    i > left (False)");

            left++;
            System.out.println("left++ = " + left + ";");

            System.out.print("arr: ");
            printArray(arr);
        }
        System.out.println("left < right (False)");

        System.out.print("\nРезультат: ");
        printArray(arr);
    }

    public static void swap(int[] arr, int first, int second) {

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

