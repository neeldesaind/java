import java.util.*;
public class Que1 
{   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        s = s.replaceAll("\\s", "");
        
        char str[] = s.toCharArray();
        int len = s.length();
        
        int solcount=0, tempcount=0;
        char sol=str[0], temp=str[0];
        
        for(int i=0; i < s.length(); i++)
        {
            if(tempcount > solcount)
            {
                solcount = tempcount;
                sol = temp;
            }
           
            temp = str[i]; 
            tempcount = 1;           
            
            for(int j=i+1; j<s.length(); j++)
            {
                if(temp == str[j])
                {
                    tempcount += 1;
                }
            }
        }
        
        System.out.println("Most occuring character is " + sol);
    }
    
}
