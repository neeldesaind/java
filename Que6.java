import java.io.*;
import java.util.Scanner;

class MarksOutOfBoundException extends Exception
{
    public String toString()
    {
        return "INVALID INPUT!!! PLEASE ENTER MARKS BETWEEN 1 AND 100";
    }
}

class Student1
{
    int rno;
    int marks[];
    Scanner sc = new Scanner(System.in);
    Student1()
    {
        rno=0;
        marks=new int[4];
        for(int i=0;i<4;i++)
        {
            marks[i]=0;
        }
            
    }
    public void accept()
    {
        System.out.println("Enter roll no and marks of 4 subjects");
        try
        {
            rno=sc.nextInt();
            
            for(int i=0;i<4;i++)
            {
                marks[i]=sc.nextInt();
                
                if(marks[i]<0 || marks[i]>100)
                {
                    throw new MarksOutOfBoundException();
                }                   
            }
        }
        catch(MarksOutOfBoundException me)
        {
            System.out.println(me);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bounds");
        }
    }

    public void display()
    {
        System.out.println("Roll no\tMarks1\tMarks2\tMarks3\tMarks4");
        System.out.print(rno + "\t");
        for(int i=0;i<4;i++)
        {
            System.out.print(marks[i]+"\t");
        }
        
    }
}
public class Que6 {
    public static void main(String[] args)
    {
        Student1 obj = new Student1();
        
        obj.accept();
        obj.display();
    }
}
