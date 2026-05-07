package oops.concepts;

public class InterfaceTest {
    public static void main(String[] args) {
        InterfaceExample example;

        example = new InterfaceEmailNotification();
        example.sendNotification();

        example= new InterfaceSmsNotification();
        example.sendNotification();
    }
}
