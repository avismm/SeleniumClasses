package Class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsTextInput {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/javascript-alert-box-demo.php");
        //maximize windoww
        driver.manage().window().maximize();

        //finding the button
        WebElement alert2=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        Thread.sleep(2000);
        alert2.click();
        Thread.sleep(3000);

        //switching to the alert window and accepting the alert
        Alert alert=driver.switchTo().alert();
        Thread.sleep(3000);
        alert.sendKeys("Am testing selenium");
        Thread.sleep(3000);
        alert.accept();

        //finding the button
        WebElement alert3=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        Thread.sleep(2000);
        alert3.click();
        Thread.sleep(3000);

        alert.dismiss();


    }
}
