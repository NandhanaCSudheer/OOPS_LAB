import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

interface Student{
    void displayStudentdetails(int id, String name, int std, float marks);
}

interface Sports{
    void displayevent(String event, float marks);
}

class Result implements Student, Sports{
    public int id;
    public int std;
    public String name;
    public String event;
    public float marks;
    public float smarks;
    public void displayStudentdetails(int id, String name, int std, float marks){
        this.id = id;
        this.name = name;
        this.std = std;
        this.marks = marks;

        System.out.println(" ");
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Standard: "+std);
        System.out.println("Subject Marks: "+marks);
    }
    public void displayevent(String event, float smarks){
        System.out.println(" Sport event: "+event);
         this.event = event;
        this.smarks = smarks;

        System.out.println("Sports marks: "+smarks);
    }
    public void displaytotal(){
        System.out.println("Total Marks: "+(marks + smarks));
    }
}
public class resultIntf{
    public static void main(String args[]) throws IOException{
        int i,c;
        String n,e;
        float m,sm;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the id of the student: ");
        i=Integer.parseInt(br.readLine());
        System.out.println("Enter the name of the student: ");
        n=br.readLine();
        System.out.println("Enter the Standard in which the student studies: ");
        c=Integer.parseInt(br.readLine());
        System.out.println("Enter the sport event participated by the student, if any (If not, give None): ");
        e=br.readLine();
        System.out.println("Enter the subject marks of the student: ");
        m=Float.parseFloat(br.readLine());
        System.out.println("Enter the sports marks of the student: ");
        sm=Float.parseFloat(br.readLine());
        Result s= new Result();
        s.displayStudentdetails(i,n,c,m);
        s.displayevent(e,sm);
        s.displaytotal();
    }
}