package Class7Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Utils.CommonMethods;

import java.time.Duration;

public class Facebook extends CommonMethods {
    public static void main(String[] args) {

        String url="https://www.facebook.com/";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//        find the button create new account
        WebElement createNewAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAccount.click();

//        fill in the first name
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("moazzam");
    }

}
