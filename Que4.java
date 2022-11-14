class Myclass implements Runnable
{
    Myclass()
    {
        Thread t = new Thread(this, "ChildThread");
        t.start();
    }
    public void run()
    {
        try
        {
            for(int i=15;i>=1;i--)
            {
                System.out.println("Child Thread " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException ex)
        {
            
        }
    }
}

public class Que4
{
    public static void main(String args[])
    {
        Thread t = Thread.currentThread();
        // System.out.println("Main thread is " + t);
        // t.setName("first");
        // System.out.println("Main thread is " + t);

        Myclass m = new Myclass();
        try 
        {
            for(int i=1;i<=15;i++)
            {
                System.out.println("Main Thread " + i);
                Thread.sleep(1000); 
            }
        } 
        catch (Exception e) 
        {
            
        }
    }
}