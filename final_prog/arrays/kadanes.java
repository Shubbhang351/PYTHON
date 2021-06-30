import java.util.*;

class kadanes {
    
    public static void maxSubarraySum(int arr[], int n){
        int a[] = new int[n];
        a[0] = arr[0];

        for(int i = 1;i < arr.length;i++){
            a[i] = Math.max(arr[i], arr[i] + a[i - 1]);
        }

        int m = a[0];
        for(int i = 1;i < a.length;i++){
            if(a[i] > m){
                m = a[i];
            }
        }
        System.err.println(m);
    }

    public static void main(String[] args) {
        int a[] = {-1,-2,-3,-4};
        maxSubarraySum(a, a.length);
    }
}
