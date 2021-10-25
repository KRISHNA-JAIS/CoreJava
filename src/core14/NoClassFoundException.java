package core14;


    class Test1 {
        public void show() {
            System.out.println("show() method called");
        }
    }

public class NoClassFoundException {
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.show();
    }
}

