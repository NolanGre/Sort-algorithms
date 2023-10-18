public class HoarSorts {
    public static void main(String[] args) {

        int[] arr = {7, 89, 4, 68, 70, 49, 10, 62, 51};

        System.out.print("Початковий масив: ");
        printArr(arr);

        quickSortHoar(arr, 0, arr.length - 1);

        System.out.print("Відсортований масив: ");
        printArr(arr);
    }

    static void quickSortHoar(int[] arr, int start, int end){

        if (start >= end) return;

        int rightStart = partOfSortHoara(arr, start, end);
        quickSortHoar(arr,start, rightStart - 1);
        quickSortHoar(arr,rightStart, end);
    }

    static int partOfSortHoara(int[] arr, int left, int right){

        int pivot = arr[(left + right) / 2];

        //Tree
        System.out.println("start = " + left + "; end = " + right + "; pivot = " + (left + right) /2 + " (" + pivot + ");");

        System.out.println("left = start; right = end;");
        while (left <= right) {

            System.out.println("while: left <= right (True)");

            while (arr[left] < pivot) left++;
            while (arr[right] > pivot) right--;

            // swap, exit  INFO
            System.out.print("A: ");
            printArr(arr);
            System.out.println("\twhile (arr[left] < pivot) left++;\n\twhile (arr[right] > pivot) right--;");

            System.out.println("left = " + left + "; right = " + right + ";");

            if (left <= right) {
                System.out.println("if: left <= right (True)");
                System.out.println("\tSwap (" + arr[left] + ", " + arr[right] + ");");
                System.out.println("\tleft++; right++;");

                swap(arr, left, right);
                left++;
                right--;
            }
        }

        System.out.println("left <= right (False):  return " + left + ";\n");
        return left;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int j = 0; j < arr.length; j++) {

            System.out.print(arr[j]);
            if(j + 1 < arr.length) System.out.print(", ");     // можно менять запятую на ; или просто пробел
        }
        System.out.println("]");
    }
}
