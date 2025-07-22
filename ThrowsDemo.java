public class ThrowsDemo
{
    void display () throws Exception
    {
        throw new Exception();
    }
    public static void main (String [] args){
        ThrowsDemo obj1 = new ThrowsDemo();
        try
        {
            obj1.display();
        }
        catch (Exception e)
        {
            System.out.println("Runtime Exception raised");
        }
    }
}