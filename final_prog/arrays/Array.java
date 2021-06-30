import java.util.*;

class Array {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a[] = {10,52,30,90,80};
        
    }

    public static int maximum(int a[]){
        int maxi = a[0];
        for(int val : a){
            maxi = Math.max(maxi,val);
        }
        return maxi;
    }
}
