import java.util.*;
class Interface
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("1. Turn Left");
        System.out.println("2. Turn Right");
        System.out.println("3. Accelerate");
        System.out.println("4. Brake");
        System.out.println("5. Reverse");
        System.out.print("Enter a option to drive the car : ");
        n = sc.nextInt();
        Drive d = new Drive();
        switch (n)
        {
            case 1:
                d.turnLeft();
                break;
            case 2:
                d.turnRight();
                break;
            case 3:
                d.accelerate();
                break;
            case 4:
                d.brake();
                break;
            case 5:
                d.reverse();
                break;
            default:
                System.out.println("Invalid Option");
                System.out.println("Choose between 1 to 5");
                break;
        }
	}
}

class Drive implements Steer
{
    public void turnLeft()
    {
        System.out.println("Turning Left");
    }
    public void turnRight()
    {
        System.out.println("Turning Right");
    }
    public void accelerate()
    {
        System.out.println("Speeding Up");
    }
    public void brake()
    {
        System.out.println("Slowing Down");
    }
    public void reverse()
    {
        System.out.println("Backing Up");
    }
}

interface Car
{
    public void accelerate();
    public void brake();
    public void reverse();
}

interface Steer extends Car
{
    public void turnLeft();
    public void turnRight();
}