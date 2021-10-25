package core22;

public class CheckDigit {
    static int i,length;
    long sum,digit;
    public void fun(long num)
    {
        length = String.valueOf(num).length();

        if(length <= 9)
        {

            while (num > 0)
            {
                digit = num % 10;
                sum = sum + digit;
                num = num/10;
            }

            System.out.println("Sum of digit is "+ sum);

            if(sum % 10 ==0)
            {
                System.out.println("OKAY");
            }

            else
            {
                System.out.println("NOT OKAY");
            }
        }

        else
        {
            System.out.println("Length Exceeded");
        }
    }

}
