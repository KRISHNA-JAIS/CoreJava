package core8;

import java.util.Scanner;

public class Eight {
    static int Age;
    static String FirstName, LastName;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter FirstName");
        FirstName = in.nextLine();

        System.out.println("Enter LastName");
        LastName = in.nextLine();

        System.out.println("Enter Age");
        Age = in.nextInt();

        StaticMethod s = new StaticMethod(FirstName , LastName , Age);
        s.Details();

    }
}
