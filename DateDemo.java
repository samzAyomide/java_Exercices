import java.text.DateFormat;
import java.util.*;
public class DateDemo
 {
    public static void main(String [] args)
    {
        DateFormat df =
        DateFormat.getDateInstance(DateFormat.LONG, new Locale ("de", "DE"));
                String date = df.format (new Date());
                System.out.println(date);
    }
}