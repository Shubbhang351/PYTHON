package O;

public class P1{

    static class p3{
        int b = 30;

        public static void main(String[] args) {
            System.out.println("inner class p3");
        }
    }

	 int a = 10;
    void display(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        p3 m = new p3();
        System.out.println(m.b);
    }
}