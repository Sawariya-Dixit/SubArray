public class day37 {
    
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] < arr[mid + 1]) {
                // Peak right side me hai
                start = mid + 1;
            } else {
                // Peak mid ya left me hai
                end = mid;
            }
        }
        return start; // start == end == peak index


    }
public static void main(String[] args) {
    int arr[] = {0,1,0};
   System.out.println(peakIndexInMountainArray(arr));

}
}
