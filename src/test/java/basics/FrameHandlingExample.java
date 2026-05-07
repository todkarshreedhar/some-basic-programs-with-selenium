package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FrameHandlingExample
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        driver.findElement(By.id("tinymce")).sendKeys("Selenium Frame Handling");
        System.out.println("Text entered inside iframe");
        driver.switchTo().defaultContent();
        String heading = driver.findElement(By.tagName("h3"))
                .getText();
        System.out.println("Main Page Heading: " + heading);

        driver.quit();
    }
}
