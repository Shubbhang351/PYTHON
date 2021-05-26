import java.util.*;

class bear2 {

    public static void solve(String s, int start, String ans, int A, int C, int G, int T, List<Integer> l){

        if(A == C && C == G && G == T){
            //System.out.println(ans);
            l.add(ans.length());
            return;
        }


        for(int i = start; i < s.length();i++){

            String n_ans = ans + i;
            if(s.charAt(i) == 'A'){
                //change A to C
                solve(s, i + 1, n_ans, A - 1, C + 1, G, T, l);

                //change A to G
                solve(s, i + 1, n_ans, A - 1, C, G + 1, T, l);

                //change A to T
                solve(s, i + 1, n_ans, A - 1, C, G, T + 1, l);
            }
            if(s.charAt(i) == 'C'){
                // change C to A
                solve(s, i + 1, n_ans, A + 1, C - 1, G, T, l);

                // change C to G
                solve(s, i + 1, n_ans, A, C - 1, G + 1, T, l);

                //change C to T
                solve(s, i + 1, n_ans, A, C - 1, G, T + 1, l);
            }
            if(s.charAt(i) == 'G'){
                // change G to A
                solve(s, i + 1, n_ans, A + 1, C, G - 1, T, l);

                //change G to C
                solve(s, i + 1, n_ans, A, C + 1, G - 1, T, l);

                //change G to T
                solve(s, i + 1, n_ans, A, C, G - 1, T + 1, l);
            }
            if(s.charAt(i) == 'T'){
                //change T to A
                solve(s, i + 1, n_ans, A + 1, C, G, T - 1, l);

                //change T to G
                solve(s, i + 1, n_ans, A, C, G + 1, T - 1, l);

                //change T to C
                solve(s, i + 1, n_ans, A, C + 1, G, T - 1, l);
            }

            solve(s, i + 1, n_ans, A, C, G, T, l);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int A = 0;
        int C = 0;
        int G = 0;
        int T = 0;

        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == 'A'){
                A++;
            }
            if(s.charAt(i) == 'C'){
                C++;
            }
            if(s.charAt(i) == 'G'){
                G++;
            }
            if(s.charAt(i) == 'T'){
                T++;
            }
        }

        List<Integer> l = new ArrayList<>();


        solve(s, 0, "", A, C, G, T, l);

        System.out.println(Collections.min(l));

        
    }
}
