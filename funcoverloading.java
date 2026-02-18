// filename is used for compiling
// main class name is used for running java file
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Shape{
    
    double ar;

    void area(double r){
        System.out.println("The area of Circle is: "+ 3.14*r*r);
    }

    void area(float a){
        System.out.println("The area of Square is: "+ a*a);
    }

    void area(float a, float b){
        System.out.println("The area of Rectangle is: "+a*b);
    }

    Double area(double a, double b){
        ar=0.5*a*b;
        return ar;
    }
}
class Area{

    public static void main(String args[]) throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double r,x,y,ar;
        float a,b,c;
        System.out.println("Enter the radius of the Circle: ");
        r=Double.parseDouble(br.readLine());
        System.out.println("Enter the length of the Square: ");
        a=Float.parseFloat(br.readLine());
        System.out.println("Enter the length of the Rectangle: ");
        b=Float.parseFloat(br.readLine());
        System.out.println("Enter the width of the Rectangle: ");
        c=Float.parseFloat(br.readLine());
        System.out.println("Enter the height of the Triangle: ");
        x=Double.parseDouble(br.readLine());
        System.out.println("Enter the base of the Triangle: ");
        y=Double.parseDouble(br.readLine());

        Shape sh=new Shape();
        sh.area(r);
        sh.area(a);
        sh.area(b,c);
        ar=sh.area(x,y);
        System.out.println("The area of Triangle is: "+ar);
    }
}