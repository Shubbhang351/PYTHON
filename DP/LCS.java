import java.util.Scanner;

class LCS {
    
    public static int LCSREcursion(String s1, String s2, int i, int j){
        if(i == s1.length() || j == s2.length()){
            return 0;
        }

        if(s1.charAt(i) == s2.charAt(j)){
            return 1 + LCSREcursion(s1, s2, i + 1, j + 1);
        }
        else{
            int a = LCSREcursion(s1, s2, i, j + 1);

            int b = LCSREcursion(s1, s2, i + 1, j);

            return Math.max(a, b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(s1 + " " + s2);

        System.out.println(LCSREcursion(s1, s2, 0, 0));
    }
}
