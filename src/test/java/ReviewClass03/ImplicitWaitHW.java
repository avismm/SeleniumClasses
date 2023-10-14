package ReviewClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class ImplicitWaitHW extends CommonMethods {
    public static void main(String[] args) {
        String url="http://35.175.58.98/synchronization-waits.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
//Note: In this example, we need an implicit wait. This wait function has already been implemented in common methods.
        //finding the button to click on
        WebElement button2=driver.findElement(By.xpath("//button[@id='show_text_synchronize_02']"));
        button2.click();
//find radio button and click on it
        WebElement radioBtn=driver.findElement(By.xpath("//input[@value='Male']"));
        radioBtn.click();
    }
}
