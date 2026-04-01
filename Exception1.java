import java.util.Scanner;

class Divide extends Exception{
     public void calc(float a, float b){
        try{
        float res;
            res = a / b;
            if (b == 0){
                throw new ArithmeticException();
            }
            System.out.println("The result for " + a + "/" + b + "is:" + res);
        }
        catch(ArithmeticException e){
            System.err.print("Error: Division by zero not allowed");
        }
    }
}
public class Exception1{
    public static void main(String args[]){
        float a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerator: ");
        a = sc.nextFloat();
        System.out.println("Enter the denominator: ");
        b = sc.nextFloat();
        Divide d = new Divide();
        d.calc(a,b);
    }
}