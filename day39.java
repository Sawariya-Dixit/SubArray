public class day39 {
    


    public static boolean pairs(int arr[], int target) {
        int breakPoint = -1;
        int n = arr.length;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                breakPoint = i;
                break;
            }
        }

        int lp = (breakPoint + 1) % n; // smallest element
        int rp = breakPoint;           // largest element

        while (lp != rp) {
            int sum = arr[lp] + arr[rp];

            if (sum == target) {
                return true;
            }

            if (sum < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = {11, 15, 6, 8, 9, 10};
        int target = 16;
        System.out.println(pairs(arr, target));
    }
}


