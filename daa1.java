
import java.util.*;
import java.lang.Math;

class daa1 {
    static int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int m = (l + r) / 2;
            if (arr[m] == x)
                return m;

            if (arr[m] > x)
                return binarySearch(arr, l, m - 1, x);

            return binarySearch(arr, m + 1, r, x);
        }

        return -1;
    }

    static int min(int a, int b) {
        return a <= b ? a : b;
    }

    static int exponentialSearch(int arr[],
            int n, int x) {
        if (arr[0] == x)
            return 0;
        int i = 1;
        while (i < n && arr[i] <= x)
            i = i * 2;
        return binarySearch(arr, i / 2, min(i, n - 1), x);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int result = exponentialSearch(arr, arr.length, x);
        System.out.println((result < 0) ? "Element is not present in array"
                : "Element is present at index " +
                        result);
    }
}