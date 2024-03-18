class Sound
{
    void sound()
    {
        System.out.println("Animal Sound : ");
    }
}

class Dog extends Sound
{
    void sound()
    {
        System.out.println("Bow-Bow");
    }
}

class Cat extends Sound
{
    void sound()
    {
        System.out.println("Meow-Meow");
    }
}

class Lion extends Sound
{
    void sound()
    {
        System.out.println("Roar");
    }
}

class Animal_Sounds
{
    public static void main (String[] args)
    {
        Sound sou = new Sound();
        sou.sound();
        Dog d = new Dog();
        d.sound();
        Cat c = new Cat();
        c.sound();
        Lion l = new Lion();
        l.sound();
        
    }
}