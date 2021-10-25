package core15;

class Singleton {
    // WAP to create a singleton class.
    // Static variable single_instance of type Singleton
    private static Singleton single_instance = null;

    // Declaring a variable of type String
    public String s;
    private Singleton()
    {
        s = "Hello I am a string part of Singleton class";
    }
    // Static method to create instance of Singleton class
    public static Singleton Singleton()
    {
        // To ensure only one instance is created
        if (single_instance == null) {
            single_instance = new Singleton();
        }
        return single_instance;
    }
}

