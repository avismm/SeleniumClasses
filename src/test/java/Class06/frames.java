package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

public class frames {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/handle-iframe.php");
        //maximize window
        driver.manage().window().maximize();

        //write down the topic
        //switch to the iframe
        driver.switchTo().frame(0);
        WebElement topic= driver.findElement(By.xpath("//input[@name='Topic']"));
        topic.sendKeys("Hello");

        //click on inner-frame checkbox
        driver.switchTo().frame("checkboxIframe");
        WebElement innerFrameCb= driver.findElement(By.xpath("//input[@type='checkbox']"));
        innerFrameCb.click();

        //select babycat from the dropdown
        //switch to default (main page)
        //driver.switchTo().defaultContent();
        //switching using web element method
        Thread.sleep(2000);
        WebElement frameX= driver.findElement(By.xpath("//iframe[@id='dropdownIframe']"));
        driver.switchTo().frame(frameX);

        //locate the dropdown web element select
        WebElement animals= driver.findElement(By.xpath("//select[@id='animals']"));
        //creating an object of the dropdown element
        Select sel=new Select(animals);
        sel.selectByVisibleText("Avatar");


    }
}
