public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {54, 65, 7, 33, 86, 29, 11, 91, 12};  //var: 21

        System.out.print("Початковий масив: ");
        printArray(arr);

        int n = arr.length;
        System.out.println("n = " + arr.length + ';');

        for (int i = 0; i < n - 1; i++){

            //System.out.println('\n' + (i + 1) + ")");
            int min = i;
            System.out.println("i = " + i + "; min = i = " + min + ';');

            for (int j = i + 1; j < n; j++){

                if (arr[j] < arr[min]){
                    System.out.print("    j = " + j + "; arr[j] < arr[min] (True) -> ");
                    min = j;
                    System.out.println("min = j = " + min); // New minimum found
                } else {

                    System.out.println("    j = " + j + "; arr[j] < arr[min] (False)");
                }
            }

            System.out.println("Swap(" + arr[i] + ", " + arr[min] + ")");
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

            System.out.print("arr: ");
            printArray(arr);
        }
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
