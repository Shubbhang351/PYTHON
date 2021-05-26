import java.util.*;

class bear {
    
    public static int solve(String s, int i, int[] arr, String ans){
        if(arr[0] == arr[1] && arr[0] == arr[2] && arr[0] == arr[3]){
            System.out.println(ans);
            return ans.length();
        }

        if(i == s.length()){
            return s.length() + 1;
        }


        int change = 0;
        // change
        if(s.charAt(i) == 'A'){
            // change A to C
            arr[1] += 1;
            arr[0] -= 1;
            int c = solve(s, i + 1, arr, ans + i);
            arr[1] -= 1;
            arr[0] += 1;

            // change A to G
            arr[2] += 1;
            arr[0] -= 1;
            int g = solve(s, i + 1, arr, ans + i);
            arr[2] -= 1;
            arr[0] += 1;

            // change A to t
            arr[3] += 1;
            arr[0] -= 1;
            int t = solve(s, i + 1, arr, ans + i);
            arr[3] -= 1;
            arr[0] += 1;
            
            change = Math.min(c, Math.min(g,t));
        }
        else if(s.charAt(i) == 'C'){
            // change C to A
            arr[0] += 1;
            arr[1] -= 1;
            int a = solve(s, i + 1, arr, ans + i);
            arr[0] -= 1;
            arr[1] += 1;

            // change C to G
            arr[2] += 1;
            arr[1] -= 1;
            int g = solve(s, i + 1, arr, ans + i);
            arr[2] -= 1;
            arr[1] += 1;

            // change C to T
            arr[3] += 1;
            arr[1] -= 1;
            int t = solve(s, i + 1, arr, ans + i);
            arr[3] -= 1;
            arr[1] += 1;

            change = Math.min(a, Math.min(g,t));
        }
        else if(s.charAt(i) == 'G'){
            // change G to A
            arr[0] += 1;
            arr[2] -= 1;
            int a = solve(s, i + 1, arr, ans + i);
            arr[0] -= 1;
            arr[2] += 1;

            // change G to C
            arr[1] += 1;
            arr[2] -= 1;
            int c = solve(s, i + 1, arr, ans + i);
            arr[1] -= 1;
            arr[2] += 1;

            // change G to A
            arr[3] += 1;
            arr[2] -= 1;
            int t = solve(s, i + 1, arr, ans + i);
            arr[3] -= 1;
            arr[2] += 1;

            change = Math.min(a, Math.min(c, t));
        }
        else{
            // change T to A
            arr[0] += 1;
            arr[3] -= 1;
            int a = solve(s, i + 1, arr, ans + i);
            arr[0] -= 1;
            arr[3] += 1;

            // change T to C
            arr[1] += 1;
            arr[3] -= 1;
            int c = solve(s, i + 1, arr, ans + i);
            arr[1] -= 1;
            arr[3] += 1;

            // change T to A
            arr[2] += 1;
            arr[3] -= 1;
            int g = solve(s, i + 1, arr, ans + i);
            arr[2] -= 1;
            arr[3] += 1;

            change = Math.min(a, Math.min(c,g));
        }


        int no_change = solve(s, i + 1, arr, ans);

        int f_ans = Math.min(change, no_change);
        return f_ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();

        int arr[] = new int[4];
        for(int i = 0;i < s1.length();i++){
            if(s1.charAt(i) == 'A'){
                arr[0]++;
            }
            else if(s1.charAt(i) == 'C'){
                arr[1]++;
            }
            else if( s1.charAt(i) == 'G'){
                arr[2]++;
            }
            else{
                arr[3]++;
            }
        }

        System.out.println(solve(s1, 0, arr, ""));
    }


}
