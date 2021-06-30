import java.util.*;

class minimumJump {
    static int minJumps(int[] arr){
        int ans[] = new int[arr.length];

        Arrays.fill(ans, -1);

        ans[ans.length - 1] = 0;
        //ans[ans.length - 2] = 1;

        //System.out.println(Arrays.toString(ans));

        for(int i = ans.length - 1;i >= 0;i--){
            
            if(ans[i] == -1){
                if(arr[i] == 0){
                    ans[i] = 0;
                    continue;
                }
                if(arr[i] >= (ans.length - 1 - i)){
                    ans[i] = 1;
                }
                else{
                    //System.out.println(arr[i]);
                    int m = Integer.MAX_VALUE;
                    for(int j = i + 1; j <= i + arr[i];j++){
                        if(ans[j] != 0 && ans[j] < m){
                            m = ans[j];
                        }
                    }
                    ans[i] = m + 1;
                }
            }
        }

         System.out.println(Arrays.toString(ans));

        // System.out.println(ans[0]);

        // for(int i = ans.length - 1;i >= 0;i--){
        //     System.out.println("indeii -- " + i + " ,ele -  " + arr[i] + " ,ways - " + ans[i]);
        // }

        if(ans[0] <= 0){
            return -1;
        }
        return ans[0];
    }

    static int minJump2(int a[]){
        int i = 0;
        int count = 0;

        while(i < a.length){
            System.out.println(i);
            if(i + a[i] >= a.length - 1){
                count++;
                break;
            }
            if(a[i] == 0){
                return -1;
            }
            int j = i + 1;
            int m = Integer.MIN_VALUE;
            int indi = 0;
            while(j <= i + a[i]){
                if(a[j] > m){
                    m = a[j];
                    indi = j;
                }
                j++;
            }
            count++;
            i = i + (indi - i);
        }
        return count;
    }

    public static void main(String[] args) {
         //int arr[] = {1, 0, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};

        //int arr[] = {2,3,1,1,2,4,2,0,1,1};

        //String s = "61 83 12 27 100 34 0 35 10 10 96 39 87 53 5 40 42 66 15 90 71 55 87 39 5 88 49 97 100 32 4 60 81 83 53 80 16 53 14 94 29 77 99 16 29 3 22 71 35 4 61 6 25 13 11 30 0 27 94 66 25 64 92 5 47 44 85 29 63 65 89 59 41 87 41 36 57 29 7 92 33 34 64";
        
        //String s = "2 1 0 3";

        String s = "10 8 12 17 1 21 5 17 20 11 5 27 23 8 12 18 16 12 9 8 17 12 23 26 0 5 9 24 10";

        String[] ss = s.split(" ");


        int arr[] = new int[ss.length];

        for(int i = 0;i < arr.length;i++){
            arr[i] = Integer.valueOf(ss[i]);
        }

        System.out.println(minJump2(arr));

        System.out.println(minJumps(arr));
    }
}
