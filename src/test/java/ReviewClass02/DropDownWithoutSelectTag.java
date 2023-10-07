package ReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropDownWithoutSelectTag {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/no-select-tag-dropdown-demo.php");

        //maximize windoww
        driver.manage().window().maximize();
        WebElement DD = driver.findElement(By.xpath("//div[@data-toggle='dropdown']"));
        DD.click();

        Thread.sleep(2000);
        //find the list of element based on their parent and looping through them
        List<WebElement> options = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
        for(WebElement option:options){
            //getting the appropriate locator of the web element (e.g., by tag, test, etc) that
            //we will use to find the right element.
            String text=option.getText();
            if(text.equalsIgnoreCase("Peru")){
                option.click();
                break;
            }

        }




    }
}
