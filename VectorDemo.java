import java.util.ListIterator;
import java.util.Vector;
public class VectorDemo
{
    public static vooid main (String[] args)   
    {
           Vector<Double> obj = new Vector<Double>();
    Double dobj1 = new Double(77.5);
    Double dobj2 = new Double(68.1);
    Double dobj3 = new Double(52.8);
    Double dobj4 = new Double(40.2);
    System.out.println("size of vector is : " + obj.size());

    obj.add(dobj1);
    obj.add(dobj2);
    obj.add(dobj3);
    obj.add(dobj4);
    obj.add(dobj1);

    System.out.println("\nVector after adding the objects : " + obj);
    System.out.println("size of vector after adding object : " + obj.size());

    obj.remove(dobj1);
    obj.remove (dobj3);

     System.out.println("\nVector after removing the objects : " + obj);
    System.out.println("size of vector after removing object : " + obj.size());

    System.out.println("\nthe final Vector: ");
    ListIterator i = obj.ListIterator();
    while(i.hasNext ())
        {
        System.out.println(i.next());

         }

    }   
} 