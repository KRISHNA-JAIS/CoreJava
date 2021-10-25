package core5;

import java.util.Scanner;

public class Fifth {
    public static long firstFactorial(int num)
    {
        if(num == 0 )
        {
           return 1;
        }
        else
        {
            return num * firstFactorial(num-1);
        }
    }
    public static void main(String[] args)
    {
     int input;
     System.out.println("Enter Number");
     Scanner in = new Scanner(System.in);
     input = in.nextInt();
     System.out.println("Factorial of given number is = "+ firstFactorial(input));
    }
}
