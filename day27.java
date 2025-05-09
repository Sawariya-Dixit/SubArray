public class day27 {

    public static void swap(int arr[], int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void ar(int arr[]) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            if (arr[start] == 0) {
                start++;
            } else if (arr[end] == 1) {
                end--;
            } else {
                // arr[start] == 1 and arr[end] == 0
                swap(arr, start, end);
                start++;
                end--;
            }
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 0, 1, 1, 0, 0, 1, 1, 0};
        ar(arr);
        print(arr);
    }
}

