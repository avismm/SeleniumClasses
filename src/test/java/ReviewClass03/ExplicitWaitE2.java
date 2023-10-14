package ReviewClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;

public class ExplicitWaitE2 extends CommonMethods {
    public static void main(String[] args) {
        String url="http://35.175.58.98/synchronization-explicit-wait.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        //finding the checkbox button to click on
        WebElement displayBtn=driver.findElement(By.xpath("//button[@id='display_button']"));
        displayBtn.click();


        //Checking whether the button has been selected
        //Note: In this example, we need an explicit wait as the web element (button) is already there in the DOM
        //Wait until the button has been displayed
        //get the state of the button
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[text()='Enabled']"))));

        //checking whether the checkbox is selected
        WebElement button=driver.findElement(By.xpath("//button[text()='Enabled']"));
        System.out.println(button.isDisplayed());

    }
}
