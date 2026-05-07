package oops.concepts;

public class PolymorphismChildClassUPI extends PolymorphismParentClassPayment {

    @Override
    void pay() {
        System.out.println("Paid using UPI");
    }
    
}
