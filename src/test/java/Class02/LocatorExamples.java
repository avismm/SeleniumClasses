package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExamples {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        driver.manage().window().maximize();

        WebElement userName=driver.findElement(By.id("txtUsername"));
        userName.sendKeys("amuwerane");

        //clear textbox and resend username
        userName.clear();
        Thread.sleep(2500);
        userName.sendKeys("Admin");

        //password
        WebElement password=driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");

        WebElement clickBtn=driver.findElement(By.id("btnLogin"));
        clickBtn.click();

        WebElement welcomeLink=driver.findElement(By.linkText("Welcome Admin"));
      String msg= welcomeLink.getText();
        System.out.println("The message is: "+msg);





    }
}
