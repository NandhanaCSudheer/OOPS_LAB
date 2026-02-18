import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class sortstr{
    public static void main(String args[]) throws IOException{
        String name[];
        int n;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no.of names you have to enter to sort: ");
        n=Integer.parseInt(br.readLine());
        name=new String[n];
        System.out.println("Enter the names: ");
        for(int i=0;i<n;i++){
            name[i]=br.readLine();
        }
        System.out.println("The names before sorting is: ");
        for(int i=0;i<n;i++){
        System.out.println(name[i]);
        }

        Arrays.sort(name);

        System.out.println("The names after sorting is: ");
        for(int i=0;i<n;i++){
            System.out.println(name[i]);
        }
    }
}