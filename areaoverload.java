import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Shape{

    float length, breadth;

    Shape(float a){
        length=a;
        breadth=a;
    }

    Shape(float b, float c){
        length=b;
        breadth=c;
    }

    void display(){
        if (length == breadth){
            System.out.println("The Area of Square is: "+ length * breadth);  
        }
        else{
            System.out.println("The Area of Rectangle is: "+ length * breadth);
        } 
    }
}

class Area{

    public static void main(String args[]) throws IOException{

        int a,b,c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length of square: ");
        a=Integer.parseInt(br.readLine());
        System.out.println("Enter the length of rectangle: ");
        b=Integer.parseInt(br.readLine());
        System.out.println("Enter the breadth of rectangle: ");
        c=Integer.parseInt(br.readLine());
        Shape c1=new Shape(a);
        Shape c2=new Shape(b,c);
        c1.display();
        c2.display();
    }
}