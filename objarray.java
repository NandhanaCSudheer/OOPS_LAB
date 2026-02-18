import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class objarray{
    int id;
    String name;
    public static void main(String args[]) throws IOException{
        int id1,id2;
        String n1,n2;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        objarray obj[]=new objarray[2];
        obj[0]=new objarray();
        obj[1]=new objarray();

        System.out.println("Enter the id of first person: ");
        id1=Integer.parseInt(br.readLine());
        System.out.println("Enter the name of first person: ");
        n1=br.readLine();

        
        System.out.println("Enter the id of second person: ");
        id2=Integer.parseInt(br.readLine());
        System.out.println("Enter the name of second person: ");
        n2=br.readLine();

        obj[0].id=id1;
        obj[0].name=n1;

        obj[1].id=id2;
        obj[1].name=n2;

        System.out.println("1st object: ");
        System.out.println("ID: "+obj[0].id);
        System.out.println("Name: "+obj[0].name);
        System.out.println("");

        System.out.println("2nd object: ");
        System.out.println("ID: "+obj[1].id);
        System.out.println("Name: "+obj[1].name);
    }
}