package oops.concepts;

public class PolymorphismChildClassCreditCard extends PolymorphismParentClassPayment {

    @Override
    void pay() {
        System.out.println("Paid using Credit Card");
    }
    
}
