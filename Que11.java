import java.util.Scanner;

class Fib
{
    void fibo()
    {
        int n1=1,n2=1,n3,i,count=10;    
        System.out.print(n1+" "+n2);//printing 1 and 1    

        for(i = 2 ;i < count; ++i)//loop starts from 2 because 1 and 1 are already printed    
        {    
            n3=n1+n2;    
            System.out.print(" "+n3);    
            n1=n2;    
            n2=n3;    
        } 
        System.out.println();
    }
    void fibo(int terms)
    {
        int n1=1,n2=1,n3,i;   
        System.out.println("Number of Terms : " + terms);
        System.out.print(n1+" "+n2);//printing 1 and 1    

        for(i=2;i < terms;++i)//loop starts from 2 because 1 and 1 are already printed    
        {    
            n3=n1+n2;    
            System.out.print(" "+n3);    
            n1=n2;    
            n2=n3;    
        }  
    }
    void fibo(int start, int end)
    {   
        System.out.print("\nSTART: " + start + " END: " + end + "\n");
        
        int n1=1, n2=1, n3; 
        
        if(n1 >= start)
        {
            System.out.print(n1 + " " + n2 + " "); //printing 1 and 1
        }

        while(n1 <= end)
        {
            n3 = n1 + n2;
            if(n3>=start && n3 <= end)
            {
                System.out.print(n3 + " ");        
            }
            n1 = n2;
            n2 = n3;
        }
    }
}
public class Que11 {
    public static void main(String[] args)
    {
        Fib f = new Fib();
        f.fibo();
        f.fibo(15);
        f.fibo(5, 100);  
    }
}