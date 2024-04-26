import java.util.*;
public class List
{
    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<String>();

        al.add("Mage");
        al.add("ArchMage");
        al.add("Sage");
        for(String s1:al)
        System.out.println("Elements : "+s1);

    
        al.remove("Ravi");
        for(String s2:al)
        System.out.println("After remove : " +s2);
        /*
        al.clear();
        System.out.println(al.size());
        */
    }
}