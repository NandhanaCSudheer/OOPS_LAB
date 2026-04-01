import java.util.Scanner;

class NegativeException extends Exception{
    NegativeException(String msg){
        super(msg);
    }
}

public class NegativenoException{
    public static void main(String args[]){
        int arr[],n,i,j,a;
        float sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of elements: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements: ");
        try{
            for(i=0;i<n;i++){
                a = sc.nextInt();
                if(a<0){
                    throw new NegativeException("Enter positive numbers");
                }
            }
        }
        catch (NegativeException e){
            System.out.println("RuntimeError "+e.getMessage());
        }
        for (j=0;j<n;j++){
            sum = sum + arr[j];
        }
        System.out.println("The average of given numbers is = "+ sum/2);
    }
}