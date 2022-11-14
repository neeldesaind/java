class Shape
{
    double dim1, dim2;

    void Area()
    {
        System.out.println("Area from superclass");        
    }
}

class Rectangle extends Shape
{
    
    Rectangle(double l, double b)
    {
        this.dim1 = l;
        this.dim2 = b;
    }
    void Area()
    {
        double a = (dim1 * dim2);
        System.out.println("Area of Rectangle is " + a);
    }
}

class Circle extends Shape
{
    Circle(double r)
    {
        this.dim1 = r;
    }

    void Area()
    {
        double a = (3.14 * dim1 * dim1);
        System.out.println("Area of Circle is " + a);
    }
}

class Triangle extends Shape
{
    Triangle(double b, double h)
    {
        this.dim1 = b;
        this.dim2 = h; 
    }
    void Area()
    {
        double a = (0.5 * dim1 * dim2);
        System.out.println("Area of Triangle is " + a);
    }
}

public class Que9
{
    public static void main(String args[])
    {
        Shape s1 = new Rectangle(10, 15);
        Shape s2 = new Triangle(2, 10);
        Shape s3 = new Circle(20);

        s1.Area();
        s2.Area();
        s3.Area();
    }
}