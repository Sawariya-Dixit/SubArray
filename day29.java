public class day29 {

    public static int firstOccurence(int arr[], int key, int i){
        if (i == arr.length) {
            return -1; // Base case: key not found
        }
        if (arr[i] == key) {
            return i; // Found the key
        }
        return firstOccurence(arr, key, i + 1); // Recursive call
    }

    public static void main(String[] args) {
        int arr[] = {8, 7, 5, 4, 3, 2, 5};
        int key = 5;
        System.out.println(firstOccurence(arr, key, 0)); // Output: 2
    }
}

