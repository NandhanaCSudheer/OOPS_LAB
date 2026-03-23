import java.io.IOException;

class Principal{
    String pname;
    int pcode;
    Principal(String pname, int pcode){
        this.pname=pname;
        this.pcode=pcode;
    }
}
class Teacher extends Principal{
    String tname;
    String sub;
    String dept;
    Teacher(String pname, int pcode, String tname, String sub, String dept){
        super(pname, pcode);
        this.tname=tname;
        this.sub=sub;
        this.dept=dept;
    }
}
class Student extends Teacher{
    String sname;
    int id;
    Student(String pname, int pcode, String tname, String sub, String dept, String sname, int id){
        super(pname,pcode, tname, sub, dept);
        this.sname=sname;
        this.id=id;
    }
    void display(){
        System.out.println("Name of the Principal: "+pname);
        System.out.println("Principal code: "+pcode);
        System.out.println("Name of the Teacher: "+tname);
        System.out.println("Subject of the Teacher: "+sub);
        System.out.println("Department of the Teacher: "+dept);
        System.out.println("Name of the Student: "+sname);
        System.out.println("ID of the Student: "+id);
    }
     public static void main(String args[]) throws IOException{
        Student s1=new Student("A",123,"abc","Maths","BSC Maths","xyz",456);
        s1.display();
    }
}
