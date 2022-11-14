import java.util.*;

public class Que3{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Original String: ");
        String originalstr = sc.nextLine();
        sc.close();

        String words[] = originalstr.split("\\s");
        String reversedString = "";

        //reverse each word position

        for(int i = 0; i < words.length ; i++)
        {
            if(i == words.length - 1)
            {
                reversedString = words[i] + reversedString;
            }
            else
            {
                reversedString = " " + words[i] + reversedString;
            }
        }

        System.out.println("Reversed String: " + reversedString);
    }
}