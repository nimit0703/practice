
import java.util.ArrayList;
import java.util.List;

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

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high)
            return;

        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);

        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    public static void merge(int arr[], int low, int mid, int high) {

        List<Integer> temp = new ArrayList<>();
        int left = low, right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void recursiveBubbleSort(int[] arr, int n) {

        if (n == 1)
            return;

        int swapped = 0;

        for (int i = 0; i < n - 1; i++) {
            // swap
            if (arr[i] > arr[i + 1]) {
                swapped = 1;
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        if (swapped == 0)
            return;

        recursiveBubbleSort(arr, n - 1);
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
        // insertionSort(arr);
        // mergeSort(arr, 0, arr.length - 1);
        recursiveBubbleSort(arr, arr.length);

        System.out.println("After sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
