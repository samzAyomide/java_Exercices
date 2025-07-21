public class classStringBufferDemo{
    public static void main(String[]args){
        StringBuffer msg = new StringBuffer("hello");
        msg.append(" world");
        msg.insert(5," beautiful" );
        msg.delete(5,15);
        msg.replace(6,11," universe");
        System.out.println("ensureCapacity"(100));
        System.out.println(msg.capacity());
        System.out.println(msg);
    }
}