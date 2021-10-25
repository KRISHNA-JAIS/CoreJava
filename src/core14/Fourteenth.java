package core14;

// ClassNotFoundException
public class Fourteenth {

    public static void main(String args[]) {
        try
        {
            Class.forName("Test");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
}

