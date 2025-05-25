public class day43 {
    

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high); // Find pivot position
            quickSort(arr, low, pivotIndex - 1);        // Sort left part
            quickSort(arr, pivotIndex + 1, high);       // Sort right part
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Taking last element as pivot
        int i = low - 1;        // i will track smaller elements

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap pivot with element at i+1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return pivot index
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 1, 6, 8, 5, 3, 4};
        quickSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

