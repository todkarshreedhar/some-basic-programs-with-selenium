package oops.concepts;

public class InheritanceTest {

//            | Selenium      | OOP Concept |
//            | ------------- | ----------- |
//            | WebDriver     | Parent      |
//            | ChromeDriver  | Child       |
//            | FirefoxDriver | Child       |

    public static void main(String[] args) {
        InheritanceChildClassChrome chrome = new InheritanceChildClassChrome();
        chrome.start();
        chrome.openChrome();
        InheritanceChildClassFirefox firefox = new InheritanceChildClassFirefox();
        firefox.start();
        firefox.openFirefox();


    }
}
