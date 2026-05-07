package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorExample {

    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com");
        WebElement password = driver.findElement(By.name("pass"));
        WebElement email = driver.findElement(with(By.tagName("input"))
                .above(password));
        email.sendKeys("test@gmail.com");
        System.out.println("Email address is: " + email.getAttribute("value"));
        driver.quit();
    }



}
