import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void solve(int[] denom, int i, int j, int k, int arrSum, Set<String> m) {
        if (arrSum == k) {
            String n = "" + i + j;
            m.add(n);
            return;
        }
        if (arrSum < 0) {
            return;
        }
        if (i == denom.length || j < 0 || i > j) {
            return;
        }
        solve(denom, i + 1, j, k, arrSum - denom[i], m);
        solve(denom, i, j - 1, k, arrSum - denom[j], m);
        solve(denom, i + 1, j - 1, k, arrSum - (denom[i] + denom[j]), m);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] a = {{9,8,7},{6,5,4},{3,2,1}};

        for(int i = 0;i < a.length;i++){
            System.out.println(Arrays.toString(a[i]));
        }

        Arrays.sort(a);

        for(int i = 0;i < a.length;i++){
            System.out.println(Arrays.toString(a[i]));
        }
    }
}