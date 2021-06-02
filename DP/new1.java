import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();

        if(s.length() > 1){
            System.out.println("double character are not allowed");
            System.exit(0);
        }

        char ch = s.charAt(0);

        int ans = ch;

        System.out.println(ans);
    }
}

