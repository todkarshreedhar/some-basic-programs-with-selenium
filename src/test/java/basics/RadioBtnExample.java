package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtnExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        driver.findElement(By.id("impressiveRadio")).click();
        String result = driver.findElement(By.className("text")).getText();
        if(result.equals("Impressive"))
        {
            System.out.println("Impressive Radio button is selected");
        }
        else
        {
            System.out.println("Radio button is not selected");
        }
        driver.quit();

    }
}
