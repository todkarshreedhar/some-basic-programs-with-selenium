package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
        Boolean selected = driver.findElement(By.xpath("//input[@type='checkbox'][1]")).isSelected();
        System.out.println(selected);
        driver.quit();
    }
}
