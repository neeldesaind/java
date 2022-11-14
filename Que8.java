import java.util.*;

abstract class Lib
{
    int java=100, sql=150, cg=50;
    
    abstract void submit();
    abstract void issue();
}

interface student
{
    void info();
}

interface staff
{
    void info();
}

class LibTransitions extends Lib
{
    Scanner sc = new Scanner(System.in);
    void submit()
    {
        System.out.println("Which Book You want to Submit? Java/SQL/CG ?");
        String s = sc.next();
        
        if(s.equalsIgnoreCase("java"))
        {
            if(java==100)
            {
                System.out.println("Invalid Submit");
            }
            else
            {
                java++;
                System.out.println("Book Submitted");
                System.out.println("Stock: " + java);
            }
        }
        
        else if(s.equalsIgnoreCase("sql"))
        {
            if(sql==150)
            {
                System.out.println("Invalid Submit");
            }
            else
            {
                sql++;
                System.out.println("Book Submitted");
                System.out.println("Stock: " + sql);
            }
        }
        
        else if(s.equalsIgnoreCase("cg"))
        {
            if(cg==50)
            {
                System.out.println("Invalid Submit");
            }
            else
            {
                cg++;
                System.out.println("Book Submitted");
                System.out.println("Stock: " + cg);
            }
        }
        else
        {
            System.out.println("Invalid book name");
        }
    }
    
    void issue()
    {
        System.out.println("Which Book You want to Issue? Java/SQL/CG ?");
        String s = sc.next();
        
        if(s.equalsIgnoreCase("java"))
        {
            if(java==0)
            {
                System.out.println("No More Books");
            }
            else
            {
                java--;
                System.out.println("Book Issued");
                System.out.println("Stock: " + java);
            }
            
        }
        
        else if(s.equalsIgnoreCase("sql"))
        {
            if(sql==0)
            {
                System.out.println("No More Books");
            }
            else
            {
                sql--;
                System.out.println("Book Issued");
                System.out.println("Stock: " + sql);
            }
        }
        
        else if(s.equalsIgnoreCase("cg"))
        {
            if(cg==0)
            {
                System.out.println("No More Books");
            }
            else
            {
                cg--;
                System.out.println("Book Issued");
                System.out.println("Stock: " + cg);
            }
        }
        else
        {
            System.out.println("Invalid book name");
        }
    }
}

public class Que8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
	    
        LibTransitions lt = new LibTransitions();
        
        int ch=1;
        while(ch!=0)
        {
            System.out.println("Select Number :");
            System.out.println("0.Exit ");
            System.out.println("1.Submit ");
            System.out.println("2.Issue ");
            
            ch=sc.nextInt();
            switch(ch)
            {
                case 0:
                    break;
                case 1:
                    lt.submit();
                    break;
                case 2:
                    lt.issue();
                    break; 
                default:
                    System.out.println("Please Enter Valid Number !!");
            }
        }
    }
}