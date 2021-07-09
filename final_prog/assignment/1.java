import java.util.*;
@SuppressWarnings("unchecked")
public class Main {
    public static List<String> l = new ArrayList();
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            
            int ans = solve1(0,n,0,"");
            System.out.println(l);
            int count = 0;
            for(String o : l){
                String temp = o.replaceAll("bb+","");
                if(o.length() == temp.length()){
                    System.out.print("yes " + o + " <--> " + temp + "\n");
                }
                else{
                    System.out.print("no " + o + " <--> " + temp + "\n");
                }
            }
            
        System.out.println("#" + n + " : " + count);
        l = new ArrayList();
        }

    }


    public static int solve1(int call,int n, int k,String ans){
        if(k == n){
            l.add(ans);
            return 1;
        }

        int one = 0;
        int two = 0;
        one = solve1(1, n, k + 1, ans + "a");
        two = solve1(2, n, k + 1, ans + "b");
        return one + two;
    }
}