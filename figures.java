import graphics.Area;
import java.io.*;

class Rectangle implements Area {
    public void area(float l, float b) {
        System.out.println("Area of rectangle is: " + l * b);
    }
}

class Triangle implements Area {
    public void area(float b, float h) {
        System.out.println("Area of triangle is: " + 0.5 * b * h);
    }
}

class Square implements Area {
    public void area(float l, float b) {
        System.out.println("Area of square is: " + l * l);
    }
}

class Circle implements Area {
    public void area(float r1, float r2) {
        System.out.println("Area of circle is: " + 3.14 * r1 * r1);
    }
}

public class figures {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        float r1, r2, s1, t1, t2, c1;

        System.out.println("Enter the length of the rectangle: ");
        r1 = Float.parseFloat(br.readLine());

        System.out.println("Enter the breadth of the rectangle: ");
        r2 = Float.parseFloat(br.readLine());

        System.out.println("Enter the base of the triangle: ");
        t1 = Float.parseFloat(br.readLine());

        System.out.println("Enter the height of the triangle: ");
        t2 = Float.parseFloat(br.readLine());

        System.out.println("Enter the size of the square: ");
        s1 = Float.parseFloat(br.readLine());

        System.out.println("Enter the radius of the circle: ");
        c1 = Float.parseFloat(br.readLine());

        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Square s = new Square();
        Circle c = new Circle();

        r.area(r1, r2);
        t.area(t1, t2);
        s.area(s1, s1);
        c.area(c1, c1);
    }
}