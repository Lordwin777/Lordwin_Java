import java.util.Scanner;

public class Volume_Cylinder_A
{
    public static void main(String[] args) 
    {
        Cylinder cylinder = new Cylinder();
        cylinder.inputRadius();
        cylinder.inputHeight();
        cylinder.calculateVolume();
        System.out.println("The volume of the cylinder is: " + cylinder.volume);
    }
}

class Cylinder 
{
    Scanner sc = new Scanner(System.in);
    int radius, height, volume;

    void inputRadius() 
    {
        System.out.println("Radius : ");
        radius = sc.nextInt();
    }

    void inputHeight() 
    {
        System.out.println("Height : ");
        height = sc.nextInt();
    }

    void calculateVolume() 
    {
        volume = (int) (Math.PI * radius * radius * height);
    }
}