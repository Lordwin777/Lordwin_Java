class Person
{
    private String name;
    private int age;
    public String getName()  
    {return name; }
    public void setName(String name) 
    {this.name = name; }
    public int getAge() 
    {return age; }
    public void setAge(int age)  
    {this.age = age; }
}

 class Person_person
{
    public static void main(String[] args)
    {
        Person p = new Person();
        p.setName("Lordwin");
        p.setAge(18);

        System.out.println("Name : "+p.getName);
        System.out.println("Age : "+p.getAge);
    }
}
