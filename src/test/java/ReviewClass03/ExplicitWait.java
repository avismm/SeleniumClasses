package ReviewClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;

public class ExplicitWait extends CommonMethods {
    public static void main(String[] args) {
        String url="http://35.175.58.98/synchronization-explicit-wait.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        //finding the checkbox button to click on
        WebElement button2=driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        button2.click();


        //Checking whether the checkbox has been selected
        //Note: In this example, we need an explicit wait as the web element (checkbox) is already there in the DOM
        //Wait until the checkbox has been selected
        //get the state of the checkbox
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='checkbox']")));

        //checking whether the checkbox is selected
        WebElement checkBox=driver.findElement(By.xpath("//input[@id='checkbox']"));
        System.out.println(checkBox.isSelected());

    }
}
