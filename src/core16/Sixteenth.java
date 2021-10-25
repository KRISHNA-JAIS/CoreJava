package core16;

class Sixteenth implements Cloneable{
    // WAP to show object cloning in java using cloneable and copy constructor both.
    int rollno;
    String name;

    Sixteenth(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String args[]){
        try{
            Sixteenth s1=new Sixteenth(101,"KRISHNA");

            Sixteenth s2=(Sixteenth)s1.clone();

            System.out.println(s1.rollno+" "+s1.name);
            System.out.println(s2.rollno+" "+s2.name);

        }catch(CloneNotSupportedException c){}

    }
}

