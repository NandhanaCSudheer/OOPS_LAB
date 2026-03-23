import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Sortstring{
    public static void main(String args[])throws IOException{
        String s[];
        int n;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no.of strings to be sorted: ");
        n=Integer.parseInt(br.readLine());
        s=new String[n];
        System.out.println("Enter the strings to be sorted: ");
        for(int i=0;i<n;i++){
            s[i]=br.readLine();
        }
        System.out.println("\n The strings before sorting: \n");
        for(int i=0;i<n;i++){
            System.out.println(s[i]);
        }
        System.out.println("\n The strings after sorting: \n");
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-i-1; j++) {
                if(s[j].compareTo(s[j+1]) > 0) {
                    String temp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(s[i]);
        }
    }
}


