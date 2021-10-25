package core1;

import java.util.Scanner;

public class First {
    public static boolean StringPop(String str)
    {
        int i;
        for(i = 0 ; i < str.length()-2 ; i++)
        {
            if(str.charAt(i) == 'p' & str.charAt(i+2) == 'p')
            {
                return true;
            }
        }
        return false;
    }
    public  static  void  main(String[] ars)
    {
        String str1;
        System.out.println("Enter String");
        Scanner in = new Scanner(System.in);
        str1 = in.next();
        System.out.println("String contains p?p = "+ StringPop(str1));
    }
}
