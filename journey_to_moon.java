import java.util.LinkedList;
import java.util.*;

class journey_to_moon {
    public static long journeyToMoon(int n, List<List<Integer>> astronaut) {

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

        boolean[] visited = new boolean[n];

        long answer = 0;
        long prev_groups = 0;
        long same_group_members = 0;

        for(int i = 0;i < visited.length;i++){
            if(visited[i] == false){
                same_group_members = bfsVisit(visited, l, i);
            }
            answer = answer + prev_groups * same_group_members;
            prev_groups = prev_groups + same_group_members;
            same_group_members = 0;
        }

        return answer;
    }

    public static int bfsVisit(boolean[] visited, ArrayList<Integer>[] l, int i){
        int same_country_member = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while(q.isEmpty() == false){
            int presentNode = q.poll();
            if(visited[presentNode] == false){
                same_country_member++;
                visited[presentNode] = true;
            }

            for(int neighbour : l[presentNode]){
                if(visited[neighbour] == false){
                    q.add(neighbour);
                }
            }
        }

        return same_country_member;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 100000;
        List<List<Integer>> l = new ArrayList();
        for(int i = 0;i < 2;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            List<Integer> temp = new ArrayList();
            temp.add(a);
            temp.add(b);
            l.add(temp);
        }
        System.out.println(journeyToMoon(n, l));
    }
}
