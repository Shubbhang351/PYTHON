import java.util.*;

class try1 {

    public static void solve1(int[] arr){

        
        int b[] = new int[arr.length];
        for(int i = 0;i < b.length;i++){
            b[i] = arr[i];
        }

        System.out.print("initial  ");
        System.out.println(Arrays.toString(b));

        int dupli = 0;

        for(int i = 0;i < b.length;i++){
            if(b[i] != 0){
                if(b[i] % 3 == 0){
                    dupli = dupli + (b[i] / 3);
                    b[i] = 0;
                }
                else if(b[i] < 3){
                    continue;
                }
                else{
                    dupli = dupli + (b[i] / 3);
                    b[i] = b[i] - (3 * (b[i] / 3));
                }
            }
        }

        System.out.print("after dupli  ");
        System.out.println(Arrays.toString(b));

        int single = 0;
        for(int i = 0;i <= b.length - 3;i++){
            if(b[i] != 0 && b[i + 1] != 0 && b[i + 2] != 0){
                int mini = Math.min(b[i], Math.min(b[i + 1], b[i + 2]));
                single = single + mini;
                b[i + 1] -= mini;
                b[i + 2] -= mini;
                b[i] -= mini;
            }
        }

        System.out.print("after single  ");
        System.out.println(Arrays.toString(b));

        //System.out.println(Arrays.toString(arr));

        int ans = dupli + single;

        System.out.print("dupli + single  ");

        System.out.println(ans);
    }

    public static void solve2(int arr[]){

        int b[] = new int[arr.length];
        for(int i = 0;i < b.length;i++){
            b[i] = arr[i];
        }

        int single = 0;
        for(int i = 0;i <= b.length - 3;i++){
            if(b[i] != 0 && b[i + 1] != 0 && b[i + 2] != 0){
                int mini = Math.min(b[i], Math.min(b[i + 1], b[i + 2]));
                single = single + mini;
                b[i + 1] -= mini;
                b[i + 2] -= mini;
                b[i] -= mini;
            }
        }

        int dupli = 0;

        for(int i = 0;i < b.length;i++){
            if(b[i] != 0){
                if(b[i] % 3 == 0){
                    dupli = dupli + (b[i] / 3);
                    b[i] = 0;
                }
                else if(b[i] < 3){
                    continue;
                }
                else{
                    dupli = dupli + (b[i] / 3);
                    b[i] = b[i] - (3 * (b[i] / 3));
                }
            }
        }

        

        int ans = dupli + single;

        System.out.print("single + duple ");
        System.out.println(ans);

    }
    
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int m = sc.nextInt();

        
        // int b[] = new int[m + 1];
        

        // for(int i = 0;i < n;i++){
        //     int temp = sc.nextInt();
        //     b[temp]++;
        // }

        int b[] = new int[7];

        // int a[] = {1,1,5,1,2,3,3,2,4,2,3,4,5};

        int a[] = {1,5,3,3,3,4,3,5,3,2,3,3};

        Arrays.sort(a);

        System.out.println(Arrays.toString(a));

        for(int i = 0;i < a.length;i++){
            b[a[i]]++;
        }

        System.out.println(Arrays.toString(b));

        solve1(b);
        solve2(b);

    }
}
