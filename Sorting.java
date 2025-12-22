public class Sorting {

    // select minimum and replace to start point
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    // adjusent swapping
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = n; i > 0; i--) {
            int doSwap = 0;
            for (int j = 0; j < i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    doSwap = 1;
                }
            }
            if (doSwap == 0) {
                break;
            }
        }
    }

    // place elements at correct potion
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int j = i;

            while (j > 0 && arr[j - 1] > arr[j]) {
                // swap
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;

                j--;
            }
        }
    }

    public static void main(String[] args) {
        // int[] arr = { 1,2,3,4,5,6,7 };
        int[] arr = { 13, 46, 24, 52, 20, 9 };

        // Print array before sorting
        System.out.println("Before sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Call sort

        // selectionSort(arr);
        // bubbleSort(arr);
        insertionSort(arr);

        System.out.println("After sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
