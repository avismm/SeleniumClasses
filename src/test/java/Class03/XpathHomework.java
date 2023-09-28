package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathHomework {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        Thread.sleep(3000);
        //finding the text box element using xpath and sending username
        WebElement username=driver.findElement(By.xpath("//input[@id='userName']"));
        username.sendKeys("amuhwerane");

        //finding the text box element using xpath and sending display name
        WebElement email=driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.sendKeys("Avis");

        //finding the text box element using xpath and sending security question
        WebElement currentAddress=driver.findElement(By.xpath("//textarea[contains(@placeholder,'Address') and @id='currentAddress']"));
        currentAddress.sendKeys("7th Street Industrial Area?");

        //finding the text box
        WebElement parmanentAddress=driver.findElement(By.xpath("//textarea[contains(@class,'control') and @id='permanentAddress']"));
        parmanentAddress.sendKeys("Ho Chi Minh City Vietnam");

        Thread.sleep(3000);
        //finding the text box element using xpath and printing some text
        WebElement button=driver.findElement(By.xpath("//button[@id='submit' and @type='button']"));
        button.click();

      /*  //finding the text box
        WebElement email1=driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        email1.sendKeys("email1");

        //finding the text box
        WebElement email2=driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        email2.sendKeys("email2");

        //finding the text box
        WebElement email3=driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        email3.sendKeys("email3");

        //finding the text box
        WebElement field1=driver.findElement(By.xpath("//input[@data-detail='one' and @name='customField']"));
        field1.sendKeys("field1");

        //finding the text box
        WebElement field2=driver.findElement(By.xpath("//input[@data-detail='two' and @name='customField']"));
        field2.sendKeys("field2");*/
    }
}
