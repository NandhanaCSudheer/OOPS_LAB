import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class arrayofob{
    int eno;
    String ename;
    float salary;
    public static void main(String args[]) throws IOException{
        int eno1,eno2;
        String n1,n2;
        float s1,s2;
        int no;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        arrayofob obj[]=new arrayofob[2];
        obj[0]=new arrayofob();
        obj[1]=new arrayofob();

        System.out.println("Enter the employee number of first employee: ");
        eno1=Integer.parseInt(br.readLine());
        System.out.println("Enter the name of first employee: ");
        n1=br.readLine();
        System.out.println("Enter the salary of first employee: ");
        s1=Float.parseFloat(br.readLine());
        
        System.out.println("Enter the employee number of second employee: ");
        eno2=Integer.parseInt(br.readLine());
        System.out.println("Enter the name of second employee: ");
        n2=br.readLine();
        System.out.println("Enter the salary of second employee: ");
        s2=Float.parseFloat(br.readLine());

        obj[0].eno=eno1;
        obj[0].ename=n1;
        obj[0].salary=s1;

        obj[1].eno=eno2;
        obj[1].ename=n2;
        obj[1].salary=s2;

        System.out.println("Enter the employee number of the employee whose details to be searched: ");
        no=Integer.parseInt(br.readLine());
        System.out.println("The employee details : ");
        System.out.println("Employee Number: "+ obj[no].eno);
        System.out.println("Employee name: "+ obj[no].ename);
        System.out.println("Salary: "+ obj[no].salary);

        /* System.out.println("1st object: ");
        System.out.println("ID: "+obj[0].id);
        System.out.println("Name: "+obj[0].name);
        System.out.println("");

        System.out.println("2nd object: ");
        System.out.println("ID: "+obj[1].id);
        System.out.println("Name: "+obj[1].name); */
    }
}