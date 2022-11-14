import java.util.Scanner;

class MyException extends Exception
{
    public MyException(String s)
    {
        super(s);
    }
}

abstract class RowMaterial
{
    double goods;
    double st,sr;     
}
class ByRoad extends RowMaterial
{
    
}
class ByShip extends RowMaterial
{
    
}
class Railway extends ByRoad
{
    Scanner sc=new Scanner(System.in);
    void calculate()
    {
        System.out.println("Enter Goods :");
        goods = sc.nextDouble();
        if(goods <1)
        {
            try 
            {
                throw new MyException("Value less than one");
            }
            catch(MyException ex)
            {
               System.out.println(ex.getMessage());
            }
            
        }
        st = (double)(12*goods)/100;
        sr = (double)(3*st)/ 100;
    }
    void display()
    {
        System.out.println("Railway Service Tax: "+st);
        System.out.println("Railway Surcharge: "+sr);
    }
}
class Transport extends ByRoad
{
    Scanner sc=new Scanner(System.in);
    void calculate()
    {
        System.out.println("Enter Goods :");
        goods = sc.nextDouble();
        if(goods <1)
        {
            try 
            {
                throw new MyException("Value less than one");
            }
            catch(MyException ex)
            {
               System.out.println(ex.getMessage());
            }
        }
        
        st = (double)(12*goods)/100;
        sr = (double)(3*st)/ 100;
        
    }
    void display()
    {
        System.out.println("Transport Service Tax: "+st);
        System.out.println("Transport Surcharge: "+sr);
    }
}
class Ship extends ByShip
{
    Scanner sc=new Scanner(System.in);
    int c;
    
    void calculate()
    {
        System.out.println("Enter Goods :");
        goods = sc.nextDouble();
        if(goods < 1)
        {
            try 
            {
                throw new MyException("Value less than one");
            }
            catch(MyException ex)
            {
               System.out.println(ex.getMessage());
            }
        }
        else
        {
            System.out.println("Transporting Within Country?? 0/1");
            c=sc.nextInt();
            if(c==1)
            {
                st = (double)(10*goods)/100;
                sr = (double)(2*st)/100;
            }
            else
            {
                st = (double)(20*goods)/100;
                sr = (double)(2*st)/ 100;    
            }
        }
        
    }
    void display()
    {
        System.out.println("Ship Service Tax: " + st);
        System.out.println("Ship Surcharge: " + sr);
    }
}

public class Que12
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    
	    Railway r = new Railway();
	    Transport t = new Transport();
	    Ship s = new Ship();
	    int ch = 1;

	    while(ch!=4)
	    {
	        System.out.println("Select Number :"); 
	        System.out.println("1.Railway ");
	        System.out.println("2.Transport ");
	        System.out.println("3.Ship ");
            System.out.println("4.Exit ");
	        ch=sc.nextInt();
	        switch(ch)
	        {
	            
	            case 1:
	                r.calculate();
	                r.display();
	                break;
	            case 2:
	                t.calculate();
	                t.display();
	                break;
	            case 3:
	                s.calculate();
	                s.display();
	                break;
                case 4:
	                break;
	            default:
	                System.out.println("Please Enter Valid Number !!");
	            
	        }
	    }
	}
}
