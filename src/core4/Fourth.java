package core4;

import java.util.Scanner;

public class Fourth
{
    public static void main(String args[])
    {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String");
        str = in.nextLine();
        System.out.print("After reversing string is: ");
        int i = str.length();
        while(i>0)
        {
            System.out.print(str.charAt(i-1));
            i--;
        }
    }
}