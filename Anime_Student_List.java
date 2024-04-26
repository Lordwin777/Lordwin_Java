import java.util.*;
public class Anime_Student_List 

{
    public static void main(String[] args)
    {
        LinkedList<String> student = new LinkedList<String>();
        student.add("Goku");
        student.add("Vegeta");
        student.add("Yami");
        student.add("Asta");
        student.add("Yuno");
        student.add("Rin");
        student.add("Dark");
        student.add("Rimuru");
        student.add("Ichigo");
        student.add("Senku");
        student.add("Shivani -SC");
        System.out.println(student);

        student.addFirst("Void Shiki");
        System.out.println("The new List : "+student);
    }
}