import java.util.*;

class Recursion{
    public static void main(String[] args) {
        // int[] arr = {2,2,2,1,2,6};
        // int[] ans = solve(arr, 0, 0, 0);
        // System.out.println(Arrays.toString(ans));
        // System.out.println(stair(3));
        PDI(4);
    }


    // n  ->  1 counting
    public static void PD(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);
        PD(n - 1);
    }

    public static int stair(int h){
        if(h == 0 || h == 1){
            return 1;
        }

        int r = stair(h - 1);
        int l = stair(h - 2);
        return l + r;
    }

    public static int[] solve(int[] arr, int s, int i,int count){
        if(i == arr.length){
            return new int[count];
        }
        
        int[] ans;
        if(arr[i] == s){
            ans = solve(arr, s, i + 1, count + 1);
            ans[count] = i;
        }
        else{
            ans = solve(arr, s, i + 1, count);
        }
        return ans;
    }

    public static void PDI(int n){

        if(n == 0){
            return;
        }

        System.out.println(n);

        PDI(n - 1);

        System.out.println(n);
    }
}