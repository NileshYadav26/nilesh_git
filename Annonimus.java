import java.util.*;

class Run implements Runnable{
   public void run()
   {
    System.out.println("run");
   }
}
class Faltu {
   public static void main(String[] args) {
    Run r=new Run();
   Thread t=new Thread(r)
    {
        public void run()
        {
            System.out.println("anonimus");
        }
    };
    t.start();


    }
}