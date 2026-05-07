package oops.concepts;

public class PolymorphismTest {
    //PolymorphismChildClassUPI
    //method overriding
    //runtime polymorphism

    public static void main(String[] args) {
        PolymorphismParentClassPayment payment;
        payment = new PolymorphismChildClassUPI();
        payment.pay();
        payment = new PolymorphismChildClassCreditCard();
        payment.pay();


    }
}
