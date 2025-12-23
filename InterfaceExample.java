interface Payment {
    void pay();
}

class UpiPayment implements Payment {
    public void pay() {
        System.out.println("Payment via UPI");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Payment p = new UpiPayment();
        p.pay();
    }

}
