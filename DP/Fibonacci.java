package DP;
import java.util.*;


public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(FibRecursive(20));
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
}
