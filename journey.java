import java.util.*;

import javax.management.Query;


class Journey {
    public static int journeyToMoon(int n, List<List<Integer>> astronaut) {

        ArrayList<Integer>[] l = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            l[i] = new ArrayList<Integer>();
        }

        for (List<Integer> o : astronaut) {
            int a = o.get(0);
            int b = o.get(1);

            l[a].add(b);
            l[b].add(a);
        }

        int[] aa = new int[n];

        int g = 1;

        for(int i = 0;i < aa.length;i++){
            if(aa[i] == 0){
                bfs(aa, g, i, l);
                g++;
            }
        }

        if(g - 1 == 1){
            return 0;
        }

        int[] ans = new int[g - 1];

        for(int i = 0;i < aa.length;i++){
            ans[aa[i] - 1]++;
        }

        System.out.println(Arrays.toString(aa));
        System.out.println(Arrays.toString(ans));

        int f_ans = 0;

        for(int i = 0;i < ans.length;i++){
            for(int j = i + 1;j < ans.length;j++){
                f_ans = f_ans + ans[i] * ans[j];
                
            }
        }

        System.out.println(f_ans);

        return f_ans;

    }

    public static void bfs(int[] aa, int g, int k, ArrayList<Integer>[] l){
        ArrayList<Integer> o = l[k];
        if(o.size() == 0){
            aa[k] = g;
            return;
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(k);
        while(q.isEmpty() == false){
            int ele = q.poll();
            if(aa[ele] == 0){
                aa[ele] = g;
            }
            for(int i : l[ele]){
                if(aa[i] == 0){
                    q.add(i);
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // List<List<Integer>> aa = new ArrayList<>();
        // int m = sc.nextInt();
        // int n = sc.nextInt();
        // for(int i = 0;i < m;i++){
        //     int a = sc.nextInt();
        //     int b = sc.nextInt();
        //     List<Integer> temp = new ArrayList();
        //     temp.add(a);
        //     temp.add(b);
        //     aa.add(temp);
        // }

        // int ans = journeyToMoon(n, aa);
        // System.out.println(ans);
        
    }
}
