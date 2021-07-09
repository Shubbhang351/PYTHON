import java.util.*;
class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.println(solve(0,3,0));
        // int t = sc.nextInt();
        // while(t-- > 0){
        //     int n = sc.nextInt();
        //     int ans = solve(0,n,0,"");
        //     System.out.println("#" + n + " : " + ans);
        // }
        List<String> l = new ArrayList();
        int n = 4;
        // int ans = solve(0,n,0,"",l);
        // System.out.println("#" + n + " : " + ans);
        // System.out.println(l);

        l = new ArrayList();
        n = 4;
        int ans = solve1(0,n,0,"",l);
        System.out.println("#" + n + " : " + ans);
        for(String o : l){
            String temp = o.replaceAll("bb+", "");
            if(temp.length() != o.length()){
                System.out.println("not " + o + " <--> " + temp);
            }
            else{
                System.out.println("yes " + o + " <--> " + temp);
            }
        }
        



    }

    public static int solve(int call,int n, int k,String ans,List<String> l){
        if(k == n){
            l.add(ans);
            return 1;
        }
        if(call == 0){
            return solve(1, n, k + 1, ans + "a", l) + solve(2, n, k + 1, ans + "b", l);
        }

        int one = 0;
        int two = 0;
        if(call == 1){
            one = solve(1, n, k + 1, ans + "a", l);
            two = solve(2, n, k + 1, ans + "b", l);
        }
        if(call == 2){   
            one = solve(1, n, k + 1, ans + "a", l);
        }
        return one + two;
    }

    public static int solve1(int call,int n, int k,String ans,List<String> l){
        if(k == n){
            l.add(ans);
            return 1;
        }

        int one = 0;
        int two = 0;
        one = solve1(1, n, k + 1, ans + "a", l);
        two = solve1(2, n, k + 1, ans + "b", l);
        return one + two;
    }
}