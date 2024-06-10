//import java.lang.*;
public class hello implements Runnable{
    
   private Thread t;
   private String threadName;
   hello(String j)
   {
threadName=j;
   } 
   public void run()
   {
    while(true)
    System.out.print(threadName);
   }
   public void start()
   {
    if(t==null)
    {
        t=new Thread(this.threadName);t.start();
    }
   }
   

   }
   class jj
   {
    public static void main(String[] args) {
        hello h=new hello("h");
        hello j=new hello("k");
        j.start();
        h.start();
}
   }