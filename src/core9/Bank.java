package core9;

public class Bank {
    public static void main(String[] args) {

        SBI sbi = new SBI();
        sbi.getDetails();

        BOI boi = new BOI();
        boi.getDetails();

        ICICI icici = new ICICI();
        icici.getDetails();

    }

}
