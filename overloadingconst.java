import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Complex{

    int real, img;

    Complex(int a){
        real=a;
        img=a;
    }

    Complex(int b, int c){
        real=b;
        img=c;
    }

    void display(){
        System.out.println("The Complex number is: "+real+ " + "+img+ "i");   
    }
}

class Complexno{

    public static void main(String args[]) throws IOException{

        int r,r1,i1;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value only for real part: ");
        r=Integer.parseInt(br.readLine());
        System.out.println("Enter the value for second real part: ");
        r1=Integer.parseInt(br.readLine());
        System.out.println("Enter the value only for second imaginary part: ");
        i1=Integer.parseInt(br.readLine());
        Complex c1=new Complex(r);
        Complex c2=new Complex(r1,i1);
        c1.display();
        c2.display();
    }
}