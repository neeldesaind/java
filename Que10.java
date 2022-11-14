class Student
{
    String name;
    int roll, m1, m2, m3, total;
    Double per; 

    Student(String nm, int r, int ma1, int ma2, int ma3)
    {
        name = nm;
        roll = r;
        m1 = ma1;
        m2 = ma2;
        m3 = ma3;
    }

    void calculate()
    {
        total = m1 + m2 + m3;
        per = (m1 + m2 + m3)/3.0;
    }

    void displayData()
    {
        System.out.println("Student Name: " + name + "\nRoll Number: " + roll + "\nMarks1: " + m1 + "\nMarks2: " + m2 + "\nMarks3: " + m3 + "\nTotal: " + total + "\nPercentage: " + per);
    }

}

public class Que10
{
    public static void main(String args[])
    {
        Student s = new Student("ABC", 10, 98,99,100);
        s.calculate();
        s.displayData();
    }
}