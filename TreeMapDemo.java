import java.util.TreeMap;
public class TreeMapDemo
{
    public static void main (String[] args)
    {
        TreeMap<Integer, String> obj = new TreeMap<Integer, String>();
        String sobj1 = new String ("Value 1");
        String sobj2 = new String ("value 2");
        String sobj3 = new String ("value 3");
        String sobj4 = new String ("value 4");
        System.out.println("Size of TreeMap is: " + obj.size());

        obj.put(101, sobj1);
        obj.put(102, sobj2);
        obj.put(103, sobj3);
        obj.put(104, sobj4);
        obj.put(105, sobj1);

        System.out.println("\nTreeMap after adding the objects: " + obj);
        System.out.println("size of the Treemap after adding objects: " + obj.size());

         obj.remove(103);
         obj.remove(105);

        System.out.println("\nTreeMap after removing the objects: " + obj);
        System.out.println("size of the Treemap after removing objects: " + obj.size());
        
    }
}