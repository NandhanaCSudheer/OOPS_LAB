import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class parent{
    int id,salary;
    String name,address;

    parent(int id, String name, int salary, String address){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.address=address;
    }
}

class child extends parent{
    String dept,sub;

    child(int id, String name, int salary, String address, String dept, String sub){
        super(id, name, salary, address);
        this.dept=dept;
        this.sub=sub;
    }

    void display(){
        System.out.println("The ID : "+id);
        System.out.println("The Name : "+name);
        System.out.println("The Salary : "+salary);
        System.out.println("The Address : "+address);
        System.out.println("The Department : "+dept);
        System.out.println("The Subject name : "+sub);
    }
}

class Inheritance{

    public static void main(String args[]) throws IOException{

        child ch= new child(1, "Abc", 50000, "abcvilasam", "MCA", "Java");
        ch.display();
    }
}