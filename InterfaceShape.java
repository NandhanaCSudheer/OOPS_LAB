interface Shape{
    void area(float a, float b);
    void perimeter(float a, float b);
}

class Square implements Shape{
    public void area(float a, float b){
        System.out.println("The Area of Square is: "+a * a);
    }
    public void perimeter(float a, float b){
        System.out.println("The perimeter of Square is: "+4 * a);
    }
}
class Rectangle implements Shape{
    public void area(float a, float b){
        System.out.println("The Area of Rectangle is: "+a * b);
    }
    public void perimeter(float a, float b){
        System.out.println("The perimeter of Rectangle is: "+2 * (a + b));
    }
}
public class InterfaceShape{
    public static void main(String args[]){
        Square s=new Square();
        Rectangle r = new Rectangle(); 
        s.area(5,5);
        s.perimeter(5,5);
        r.area(5,5);
        r.perimeter(5,5);
        r.area(5,6);
        r.perimeter(5,6);
    }
}