package oops.concepts;



public class ClassAndObjectTest {
    public static void main(String[] args) {
        ClassAndObject obj = new ClassAndObject();
        obj.browserName = "Chrome";
        obj.launchBrowser();
        obj.openUrl("https://www.google.com");
        obj.closeBrowser();

    }
}
