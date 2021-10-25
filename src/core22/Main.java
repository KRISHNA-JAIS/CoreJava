package core22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1-9 digit number");
        number = in.nextInt();
        CheckDigit c = new CheckDigit();
        c.fun(number);

    }
}
