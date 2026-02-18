// filename is used for compiling
// main class name is used for running java file
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Shape{

    void area(double r){
        System.out.println("The area of Circle is: "+ 3.14*r*r);
    }

    void area(float a){
        System.out.println("The area of Square is: "+ a*a);
    }

    void area(float a, float b){
        System.out.println("The area of Rectangle is: "+a*b);
    }

    void area(double a, double b){
        System.out.println("The area of Triangle is: "+0.5*a*b);
    }
}
class Area{

    public static void main(String args[]) throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double r,x,y;
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
        sh.area(x,y);
    }
}