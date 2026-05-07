package oops.concepts;

public class EncapsulationTest {


    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.deposit(5000);
        obj.deposit(5000);
        obj.withdraw(2);
        System.out.println("Balance: " + obj.getBalance());

    }

}
