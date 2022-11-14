import java.util.Scanner;

class AgeNotWithinTheRange extends Exception
{
    public AgeNotWithinTheRange(String s)
    {
        super(s);
    }
}

class Driver
{
    String varno, name;
    int age;
    Driver(String name, String varno, int age)
    {
        this.name = name;
        this.varno = varno;
        this.age=age;
    }
    
}
public class Que7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name - ");  
        String name= sc.nextLine();  
        System.out.print("Enter Vehicle No - ");  
        String varno= sc.nextLine();   
        System.out.print("Enter Your age - ");  
        int age= sc.nextInt();
        
        if(age<18)
        {
            try {
            // Throw an object of user defined exception
            throw new AgeNotWithinTheRange("Not allow to drive");
        }
        catch (AgeNotWithinTheRange ex) 
        { 
            // Print the message from MyException object
            System.out.println(ex.getMessage());
            }
        }
        Driver d = new Driver(name,varno,age);
    }
}