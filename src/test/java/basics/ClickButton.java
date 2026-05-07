package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickButton {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yahoo.com");
        driver.findElement(By.id("uh-sbq")).click();
        driver.findElement(By.id("uh-sbq")).sendKeys("OpenAI", Keys.ENTER);
        System.out.println("Search performed");

    }
}
