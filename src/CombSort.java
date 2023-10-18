public class CombSort {
    public static void main(String[] args) {

        int[] arr = {54, 65, 7, 33, 86, 29, 11, 91, 12};

        System.out.print("Початковий масив: ");
        printArray(arr);

        int gap = arr.length;
        System.out.println("length = " + arr.length + "; gap = " + gap + ';');

        boolean swapped = true;

        while(gap > 1 && swapped) {
            swapped = false;
            System.out.println("gap > 1 && swapped (True)");
            System.out.println("    swapped = false;");

            gap = gap * 10 / 13;
            //if(gap < 1) System.out.println("gap > 1 (False)");
            System.out.println("    gap * 10/13 = " + gap + ';');

            // Comparing elements distant by 'gap'
            int saveI = 0;
            for(int i = 0; i < (arr.length - gap); i++) {
                //System.out.println("    i = " + i + "; arr(" + arr[i] + ") with index " + (i + gap) + " (" + arr[i + gap] + ")");

                if(arr[i] > arr[i + gap]) {

                    System.out.println("\n    arr[i] > arr[i + gap] = " + arr[i] + " > " + arr[i + gap]+ " (True)");
                    System.out.println("       i = " + i + ';');
                    swapped = true;
                    //System.out.println("Swapping index " + i + " (" + arr[i] + ") with index " + (i + gap) + " (" + arr[i + gap] + ")");
                    System.out.println("       arr[i] > arr[i + gap] = " + arr[i] + " > " + arr[i + gap] + " (True)");
                    System.out.println("       swapped = true;");

                    System.out.println("       Swap(" + arr[i] + ", " + arr[i + gap] + ")");
                    int temp = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = temp;
                }
                saveI = i + 1;   // cause after end i++
            }
            System.out.println("i + gap < length = " + saveI + " + " + gap + " < "+ arr.length + " (False)");

            if(!swapped) {
                System.out.println("swapped (False)");
            }
            System.out.println("-------");

        }

        System.out.print("Результат: ");
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
}
