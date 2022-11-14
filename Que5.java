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
            int num, i, sum;
      
            //System.out.println("Perfect Numbers between 1 to 100");
            
            for(num=1; num<=100; num++)
            {
                    sum = 0;
                    for(i=1; i<num; i++)
                    {
                        if(num%i==0)
                        sum = sum+i;
                    }
                    if(sum==num)
                        System.out.print("Perfect: " + num + " ");
                        Thread.sleep(100);
                    }
        }
        catch(InterruptedException ex)
        {
    
        }
    }
}

public class Que5 {
    public static void main(String args[])
    {
        Thread t = Thread.currentThread();
        Myclass m = new Myclass();
        try 
        {
            int i = 0;
            int num = 0;
       
        for (i = 1; i <= 100; i++) 
        {
            int counter = 0;
            for (num = i; num >= 1; num--) 
            {
                // condition to check if the number is prime
                if (i % num == 0) 
                {
                    // increment counter
                    counter = counter + 1;
                }
            }
           
            if (counter == 2) 
            {
                System.out.print("Prime: " + i + " ");
                Thread.sleep(1000);              
            }   
        } 
        
    }
    catch (Exception e) 
        {
            
        }
    }
}