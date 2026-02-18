import java.io.*;

class A{
    void display(){
        System.out.println("Parent: A");
    }
}

class B extends A{
    void display(){
        super.display();
        System.out.println("First child: B");
    }
}

class C extends A{
    void display(){
        System.out.println("Second child: C");
    }
}

class Main{
    public static void main(String args[]) throws IOException{
        A ob;
        ob=new A();
        ob.display();
        ob=new B();
        ob.display();
        ob=new C();
        ob.display();
    }
}