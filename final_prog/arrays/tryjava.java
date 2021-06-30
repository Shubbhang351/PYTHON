class p{
    void m(){
        System.out.println("p");
    }
}

class c extends p{
    void m(){
        super.m();
        System.out.println("c");
    }
}

class check{
    public static void main(String args[]){
        p o = new c();
        o.m();
    }
}