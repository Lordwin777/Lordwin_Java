public class Perimeter_Shape
{

    public static double getPerimeter(double side) 
{
        return 4 * side;
    }

    public static double getPerimeter(double base, double height, double hypotenuse) 
{
        return base + height + hypotenuse;
    }

    public static double getPerimeter(double length, double width) 
{
        return 2 * (length + width);
    }

    public static double getPerimeter(double radius) 
{
        final double PI = 3.1415926;
        return 2 * PI * radius;
    }

    public static void main(String[] args) 
{
        System.out.println("Perimeter of square: " + getPerimeter(5));
        System.out.println("Perimeter of rectangle: " + getPerimeter(4, 6));
        System.out.println("Perimeter of right triangle: " + getPerimeter(3, 4, 5));
        System.out.println("Perimeter of circle: " + getPerimeter(7));
    }
}