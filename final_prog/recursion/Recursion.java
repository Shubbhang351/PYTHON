import java.util.*;

class Recursion{
    public static void main(String[] args) {
        // int[] arr = {2,2,2,1,2,6};
        // int[] ans = solve(arr, 0, 0, 0);
        // System.out.println(Arrays.toString(ans));
        // System.out.println(stair(3));
        // System.out.println(factorial(0));
        // System.out.println(pow(2,8));
        // System.out.println(fibonacci(6));
        // subsequence("abc", "", 0);
        ruler(1,5);
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

    public static int factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static int pow(int base, int expo){
        if(expo == 1){
            return base;
        }

        return base * pow(base, expo - 1);
    }

    public static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void subsequence(String s,String ans,int i){
        if(i == s.length()){
            System.out.println(">> " + ans);
            return;
        }

        subsequence(s, ans + s.charAt(i), i + 1);
        subsequence(s, ans, i + 1);
    }

    public static void pattern(int tl){
        if(tl == 0){
            return;
        }
        pattern(tl - 1);
        for(int i = 1;i <= tl;i++){
            System.out.print("- ");
        }
        System.out.println();
        pattern(tl - 1);
    }

    public static void ruler(int inch, int mtl){
        String s = "";
        for(int i = 1;i <= mtl;i++){
            s += "- ";
        }
        System.out.println(s + " 0");


        for(int i = 1;i <= inch;i++){
            pattern(mtl - 1);
            System.out.println(s + " " + i);
        }
    } 

    
}