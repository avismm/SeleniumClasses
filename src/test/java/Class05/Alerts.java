package Class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/javascript-alert-box-demo.php");
        //maximize windoww
        driver.manage().window().maximize();

        //finding the 'click' button
        WebElement alert1=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        Thread.sleep(2000);
        alert1.click();
        Thread.sleep(3000);

        //switching to the alert window and accepting the alert
        Alert alert=driver.switchTo().alert();
        alert.accept();
    }
}
