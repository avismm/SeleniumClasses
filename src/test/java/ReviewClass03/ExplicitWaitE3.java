package ReviewClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utils.CommonMethods;

import java.time.Duration;

public class ExplicitWaitE3 extends CommonMethods {
    public static void main(String[] args) {
        String url="http://35.175.58.98/synchronization-explicit-wait.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        //finding the changetext button to click on
        WebElement changeTxtBtn=driver.findElement(By.xpath("//button[@id='changetext_button']"));
        changeTxtBtn.click();


        //Wait until the text has changed in the element
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Ssyntaxtechs']")));

       //find the element and display the text
        String text=driver.findElement(By.xpath("//h2[text()='Ssyntaxtechs']")).getText();
        System.out.println(text);

    }
}
