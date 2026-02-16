import java.io.*;

public class objarray{
    int id;
    String name;
    public static void main(String args[]) throws IOException{
        objarray obj[]=new objarray[2];
        obj[0]=new objarray();
        obj[1]=new objarray();

        obj[0].id=1;
        obj[0].name="abc";

        obj[1].id=2;
        obj[1].name="xyz";

        System.out.println("1st object: ");
        System.out.println("ID: "+obj[0].id);
        System.out.println("Name: "+obj[0].name);
        System.out.println("");

        System.out.println("2nd object: ");
        System.out.println("ID: "+obj[1].id);
        System.out.println("Name: "+obj[1].name);
    }
}