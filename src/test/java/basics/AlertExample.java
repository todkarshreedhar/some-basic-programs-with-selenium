package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample
{
    public static void main(String[] args) {
        WebDriver driver  = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
        driver.switchTo().alert().dismiss();

        driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("SKT");
        alert.accept();


        String resultText = driver.findElement(By.id("result")).getText();

        if(resultText.contains("SKT")) {
            System.out.println("Alert handled successfully!");
        }

        driver.quit();
    }
}
