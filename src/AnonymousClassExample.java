@FunctionalInterface
interface Payment{
    void pay();
}

public class AnonymousClassExample {

    static void makePayment(Payment payment){
        payment.pay();
    }

    public static void main(String[] args) {
         makePayment(new Payment() {
             @Override
             public void pay() {
                 System.out.println("Payment made using Anonymous Class");
             }
         });

         //we can provide lambda expressions as well here
        makePayment(() ->{
            System.out.println("Payment made using Anonymous Class with lambda expression");
        });
    }
}
