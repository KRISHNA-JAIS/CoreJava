package core16;

class Fruit
{
    private int price;
    private String name;
    Fruit(int fPrice, String fName)
    {
        price = fPrice;
        name = fName;
    }
    //creating a copy constructor
    Fruit(Fruit fruit)
    {
        System.out.println("After invoking the Copy Constructor:");
        price = fruit.price;
        name = fruit.name;
    }

    int showPrice()
    {
        return price;
    }

    String showName()
    {
        return name;
    }

    public static void main(String args[])
    {
        Fruit f1 = new Fruit(100, "Mango");
        System.out.println("Name of the first fruit: "+ f1.showName());
        System.out.println("Price of the first fruit: "+ f1.showPrice());
        //passing the parameters to the copy constructor
        Fruit f2 = new Fruit(f1);
        System.out.println("Name of the second fruit: "+ f2.showName());
        System.out.println("Price of the second fruit: "+ f2.showPrice());
    }
}
