package core8;

public class StaticMethod {
    static int Age;
    static String FirstName, LastName;
    public StaticMethod(String firstName, String lastName, int age) {
        FirstName = firstName;
        LastName = lastName;
        Age = age;
    }

    public static void Details()
    {
        System.out.println("First Name "+ FirstName);
        System.out.println("Last Name "+ LastName);
        System.out.println("Age is "+ Age);

    }
}
