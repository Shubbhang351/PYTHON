package OOPS;
import java.util.*;

class Student {
    String name;
    int age;

    public void introduxeYourself(){
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Student s =  new Student();
        s.name = "shubbhnag";
        s.age = 12;

        s.introduxeYourself();
    }
}
