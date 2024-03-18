class Shape
{
    void draw()
    {
        System.out.println("Draw the Shape ");
    }
}

class Circle extends Shape
{
    void draw()
    {
        System.out.println("Draw Circle");
    }
}

class Square extends Shape
{
    void draw()
    {
        System.out.println("Draw Square ");
    }
}

class OverloadingDemo
{
    public static void main(String[] args)
    {
        Circle c = new Circle();
        c.draw(); // child class
        Square sq = new Square();
        sq.draw(); // child class
        Shape sh = new Shape();
        sh.draw(); //child class
    }
}