import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arraysort{
    public static void main(String args[]) throws IOException{
        int arr[];
        int temp,n,val,i,j,found=0;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array: ");
        n=Integer.parseInt(br.readLine());
        arr=new int[n];
        for(i=0;i<n;i++){
            System.out.println("Enter the values: ");
            arr[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the value to be searched in the array: ");
        val=Integer.parseInt(br.readLine());
        for(j=0;j<n;j++){
            if(arr[j]==val){
                System.out.println("Element found at location: " + j);
                found=1;
            }
        }
        if(found==0){
            System.out.println("Element not found!!!");
        }
        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
         System.out.println("The sorted array is: ");
         for(i=0;i<n;i++){
            System.out.println(arr[i]);
         }
    
    }
}