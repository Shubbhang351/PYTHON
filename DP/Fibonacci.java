package DP;
import java.util.*;


public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.println(FibRecursive(n));
        // int l[] = new int[n + 1];
        

        // int ans = FibboTD(n, l);
        // System.out.println(ans);
        // System.out.println(Arrays.toString(l));

        System.out.println(fibnoUP(n));
    }
    
    public static int FibRecursive(int n){

        if(n == 0 || n == 1){
            return n;
        }

        int fnm1 = FibRecursive(n - 1);
        int fnm2 = FibRecursive(n - 2);

        int fn = fnm1 + fnm2;
        return fn;
    }

    public static int FibboTD(int n, int[] l){
        if(n == 0 || n == 1){
            return n;
        }

        if(l[n] != 0){
            return l[n];
        }

        int fnm1 = FibboTD(n - 1, l);
        int fnm2 = FibboTD(n - 2, l);

        l[n] = fnm1 + fnm2;

        return fnm1 + fnm2;
    }

    public static int fibnoUP(int n){
        int strg[] = new int[n + 1];

        strg[0] = 0;
        strg[1] = 1;

        for(int i = 2;i <= n ;i++){
            strg[i] = strg[i - 1] + strg[i - 2];
        }

        return strg[n];
    }
    
}
