package oops.concepts;

public class ClassAndObject {

        String browserName;

        void launchBrowser()
        {
            System.out.println("Launching Browser: "+ browserName);
        }
        void openUrl(String url)
        {
            System.out.println("Opening URL: "+ url);
        }

        void closeBrowser()
        {
            System.out.println("Closing Browser");
        }

}
